package org.example.poo.TpClasseHeritage2;

import org.example.poo.TpClasseChaise.Chaises;

public class Main {


        public static void main(String[] args) {



            Door door = new Door("blue");
            Apartment apartment = new Apartment(door);
            Person personne = new Person("Landowski",apartment );
            personne.display();


        }
}
