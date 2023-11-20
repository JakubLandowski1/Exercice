package org.example.tab_exo5_2;

public class Tab_exo5_2 {

    public static void getReadWrite() {

        int[] tab = {1, 4, 3, 4, 5};

        boolean bool = false;

        for (int i = 0; i < tab.length - 1; i++) {
            for (int j = i + 1; j < tab.length; j++) {
                if (tab[i] > tab[j]) {
                    bool = true;
                }
            }
        }

        if (!bool) {
            System.out.println("Le tableau est croissant");
        } else {
            System.out.println("Le tableau n'est pas croissant");
        }


    }
}



