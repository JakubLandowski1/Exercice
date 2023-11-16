package org.example.exo5_7_2;

import java.util.Scanner;

public class Exo5_7_2 {
    public static void getReadWrite() {
        int tamp = 0;
        int tampI = 0;

        for (int i = 1; i < 5 ; i++) {


            Scanner scannerNombre = new Scanner(System.in);
            System.out.println("Donnez un nombre");
            int nombre = scannerNombre.nextInt();
            if (tamp < nombre) {
                tamp = nombre ;
                tampI= i;
            }
        }
        System.out.println("Le nombre le plus grand est " + tamp + " il est en position " + tampI);
    }

}

