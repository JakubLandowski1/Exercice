package org.example.exo5_9;

import java.util.Scanner;

public class Exo5_9 {
    public static void getReadWrite() {

        int result = 1;

        int nombre = 1;

        while (nombre != 0) {

            Scanner scannerNombreBoucle = new Scanner(System.in);
            System.out.println("Donnez un nombre");
            nombre = scannerNombreBoucle.nextInt();
            result =1 ;

            if (nombre != 0) {

              result = nombre ;
                System.out.println(result);
            } else {
                System.out.println();
            }



        }
    }
}
