package org.example.exo3_4;

import java.util.Scanner;

public class Exo3_4 {

    public static void getReadWrite() {
        Scanner scannerNombre = new Scanner(System.in);
        System.out.println("Donnez un nombre :");
        int nombre = scannerNombre.nextInt();

        if (nombre == 0) {
            System.out.println("Ce nombre est nulle");
        } else if (nombre>0) {
            System.out.println("Ce nombre est positif");
        } else {
            System.out.println("Ce nombre est négatif");
        }

    }
}
