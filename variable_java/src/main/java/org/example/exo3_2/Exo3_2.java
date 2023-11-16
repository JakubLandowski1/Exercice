package org.example.exo3_2;

import java.util.Scanner;

public class Exo3_2 {


    public static void getReadWrite() {

        Scanner scannerNombre = new Scanner(System.in);
        System.out.println("Donnez un premier nombre :");
        int nombre = scannerNombre.nextInt();

        Scanner scannerNombreDeux = new Scanner(System.in);
        System.out.println("Donnez un second nombre :");
        int nombreDeux = scannerNombreDeux.nextInt();

        if (nombre * nombreDeux == 0) {
            System.out.println("Ce nombre est nulle");
        } else if (nombre * nombreDeux>0) {
            System.out.println("Ce nombre est positif");
        } else {
            System.out.println("Ce nombre est négatif");
        }

    }

}
