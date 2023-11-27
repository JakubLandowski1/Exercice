package org.example.tpHotel;

public class Client {
    private static int nextId = 1;
    public int id;
    public String name;
    public String firstname;
    public String tel;


    public Client( String name, String firstname, String tel) {
        this.id = nextId++;
        this.name = name;
        this.firstname = firstname;
        this.tel = tel;
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getTel() {
        return tel;
    }
}
