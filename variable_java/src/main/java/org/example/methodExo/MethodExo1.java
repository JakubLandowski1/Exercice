package org.example.methodExo;

import java.util.Scanner;

public class MethodExo1 {

        public static int findMaxIntInArray(int[] intArray) {
                int valMax = intArray[0];

                for (int i = 0; i < intArray.length; i++) {
                        if (intArray[i] > valMax) {
                                valMax = intArray[i];

                        }
                }
        return valMax;
        }

        public static void getWriteRead() {

                System.out.println("Entrez des nombres entier tous separés par un espace");

                Scanner scanner = new Scanner(System.in);
                String input = scanner.nextLine();

                String[] nbString = input.split(" ");
                int[] nbTab = new int[nbString.length];
                for (int i = 0; i < nbString.length; i++) {
                        nbTab[i] = Integer.parseInt(nbString[i]);
                }

                int valMax = findMaxIntInArray(nbTab);

                System.out.println(valMax);

        }




}
