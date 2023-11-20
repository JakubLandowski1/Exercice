package org.example.tab_exo3;

import java.util.Scanner;

public class Tab_exo3 {

    public static void getReadWrite() {
        int[] tab = {10,20,30,40,50,60,70,80};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez un nombre dans le tableau");
        int nb = scanner.nextInt();

        boolean index = false;
        for (int i = 0; i <  tab.length ; i++) {
            if (tab[i] == nb) {
                index = true;
                System.out.println("L'entier est présent dans le tableau.");
            } else {
                System.out.println("L'entier est pas présent dans le tableau.");
            }
        }



    }
}
