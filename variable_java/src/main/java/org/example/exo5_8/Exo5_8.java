package org.example.exo5_8;

import java.util.Scanner;

public class Exo5_8 {
    public static void getReadWrite() {

        int result = 1;
        Scanner scannerNombre = new Scanner(System.in);
        System.out.println("Donnez un nombre");
        int nombre = scannerNombre.nextInt();

        for (int i = 1; i <= nombre; i++) {
            result = result * i;
        }
        System.out.println(result);
    }
}
