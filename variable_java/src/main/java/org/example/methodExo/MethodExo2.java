package org.example.methodExo;

import java.util.Scanner;

public class MethodExo2 {

        public static void drawRectangle(int hauteur, int largeur) {

            for (int i = 0; i < hauteur; i++) {

                if (i == 0 || i == hauteur - 1) {
                    for (int j = 0; j < largeur; j++) {
                        System.out.print("*");
                    }
                } else {
                    for (int j = 0; j < largeur; j++) {
                        if (j == 0 || j == largeur - 1) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    }
                }

                System.out.println();
            }
        }

    public static void getWriteRead() {

        System.out.println("Entrez la hauteur du rectangle : ");
        Scanner scanner = new Scanner(System.in);
        int hauteur = scanner.nextInt();


        System.out.println("Entrez la largeur du rectangle : ");
        int largeur = scanner.nextInt();


        drawRectangle(hauteur, largeur);
    }
}
