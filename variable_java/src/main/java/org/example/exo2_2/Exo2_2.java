package org.example.exo2_2;

import java.util.Scanner;

public class Exo2_2 {

    public static void getReadWrite() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Donnez un nombre :");
        Integer nombre = scanner.nextInt();
        nombre = nombre * nombre ;
        System.out.println("Le carré de ce nombre est" + nombre);

    }

}
