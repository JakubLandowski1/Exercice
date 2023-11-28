package org.example.Class;

public class Book {
    private static int nextId = 1;

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String title;
    public String author;
    public int id;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.id = nextId++;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", id=" + id +
                '}';
    }

    public String displayBook() {
        return "Title : "  + title + "\n"
                + "Author" + author
                ;
    }

}
