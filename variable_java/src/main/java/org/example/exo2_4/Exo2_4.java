package org.example.exo2_4;

import java.util.Scanner;

public class Exo2_4 {

    public static void getReadWrite() {


        Scanner scannerPrix = new Scanner(System.in);
        System.out.println("Quel est le prix de l'article :");
        double prix = scannerPrix.nextDouble();

        Scanner scannerNombre = new Scanner(System.in);
        System.out.println("Quel est le nombre d'article(s) :");
        Integer nombre = scannerNombre.nextInt();

        Scanner scannerTva = new Scanner(System.in);
        System.out.println("Quel est le taux de TVA de(s) article(s) :");
        double tva = scannerTva.nextDouble();
        tva = tva/100+1;
        double prixTotal = (prix * tva)*nombre ;


        System.out.println("Le prix ttc est :" + prixTotal );

    }
}
