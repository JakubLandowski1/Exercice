package org.example.Class.Article;

// sert de moule pour les articles (lot, stylo, ramette)
public abstract class Item {

    protected int id;

    private static int nextId = 1;
    protected double price;
    protected String name;



    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Item() {
        this.id = nextId++;
    }

    public Item(String name) {
        this.id = nextId++;
        this.name = name;

    }


}
