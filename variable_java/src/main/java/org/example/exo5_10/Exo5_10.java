package org.example.exo5_10;

import java.util.Scanner;

public class Exo5_10 {
    public static void getReadWrite() {
        int result = 0;

        int nombre = 1;

        while (nombre != 0) {

            Scanner scannerNombre = new Scanner(System.in);
            System.out.println("Donnez un nombre");
            nombre = scannerNombre.nextInt();

                result = result + nombre;

        }
        System.out.println("A payer : " + result);

        Scanner scannerPrix = new Scanner(System.in);
        System.out.println("Entrez une somme d'argent");
        int sommeP = scannerPrix.nextInt();

        result = sommeP - result;
        System.out.println(result);
    }


}
