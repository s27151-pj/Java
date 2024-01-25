package com.example.bibliotekaservice;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component

public class BookStorage {
    private List<Book> bookList;
    public BookStorage(){
        this.bookList = new ArrayList<>();
    }
    public void addBook(Book book) {
        bookList.add(book);
    }
    public List<Book> getBookList() {
        return bookList;
    }
    public void clearData() {
        bookList.clear();
    }

}
