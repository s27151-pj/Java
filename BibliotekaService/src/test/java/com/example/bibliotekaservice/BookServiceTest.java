package com.example.bibliotekaservice;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Collections;
import java.util.Date;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class BookServiceTest {
    @Mock
    private BookStorage bookStorage;
    @Mock
    private UserDataStorage userDataStorage;
    @InjectMocks
    private BookService bookService;



    @Test
    void testCheckBookStatus() {
        when(bookStorage.getBookList())
                .thenReturn(List.of(new Book(1, "Władca Pierścieni", "J.R.R. Tolkien", new Date(213123), "Fantasy", BookState.AVAILABLE)));
        BookState book1 = bookService.checkBookStatus(1);

        assertThat(book1).isEqualTo(BookState.AVAILABLE);
    }
}