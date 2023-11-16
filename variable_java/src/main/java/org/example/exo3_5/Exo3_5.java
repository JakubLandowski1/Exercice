package org.example.exo3_5;

import java.util.Scanner;

public class Exo3_5 {
    public static void getReadWrite() {
        Scanner scannerAge = new Scanner(System.in);
        System.out.println("Donnez l'age :");
        int age = scannerAge.nextInt();

        if (age >= 6 && age <= 7) {
            System.out.println("Catégorie : Poussin.");
        } else if (age >= 8 && age <=9) {
            System.out.println("Ctaégorie : Pupille.");
        } else if (age >= 10 && age <=11) {
            System.out.println("Catégorie : Minime.");
        } else if (age >= 12 && age <=17) {
            System.out.println("Catégorie : Cadet.");
        } else {
            System.out.println("Rentre pas dans une catégorie.");
        }

    }
}
