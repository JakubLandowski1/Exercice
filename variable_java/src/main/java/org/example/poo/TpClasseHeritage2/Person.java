package org.example.poo.TpClasseHeritage2;

public class Person {

    public House house;
    public String nom;

    public Person(String nom, House house) {
        this.house = house;
        this.nom = nom;
    }

    public void display() {
        System.out.printf("Je m'appele %s \n", nom);
        house.display();
        house.door.display();
    }
}
