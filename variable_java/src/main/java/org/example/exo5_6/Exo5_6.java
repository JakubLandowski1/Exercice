package org.example.exo5_6;

import java.util.Scanner;

public class Exo5_6 {
    public static void getReadWrite() {

        Scanner scannerNombre = new Scanner(System.in);
        System.out.println("Donnez un nombre");
        int nombre = scannerNombre.nextShort();
        int result = 0;

        for (int i = 0; i <= nombre ; i++) {
            result+=i;


        }
        System.out.println(result);
    }
}
