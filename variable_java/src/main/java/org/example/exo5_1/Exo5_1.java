package org.example.exo5_1;

import java.util.Scanner;

public class Exo5_1 {
    public static void getReadWrite() {

        Scanner scannerNombre = new Scanner(System.in);
        System.out.println("Donnez un nombre entre 1 et 3");
        short nombre = scannerNombre.nextShort();

        while (nombre > 3 || nombre <1 ) {
            System.out.println("Donnez un nombre entre 1 et 3");
            nombre = scannerNombre.nextShort();
            System.out.println("Merci");
        }


    }
}
