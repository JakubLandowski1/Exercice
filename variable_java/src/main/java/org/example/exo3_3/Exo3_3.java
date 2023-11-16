package org.example.exo3_3;

import java.util.Scanner;

public class Exo3_3 {

    public static void getReadWrite() {

        Scanner scannerNom = new Scanner(System.in);
        System.out.println("Quel est votre prénom ?");
        String nom = scannerNom.next();


        Scanner scannerNomDeux = new Scanner(System.in);
        System.out.println("Quel est votre prénom ?");
        String nomDeux = scannerNomDeux.next();


        Scanner scannerNomTrois = new Scanner(System.in);
        System.out.println("Quel est votre prénom ?");
        String nomTrois = scannerNomTrois.next();


        if (nom.compareTo(nomDeux) <= 0 || (nomDeux.compareTo(nomTrois)) <= 0 ) {
            System.out.println("C'est  dans l'ordre ") ;

        } else {System.out.println("C'est pas dans l'ordre ") ;}
    }
}
