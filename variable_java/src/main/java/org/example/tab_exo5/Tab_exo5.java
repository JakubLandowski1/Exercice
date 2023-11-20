package org.example.tab_exo5;

import java.util.Random;
import java.util.Scanner;

public class Tab_exo5 {
    public static void getReadWrite() {
        int[] tab = new int[10];


        Random random = new Random();
        for (int i = 0; i < tab.length; i++) {
            tab[i] = random.nextInt(100) + 1;
        }


        System.out.println("Les éléments du tableau sont :");
        for (int i = 0; i < tab.length; i++) {
            System.out.println(tab[i]);
        }
    }
}
