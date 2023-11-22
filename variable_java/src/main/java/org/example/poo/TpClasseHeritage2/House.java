package org.example.poo.TpClasseHeritage2;

public class House {
    public int getSurface() {
        return surface;
    }

    public void setSurface(int surface) {
        this.surface = surface;
    }

    public int surface;
    public Door door;

    public House (int surface, Door door) {
        this.door = door;
        this.surface= surface;
    }

    public void display() {
        System.out.printf("Je suis une maison ma surface est de %d m² \n", surface);
    }

    public void getDoor() {
        door.display();
    }
}
