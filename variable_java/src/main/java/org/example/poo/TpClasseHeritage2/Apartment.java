package org.example.poo.TpClasseHeritage2;

public class Apartment extends House{


    public Apartment(Door door) {

        super(50, door);
    }

    public void display() {
        System.out.printf("Je suis un appartement ma surface est de %d m²\n", surface);
    }
}
