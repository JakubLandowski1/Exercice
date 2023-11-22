package org.example.poo.TpClasseHeritage2;

public class Door {


    public Door(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String color;

    public void display() {
        System.out.printf("Je suis une porte ma couleur est de %s ", color);
    }

}
