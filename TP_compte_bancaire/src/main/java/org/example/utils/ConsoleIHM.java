package org.example.utils;

import org.example.enums.StatutOperation;
import org.example.models.Client;
import org.example.models.CompteBancaire;
import org.example.models.Operation;
import org.example.service.CompteService;

import java.util.List;
import java.util.Scanner;

public class ConsoleIHM {

    private static CompteService compteService = new CompteService();
    private static Scanner scanner = new Scanner(System.in);


    public static void start() {
        System.out.println(compteService.getClient(1));
        boolean running = true;
        while (running) {
            System.out.println("1. Créer utilisateur");
            System.out.println("2. Créer compte");
            System.out.println("3. Afficher les operations");
            System.out.println("4. Afficher les comptes");
            System.out.println("5. Faire une opération");
            System.out.println("6. Quitter");
            System.out.print("Choix : ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    createUser();
                    break;
                case 2:
                    createCompte();
                    break;
                case 3:
                    displayOperation();
                    break;
                case 4:
                    displayCompte();
                    break;
                case 5:
                    makeOperation();
                    break;
                case 6:
                    running = false;
                    break;
                default:
                    System.out.println("Choix invalide !");
            }
        }
        System.out.println("Au revoir !");
    }


    private static void makeOperation() {
        System.out.println("Donnez l'id du compte");
        int id = scanner.nextInt();
        System.out.println("Type d'opération (DEPOT ou RETRAIT)");
        String ope = scanner.next();
        System.out.println("montant");
        double montant = scanner.nextDouble();
        StatutOperation statut;
        if (ope.equals("DEPOT") ) {
            statut = StatutOperation.DEPOT;
        } else if (ope.equals("RETRAIT")) {
            statut = StatutOperation.RETRAIT;
        } else {
            return;
        }

        compteService.createOperations(compteService.getCompte(id), montant, statut );
    }

    private static void createUser() {
        System.out.println("Prenom de l'utilisateur");
        String prenom = scanner.nextLine();
        System.out.println("Nom de l'utilisateur");
        String nom = scanner.nextLine();
        System.out.println("Tel de l'utilisateur");
        String tel = scanner.nextLine();

        compteService.createClient(prenom, nom, tel);
    }
    private static void displayCompte() {
        List<CompteBancaire> comptes = compteService.getCompte();
        for (CompteBancaire compte : comptes) {
            System.out.println(compte);
        }

    }



    private static void displayOperation() {
        System.out.println("id du compte");
        int id = scanner.nextInt();
        List<Operation> operations = compteService.getOperations(compteService.getCompte(id));
        for (Operation operation : operations) {
            System.out.println(operation);
        }

    }

    private static void createCompte() {
        System.out.println("id de l'utilisateur");
        int id = scanner.nextInt();
        double solde = 0;
        Client client = compteService.getClient(id);

        compteService.createCompte(solde, client );
    }

}
