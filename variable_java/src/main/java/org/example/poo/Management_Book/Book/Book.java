package org.example.poo.Management_Book.Book;

import org.example.poo.Management_Book.Author.Author;
import org.example.poo.Management_Book.Enum.CoverType;
import org.example.poo.Management_Book.Publisher.Publisher;

import java.math.BigDecimal;
import java.util.Arrays;

public class Book {

    public int id;
    public String name;
    public Author[] auteurs;
    public Publisher publishers;

    public Book(int id, String name, Author[] auteurs, Publisher publishers, int publishingAnnee, int amountOfPages, BigDecimal prix, CoverType coverType) {
        this.id = id;
        this.name = name;
        this.auteurs = auteurs;
        this.publishers = publishers;
        this.publishingAnnee = publishingAnnee;
        this.amountOfPages = amountOfPages;
        this.prix = prix;
        this.coverType = coverType;
    }

    public int publishingAnnee;
    public int amountOfPages;
    public BigDecimal prix;
    public CoverType coverType;

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", auteurs=" + Arrays.toString(auteurs) +
                ", publishers=" + (publishers) +
                ", publishingAnnee=" + publishingAnnee +
                ", amountOfPages=" + amountOfPages +
                ", prix=" + prix +
                ", coverType=" + coverType +
                '}';
    }
}
