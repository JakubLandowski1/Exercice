package org.example.exo3_6;

import java.util.Scanner;

public class Exo3_6 {
    public static void getReadWrite() {

        Scanner scannerNombre = new Scanner(System.in);
        System.out.println("Donnez un nombre entier:");
        int nombre = scannerNombre.nextInt();

        if (nombre % 3 == 0) {
            System.out.println("Le nombre est divisible par 3");

        } else {

            System.out.println("Le nombre n'est pas divisible par 3");
        }
    }
}
