package org.example.tab_exo7;

import java.util.Random;

public class Tab_exo7 {

    public static void getReadWrite() {

        int[] tab = new int[10];


        Random random = new Random();
        for (int i = 0; i < tab.length; i++) {
            tab[i] = random.nextInt(100) + 1;
        }


        System.out.println("Les éléments du tableau sont :");
        displayTab(tab);


        int plusGrandElement = tab[0];
        for (int i = 1; i < tab.length; i++) {
            if (tab[i] > plusGrandElement) {
                plusGrandElement = tab[i];
            }
        }


        System.out.println("\nLe plus grand élément du tableau est : " + plusGrandElement);
    }


    public static void displayTab(int[] tableau) {
        for (int i = 0; i < tableau.length; i++) {
            System.out.print(tableau[i] + " ");
        }
        System.out.println();
    }


}
