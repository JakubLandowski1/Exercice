package org.example.tab_exo4;

import java.util.Scanner;

public class Tab_exo4 {

    public static void getReadWrite() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez la taille du tableau : ");
        int taille = scanner.nextInt();


        int[] tab = new int[taille];


        System.out.println("Entrez les nombres dans le tableau :");
        for (int i = 0; i < taille; i++) {
            System.out.print("Élément " + (i + 1) + " : ");
            tab[i] = scanner.nextInt();
        }


        boolean pairs = true;
        for (int i = 0; i < taille; i++) {
            if (tab[i] % 2 != 0) {
                pairs = false;
                break;
            }
        }


        if (pairs) {
            System.out.println("Tous les éléments sont pairs.");
        } else {
            System.out.println("Au moins un élément est impair.");
        }
    }

}
