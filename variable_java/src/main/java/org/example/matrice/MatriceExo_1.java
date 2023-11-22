package org.example.matrice;

import java.util.Arrays;

public class MatriceExo_1 {
    public static void getReadWrite() {
        int[][] tab = {{45, 23, 34, 56, 30}, {67, 75, 21, 52, 59}, {89, 34, 19, 19, 15}, {1, 78, 90, 48, 42}};
        int pg = 0;
        int nb = 0;

        for (int i = 0; i < tab.length; i++) {

            for (int j = 0; j < tab[i].length; j++) {
                nb = tab[i][j];
                if (nb>pg) {
                    pg = nb;
                }

            }

        }
        System.out.println(pg);
    }
}
