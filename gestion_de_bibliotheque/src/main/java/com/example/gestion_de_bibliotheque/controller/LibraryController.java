package com.example.gestion_de_bibliotheque.controller;

import com.example.gestion_de_bibliotheque.entity.Book;
import com.example.gestion_de_bibliotheque.service.BookService;
import org.springframework.web.bind.annotation.*;

@RestController
public class LibraryController {

    private BookService bookService;

    public LibraryController(BookService bookService) {
        this.bookService = bookService;
    }

    @PostMapping("/post")
    public Book postBook(@RequestBody Book book) {
        bookService.createBook(book);
        return book;
    }

    @DeleteMapping("/delete/{id}")
    public void deleteBook(@PathVariable("id") String id) {
        System.out.println("book deleted");
        bookService.deleteBook(id);
    }

    @GetMapping("/get/{id}")
    public Book getBookById(@PathVariable("id") String id) {
        return bookService.getBook(id);
    }
}
