package org.example.Class;

public class NumBook extends Book{

    public String format;
    public int size;

    public NumBook(String title, String author, String format, int size) {
        super(title, author);
        this.format = format;
        this.size = size;
    }




}
