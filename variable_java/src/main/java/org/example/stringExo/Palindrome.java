package org.example.stringExo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Palindrome {

    public static void getReadWrite() {
        String mot = "kayak";
        char[] tab = mot.toCharArray();
        char [] newTab= new char[tab.length];
        boolean etat = false;

        for (int i = 0; i < tab.length; i++) {
            newTab[tab.length- 1-i] = tab[i];
        }

        for (int i = 0; i < tab.length; i++) {
            if (tab[i] != newTab[i]) {
                etat = false;
            } else {
                etat= true;
            }
        }

        if (etat) {
            System.out.println("c'est un palindrome");
        } else {
            System.out.println("c'est pas un palindrome");
        }




    }

}
