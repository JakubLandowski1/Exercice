package org.example.tab_exo6;

import java.util.Random;

public class Tab_exo6 {
    public static void getReadWrite() {
        int t=5;

        int[] tab = new int[t];
        int[] tabDeux = new int[t];


        Random random = new Random();
        for (int i = 0; i < tab.length; i++) {
            tab[i] = random.nextInt(100) + 1;
            tabDeux[i] = random.nextInt(100) + 1;
        }



        System.out.println("Les éléments du tableau sont :");
        for (int i = 0; i < tab.length; i++) {
            System.out.println(tab[i]);
            System.out.println(tab[i]);
        }

        int somme = 0;
        for (int i = 0; i < t; i++) {
            somme += tab[i] + tabDeux[i];
        }
        System.out.println("\nLa somme des éléments des deux tableaux est : " + somme);
    }
}
