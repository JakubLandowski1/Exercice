package org.example.tab_exo5_6;

import java.util.Arrays;

public class Tab_exo5_6 {

    public static void getReadWrite() {
        int [] tab = {5,8,1,2,6,7};
        System.out.print(Arrays.toString(tab));

        for (int i = 0; i < tab.length; i++) {
            int tamp = i;

            for (int j = i + 1; j < tab.length; j++)
            {
                if (tab[j] < tab[tamp]){
                    tamp = j;
                }
            }

            int min = tab[tamp];
            tab[tamp] = tab[i];
            tab[i]= min;
        }

        System.out.print(Arrays.toString(tab));
    }
}
