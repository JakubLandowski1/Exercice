package org.example.stringExo;

import java.util.Arrays;

public class Comptage {


    public static void getReadWrite() {
        String s = "  ceci est une phrase plus longue ";

        if (s.startsWith(" ")) {
            s.substring(1);
        }

        String[] mots = s.trim().split("\\s+");
        int taille = mots.length;
        System.out.println(taille);


    }
}
