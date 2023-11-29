package org.example.Class.Invoice;

import org.example.Class.Article.Item;
import org.example.Class.Client.Client;

import java.time.LocalDate;

public class Invoice {

    protected String nameClient;
    private static int nextId = 1;
    LocalDate date ;
    protected int id;
    protected int lineQuantity;


    public Invoice(Client client) {
        nameClient = client.name;
        this.id = nextId++;
        this.date = LocalDate.now();
    }

    public void addLine(Item item, int lineQuantity) {

    }


    public void getTotalPrice () {
         
    }
}
