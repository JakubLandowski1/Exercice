package org.example.tab_exo5_4;

public class Tab_exo5_4 {

    public static void getReadWrite() {
        String[] tab = {"D", "E", "C", "A", "L", "A", "G", "E"};

        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i]);
        }

        String dernierElem = tab[tab.length - 1];

        for (int i = tab.length - 1; i > 0; i--) {
            tab[i] = tab[i - 1];
        }
        tab[0] = dernierElem;

        System.out.println("  ");
        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i]);
        }

    }
}
