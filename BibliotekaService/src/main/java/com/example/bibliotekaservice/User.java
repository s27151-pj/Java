package com.example.bibliotekaservice;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

public class User {
    private int readerId;
    private  String readerName;
    private List<Book> rentedBooks;

    public User() {
        this.rentedBooks = new ArrayList<>();
    }

    public void addRentedBook(Book book) {
        rentedBooks.add(book);
    }
    public void removeRentedBook(Book book) {
        rentedBooks.remove(book);
    }

    public User(int readerId, String readerName, List<Book> rentedBooks) {
        this.readerId = readerId;
        this.readerName = readerName;
        this.rentedBooks = rentedBooks;
    }

    public void addBook(Book book) {
        rentedBooks.add(book);
    }

    public int getReaderId() {
        return readerId;
    }

    public void setReaderId(int readerId) {
        this.readerId = readerId;
    }

    public String getReaderName() {
        return readerName;
    }

    public void setReaderName(String readerName) {
        this.readerName = readerName;
    }

    public List<Book> getRentedBooks() {
        return rentedBooks;
    }

    public void setRentedBooks(List<Book> rentedBooks) {
        this.rentedBooks = rentedBooks;
    }
}
