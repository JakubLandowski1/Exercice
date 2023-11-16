package org.example.exo5_7;

import java.util.Scanner;

public class Exo5_7 {
    public static void getReadWrite() {
        int tamp = 0;

        for (int i = 1; i < 5 ; i++) {


            Scanner scannerNombre = new Scanner(System.in);
            System.out.println("Donnez un nombre");
            int nombre = scannerNombre.nextInt();
            if (tamp < nombre) {
                tamp = nombre ;
            }
        }
        System.out.println(tamp);
    }
}
