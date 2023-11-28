package org.example.Class;

public class PaperBook extends Book{

    public int pageNumber ;
    public String publishingHouse;

    public PaperBook(String title, String author, int pageNumber, String publishingHouse) {
        super(title, author);
        this.pageNumber = pageNumber;
        this.publishingHouse = publishingHouse;
    }
}
