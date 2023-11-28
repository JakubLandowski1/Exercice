package org.example.Class;

import java.util.ArrayList;
import java.util.List;


public class Library {

    List<Loan> loans = new ArrayList<>();
    List<Book> books = new ArrayList<>();
    List<Book> foundBooksByAuthor = new ArrayList<>();
    List<Book> foundBooks = new ArrayList<>();


    public void addBook(Book book) {
        books.add(book);
    }

    public void deleteBook(int idBook) {
        books.remove(idBook);
    }

    public Book foundBookByTitle(String title) {
        for (int i = 0; i < books.size(); i++) {
            for (Book book : books) {
                if (book.getTitle().equals(title)) {
                    return book;
                }
            }
        }
        return null;
    }

    public Book foundBookByAuthor(String author) {

        for (Book book : books) {
            if (book.getAuthor().equals(author)) {
                foundBooksByAuthor.add(book);
            }
        }

        return null;
    }

    public void loanBook(String idBook, Person person) {
    }
}
