package org.example.tab_exo5_5;

import java.util.ArrayList;
import java.util.Arrays;

public class Tab_exo5_5 {
    public static void getReadWrite() {

        int[] tab = {1, 2, 3, 4, 5,6,7,8,9};

        int lastI = tab.length - 1;

        System.out.print(Arrays.toString(tab));


        for (int i = 0; i < tab.length/2 ; i++) {

            int tamp = tab[i];
            tab[i] = tab[lastI];
            tab[lastI] = tamp;

            lastI--;
        }


            System.out.print(Arrays.toString(tab));


    }
}







