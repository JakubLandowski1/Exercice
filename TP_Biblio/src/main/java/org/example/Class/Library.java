package org.example.Class;

import java.util.ArrayList;
import java.util.List;


public class Library {

    ArrayList<Loan> loans = new ArrayList<>();
    ArrayList<Book> books = new ArrayList<>();
    ArrayList<Book> foundBooksByAuthor = new ArrayList<>();



    public void addBook(Book book) {
        books.add(book);
    }

    public void deleteBook(int idBook) {
        books.remove(idBook);
    }

    public ArrayList<Book> foundBookByTitle(String title) {
        ArrayList<Book> foundBooks = new ArrayList<>();

            for (Book book : books) {
                if (book.getTitle().equals(title)) {
                    foundBooks.add(book);
                }
            }

        return foundBooks;
    }

    public ArrayList<Book> foundBookByAuthor(String author) {
        ArrayList<Book> foundBooksByAuthor = new ArrayList<>();

        for (Book book : books) {
            if (book.getAuthor().equals(author)) {
                foundBooksByAuthor.add(book);
            }
        }

        return foundBooksByAuthor;
    }

    public void loanBook(String idBook, Person person) {
    }
}
