package org.example.methodExo;

import java.util.Scanner;

public class MethodExo3 {
    public static int getWordsAmount(String text) {

        String[] wordsArray = text.split(" ");
        return wordsArray.length;
    }
    public static void getReadWrite() {
        System.out.println("Veuillez entrez une phrase");
        Scanner scanner = new Scanner(System.in);
        String inputText = scanner.nextLine();

        int wordsAmount = getWordsAmount(inputText);

        System.out.println("Le nombre de mots dans le texte est : " + wordsAmount);
    }


}
