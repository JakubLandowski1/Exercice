package org.example.exo5_3;

import java.util.Scanner;

public class Exo5_3 {
    public static void getReadWrite() {
        Scanner scannerNombre = new Scanner(System.in);
        System.out.println("Donnez un nombre");
        short nombre = scannerNombre.nextShort();

        for (int i = 0; i < 10; i++) {
            System.out.println(nombre += 1);

        }
    }
}

