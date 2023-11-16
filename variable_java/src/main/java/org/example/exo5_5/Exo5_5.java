package org.example.exo5_5;

import java.util.Scanner;

public class Exo5_5 {
    public static void getReadWrite() {
        Scanner scannerNombre = new Scanner(System.in);
        System.out.println("Donnez un nombre");
        short nombre = scannerNombre.nextShort();

        for (int i = 1; i < 11; i++) {
            System.out.println(nombre + "x" +i + "="+  nombre*i);

        }

    }
}
