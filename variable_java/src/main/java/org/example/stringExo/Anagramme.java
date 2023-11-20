package org.example.stringExo;

import java.util.Arrays;

public class Anagramme {

    public static void getReadWrite() {
        String  mot = "aubba";
        String  motDeux = "beau";

        char [] tab = mot.toCharArray();
        char [] tabDeux = motDeux.toCharArray();

        Arrays.sort(tab);
        Arrays.sort(tabDeux);

        int tailleTab = tab.length;
        int tailleTabdeux = tabDeux.length;
        boolean etat = true;

        if (tailleTabdeux == tailleTab) {
            for (int i = 0; i < tab.length; i++) {
                if (tab[i] != tabDeux[i]) {
                   etat =false;
                }
            }
        } else {
            etat= false;
        }
        if (etat) {
            System.out.println("c'est un anagramme");
        } else {
            System.out.println("c'est pas un anagramme");
        }


    }
}
