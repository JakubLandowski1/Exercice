package org.example.tab_exo5_3;

public class Tab_exo5_3 {

    public static void getReadWrite() {

        int[] tab = {10, 50, 15, 100, 12};
        int max = 0;



        for (int i = 0; i < tab.length - 1; i++) {
            for (int j = i + 1; j < tab.length; j++) {
                int ecart = tab[i] - tab[j];

                if (ecart < 0) {
                    ecart = -ecart;
                }
                if (ecart > max) {
                    max = ecart;
                }
            }
        }

        System.out.println("Le plus grand écart dans le tableau est : " + max);
    }
}
