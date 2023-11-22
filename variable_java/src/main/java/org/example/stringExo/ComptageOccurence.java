package org.example.stringExo;

public class ComptageOccurence {

    public static void getReadWrite() {

        String mot = "Anagramme";
        String occurrence = "a";


        occurrence= occurrence.toUpperCase();
        int compteur = 0;
        char[] tabCarac = mot.toUpperCase().toCharArray();

        for (int i = 0; i < tabCarac.length; i++) {
            if (occurrence.equals(String.valueOf(tabCarac[i]))) {
                compteur++;
            }
        }
        System.out.println(compteur);



    }
}
