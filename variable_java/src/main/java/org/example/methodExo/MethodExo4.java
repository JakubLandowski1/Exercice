package org.example.methodExo;

import java.util.Scanner;

public class MethodExo4 {
    public static String[] filterWordsByLength(int minLength, String[] words) {

        java.util.List<String> filteredWordsList = new java.util.ArrayList<>();


        for (String word : words) {
            if (word.length() >= minLength) {
                filteredWordsList.add(word);
            }
        }

        return filteredWordsList.toArray(new String[0]);
    }

    public static void getReadWrite() {

        System.out.println("Entrez des mots séparés par un espace : ");
        Scanner scanner = new Scanner(System.in);
        String inputWords = scanner.nextLine();


        System.out.println("Entrez la longueur minimale pour filtrer les mots : ");
        int minLength = scanner.nextInt();

        String[] wordsArray = inputWords.split(" ");
        String[] filteredWords = filterWordsByLength(minLength, wordsArray);


        System.out.println("Mots filtrés par longueur minimale : ");
        for (String word : filteredWords) {
            System.out.println(word);
        }
    }

}
