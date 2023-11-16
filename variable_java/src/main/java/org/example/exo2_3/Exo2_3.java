package org.example.exo2_3;

import java.util.Scanner;

public class Exo2_3 {
    public static void getReadWrite() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Quel est votre prénom ?");
        String nom = scanner.next();
        System.out.println("Bonjour, " + nom + " !") ;

    }
}
