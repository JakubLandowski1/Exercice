package org.example.utils;

import org.example.service.PersonService;

import java.util.Scanner;

public class ConsoleIHM {

    private Scanner scanner;

    public void start() {
        String choice;
        do {
            menu();
            choice = scanner.nextLine();

            switch (choice) {
                case "1":


            }

        } while (!choice.equals("0"));

    }

    private void menu(){
        System.out.println("1- Créer un utilisateur");
        System.out.println("2- Modifier un utilisateur");
        System.out.println("3- Supprimer un utilisateur");
        System.out.println("4- Afficher tous les utilisateurs");
        System.out.println("0- Quitter");
    }

}
