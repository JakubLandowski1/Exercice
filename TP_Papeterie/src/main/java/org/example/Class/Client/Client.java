package org.example.Class.Client;

public class Client {


    private static int nextId = 1;

    public String name;
    protected int id;

    public Client(String name) {
        this.name = name;
        this.id = nextId++;
    }



}
