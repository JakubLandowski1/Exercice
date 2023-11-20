package org.example.tab_exo5_8;

import java.util.Arrays;

public class Tab_exo5_8 {

    public static void getReadWrite() {
        int [] tab = {5,2,6,2} ;
        int [] tabDeux = {5,4,6};

            
            System.out.println(Arrays.toString(tab));
            System.out.println(Arrays.toString(tabDeux));

        if (tab.length == tabDeux.length) {

            int[] somme = new int[tab.length];


            for (int i = 0; i < tab.length; i++) {
                somme[i] = tab[i] + tabDeux[i];
            }


            System.out.println("La somme des tableaux est :");


            for (int i = 0; i < somme.length; i++) {
                System.out.print(somme[i] + " ");
            }
        } else {
            System.out.println("Les tableaux n'ont pas la même longueur.");
        }



    }
}
