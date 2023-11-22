package org.example.matrice;

import java.util.Arrays;
import java.util.Scanner;

public class MatriceExo_2 {
    public static void main(String[] args) {
        getReadWrite();
    }

    public static void getReadWrite() {
        int[][] tab = new int[4][5];
        Scanner scannerNombre = new Scanner(System.in);

        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                System.out.println("Donnez un nombre :");
                int nombre = scannerNombre.nextInt();
                tab[i][j] = nombre;
            }
        }

        System.out.println("Tableau original :");
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                System.out.print(tab[i][j] + " ");
            }
            System.out.println();
        }


        int somme = 0;
        int produitTotal = 1;

        for (int i = 0; i < tab.length; i++) {
            int produitLigne = 1;
            for (int j = 0; j < tab[i].length; j++) {
                produitLigne *= tab[i][j];
                somme += tab[i][j];
            }
            produitTotal *= produitLigne;
        }

        double moyenne = (double) somme / (tab.length * tab[0].length);

        System.out.println("Produit des éléments : " + produitTotal);
        System.out.println("Somme des éléments : " + somme);
        System.out.println("Moyenne des éléments : " + moyenne);
    }
}
