package com.example.bibliotekaservice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.result.StatusResultMatchersExtensionsKt;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class BookServiceITest {

    @Autowired
    private BookService bookService;
    @Autowired
    private BookStorage bookStorage;
    @Autowired
    private UserDataStorage userDataStorage;

    @BeforeEach
    void clearData() {
        bookStorage.clearData();
        userDataStorage.clearData();
    }

    @Test
    void rentBook() {
        Book book1 = new Book(1, "Władca Pierścieni", "J.R.R. Tolkien", new Date(213123), "Fantasy", BookState.AVAILABLE);
        List<Book> rentedBooks = new ArrayList<>();
        User user1 = new User(1, "Jan Kowalski", rentedBooks);
        bookStorage.addBook(book1);
        userDataStorage.addUser(user1);

        String result = bookService.rentBook(1, 1);

        assertThat(result).isEqualTo("RENTED");

        assertThat(user1.getRentedBooks()).contains(book1);
    }

    @Test
    void returnBook() {
        Book book1 = new Book(1, "Władca Pierścieni", "J.R.R. Tolkien", new Date(213123), "Fantasy", BookState.AVAILABLE);
        List<Book> rentedBooks = new ArrayList<>();
        User user1 = new User(1, "Jan Kowalski", rentedBooks);
        bookStorage.addBook(book1);
        userDataStorage.addUser(user1);

        bookService.rentBook(1, 1);

        String result = bookService.returnBook(1, 1);

        assertThat(result).isEqualTo("RETURNED");

        assertThat(user1.getRentedBooks()).isEmpty();
    }

    @Test
    void checkBookStatus() {
        Book book1 = new Book(1, "Władca Pierścieni", "J.R.R. Tolkien", new Date(), "Fantasy", BookState.AVAILABLE);
        bookStorage.addBook(book1);

        BookState result = bookService.checkBookStatus(1);

        assertThat(result).isEqualTo(BookState.AVAILABLE);
    }
}