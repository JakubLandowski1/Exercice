package org.example.Class.Article;

public class Batch extends Item{

    protected String nameBatch;
    public int quantity;
    protected double batchPrice;


    public Batch(int quantity, Item item) {

        this.price = item.price;
        this.nameBatch = item.getName();
        this.quantity = quantity;

        if (quantity>20) {
            batchPrice = quantity * (price*0.8);
        } else if (quantity>10) {
            batchPrice = quantity * (price*0.9);
        }

    }
}
