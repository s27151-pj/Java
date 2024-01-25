package com.example.bibliotekaservice;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;
@Service
public class BookService {
    private final BookStorage bookStorage;
    private final UserDataStorage userDataStorage;


    public BookService(BookStorage bookStorage, UserDataStorage userDataStorage) {
        this.bookStorage = bookStorage;
        this.userDataStorage = userDataStorage;
    }
    public String rentBook(int bookID, int readerId) {
        Book book = findBookById(bookID);
        User user = findUserById(readerId);
        if (book.getBookState() == BookState.AVAILABLE) {
            book.setBookState(BookState.RENTED);
            user.addRentedBook(book);
        }
        return "RENTED";
    }
    public String returnBook(int bookID, int readerId) {
        Book book = findBookById(bookID);
        User user = findUserById(readerId);
        if (book.getBookState() == BookState.RENTED) {
            book.setBookState(BookState.AVAILABLE);
            user.removeRentedBook(book);
        }
        return "RETURNED";
    }
    public BookState checkBookStatus(int bookID) {
        Book book = findBookById(bookID);
        return book.getBookState();
    }
    public Book findBookById(int bookID) {
        Book book = null;
        for (Book b : bookStorage.getBookList()) {
            if (b.getBookID() == bookID) {
                book = b;
            }
        }
        if (book == null) {
            throw new NoSuchElementException();
        } else {
            return book;
        }
    }
    public User findUserById(int readerId) {
        User user = null;
        for (User u : userDataStorage.getuserList()) {
            if (u.getReaderId() == readerId) {
                user = u;
            }
        }
        if (user == null) {
            throw new NoSuchElementException();
        } else {
            return user;
        }
    }

}
