package org.example.exo5_2;

import java.util.Scanner;

public class Exo5_2 {
    public static void getReadWrite() {
        Scanner scannerNombre = new Scanner(System.in);
        System.out.println("Donnez un nombre entre 10 et 20");
        short nombre = scannerNombre.nextShort();

        while (nombre > 20 || nombre <10 ) {

            if (nombre >20) {
                System.out.println("Donnez un nombre plus petit");
                nombre = scannerNombre.nextShort();
            } else if (nombre <10) {
                System.out.println("Donnez un nombre plus grand");
                nombre = scannerNombre.nextShort();
            }

        }

        System.out.println("Merci");

    }


}
