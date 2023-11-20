package org.example.tab_exo5_7;

import java.util.Arrays;

public class Tab_exo5_7 {
    public static void getReadWrite() {
        int [] tab = {5,8,1,2,6,7};
        System.out.print(Arrays.toString(tab));

        int t = tab.length;
        int tamp = 0;

        for (int i = 0; i < t; i++) {

            for (int j = 1; j < t-1; j++) {

                if (tab[j-1] > tab[j]) {
                    tamp = tab[j-1];
                    tab[j-1] = tab[j];
                    tab[j] = tamp;
                }
            }

        }

        System.out.print(Arrays.toString(tab));
    }


}
