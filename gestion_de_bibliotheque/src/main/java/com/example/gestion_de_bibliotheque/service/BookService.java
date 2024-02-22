package com.example.gestion_de_bibliotheque.service;


import com.example.gestion_de_bibliotheque.entity.Book;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class BookService {
    private Map<String, Book> books = new HashMap<>();

    public void createBook(Book book) {
        if (books.containsKey(book.getId())) {
            throw new IllegalArgumentException("Book with ID " + book.getId() + " already exists");
        }
        books.put(book.getId(), book);
    }

    public void deleteBook(String bookId) {
        if (!books.containsKey(bookId)) {
            throw new IllegalArgumentException("Book with ID " + bookId + " does not exist");
        }

        books.remove(bookId);
    }

    public Book getBook(String bookId) {
        if (!books.containsKey(bookId)) {
            throw new IllegalArgumentException("Book with ID " + bookId + " does not exist");
        }
        return books.get(bookId);
    }

}
