package org.example.tab_exo5_1;
import java.util.ArrayList;
import java.util.Scanner;

public class Tab_exo5_1 {

    public static void getReadWrite() {
        int[] tab = {1,2,1,4,5,1,7,8,9,10};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez un nombre :");
        int nb = scanner.nextInt();

        int occurence = 0;

        for (int i = 0; i < tab.length; i++) {
            if (tab[i] == nb) {
                occurence += 1;
            }
        }

        System.out.println(occurence);
    }

    }




