package org.example.exo3_7;

import java.util.Scanner;

public class Exo3_7 {
    public static void getReadWrite() {

        Scanner scannerNombre = new Scanner(System.in);
        System.out.println("Quel est le nombre de photocopie ?");
        int nombre = scannerNombre.nextInt();

        if (nombre < 10) {
            System.out.println("Le prix est de" + nombre * 0.15);
        } else if (nombre > 10 && nombre < 20) {
            System.out.println("Le prix est de" + nombre * 0.10);
        } else {
            System.out.println("Le prix est de" + nombre * 0.5);
        }


    }
}

