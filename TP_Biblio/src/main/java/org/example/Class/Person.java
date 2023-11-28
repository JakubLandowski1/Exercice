package org.example.Class;

public class Person {
    public static int nextId = 1;
    public int id;
    public String firstname;
    public String lastname;
    public Person(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.id = nextId++;
    }


    public String toString() {
        return "Name : " + lastname + firstname;
     }
}
