package org.example.tpHotel;

import java.util.Scanner;

public class IHM {
    private static Scanner scanner = new Scanner(System.in);

    public void afficherMenu() {
        System.out.println("Menu:");
        System.out.println("1. Ajouter un client");
        System.out.println("2. Afficher la liste des clients");
        System.out.println("3. Afficher les réservations d'un client");
        System.out.println("4. Ajouter une réservation");
        System.out.println("5. Annuler une réservation");
        System.out.println("6. Afficher la liste des réservations");
        System.out.println("0. Quitter");
    }

    public void start() {
        System.out.println("Bienvenue dans le système de gestion des réservations d'hôtel!");
        System.out.print("Veuillez entrer le nom de l'hôtel: ");
        String nomHotel = scanner.nextLine();
        System.out.print("Veuillez entrer le nombre de chambres: ");
        int nombreChambres = scanner.nextInt();
        scanner.nextLine();

        Hotel hotel = new Hotel(nomHotel, nombreChambres);

        
        for (int i = 1; i <= nombreChambres; i++) {
            Chambre chambre = new Chambre(i, 100.0, 2);
            hotel.ajouterChambre(chambre);
        }

        int choix;
        do {
            afficherMenu();
            System.out.print("Entrez votre choix (0-6): ");
            choix = scanner.nextInt();
            scanner.nextLine();

            switch (choix) {
                case 1:
                    ajouterClient(hotel);
                    break;
                case 2:
                    afficherListeClients(hotel);
                    break;
                case 3:
                    afficherReservationsClient(hotel);
                    break;
                case 4:
                    ajouterRese(hotel);
                    break;
                case 5:
                    annulerResa(hotel);
                    break;
                case 6:
                    afficherListeReservations(hotel);
                    break;
                case 0:
                    System.out.println("Au revoir!");
                    break;
                default:
                    System.out.println("Choix invalide. Veuillez réessayer.");
            }
        } while (choix != 0);
    }

    private void annulerResa(Hotel hotel) {
    }

    public void ajouterClient(Hotel hotel) {
        System.out.print("Entrez le nom du client: ");
        String nom = scanner.nextLine();
        System.out.print("Entrez le prénom du client: ");
        String prenom = scanner.nextLine();
        System.out.print("Entrez le numéro de téléphone du client: ");
        String telephone = scanner.nextLine();

        Client client = new Client(nom, prenom, telephone);
        hotel.ajouterClient(client);

        System.out.println("Client ajouté avec succès!");
    }

    public void afficherListeClients(Hotel hotel) {
        Client[] clients = hotel.getClients();
        System.out.println("Liste des clients:");
        for (int i = 0; i < hotel.getNbClient(); i++) {
            System.out.println("ID: " + clients[i].id + ", Nom: " + clients[i].name +
                    ", Prénom: " + clients[i].firstname + ", Téléphone: " + clients[i].tel);
        }
    }

    public void afficherReservationsClient(Hotel hotel) {
        System.out.print("Entrez le numéro de téléphone du client: ");
        String telephone = scanner.nextLine();

        Hotel hotel1 = hotel;
        Client[] clients = hotel1.getClients();
        for (int i = 0; i < hotel1.getNbClient(); i++) {
            if (clients[i].tel.equals(telephone)) {
                System.out.println("Réservations du client " + clients[i].name + " " + clients[i].firstname + ":");
                Reservation[] reservations = hotel1.getReservations();
                for (int j = 0; j < hotel1.getNbResa(); j++) {
                    if (reservations[j].client.equals(clients[i])) {
                        System.out.println("Numéro de réservation: " + reservations[j].num +
                                ", Statut: " + (reservations[j].status ? "Validée" : "Annulée") +
                                ", Chambre: " + reservations[j].chambre.num);
                    }
                }
                break;
            }
        }

        public void ajouterClients(Hotel hotel1) {
            System.out.print("Entrez le nom du client: ");
            String nom = scanner.nextLine();
            System.out.print("Entrez le prénom du client: ");
            String prenom = scanner.nextLine();
            System.out.print("Entrez le numéro de téléphone du client: ");
            String tel = scanner.nextLine();

            Client client = new Client(nom, prenom, telephone);
            hotel1.ajouterClient(client);

            System.out.println("Client ajouté avec succès!");
        }

        public void afficherListeClients(Hotel hotel1) {
            Client[] clients = hotel1.getClients();
            System.out.println("Liste des clients:");
            for (int i = 0; i < hotel1.getNbClient(); i++) {
                System.out.println("ID: " + clients[i].id + ", Nom: " + clients[i].name +
                        ", Prénom: " + clients[i].firstname + ", Téléphone: " + clients[i].tel);
            }
        }

        public void afficherReservationsClient(Hotel hotel1) {
            System.out.print("Entrez le numéro de téléphone du client: ");
            String tel = scanner.nextLine();

            Client[] clients = hotel1.getClients();
            for (int i = 0; i < hotel1.getNbClient(); i++) {
                if (clients[i].tel.equals(tel)) {
                    System.out.println("Réservations du client " + clients[i].name + " " + clients[i].firstname + ":");
                    Reservation[] reservations = hotel1.getReservations();
                    for (int j = 0; j < hotel1.getNbResa(); j++) {
                        if (reservations[j].client.equals(clients[i])) {
                            System.out.println("Numéro de réservation: " + reservations[j].num +
                                    ", Statut: " + (reservations[j].status ? "Validée" : "Annulée") +
                                    ", Chambre: " + reservations[j].chambre.num);
                        }
                    }
                    break; 
                }
            }
        }

        public void ajouterReservation(Hotel hotel1) {
            System.out.print("Entrez le numéro du client: ");
            int numeroClient = scanner.nextInt();
            scanner.nextLine();
            
            Client[] clientss = hotel1.getClients();
            Client client = null;
            for (int i = 0; i < hotel1.getNbClient(); i++) {
                if (clientss[i].id == numeroClient) {
                    client = clientss[i];
                    break;
                }
            }

            if (client == null) {
                System.out.println("Client non trouvé. Impossible d'ajouter une réservation.");
                return;
            }

            System.out.print("Entrez le nombre d'occupants: ");
            int nombreOccupants = scanner.nextInt();
            scanner.nextLine(); 
            
            Chambre[] chambres = hotel1.getChambres();
            Chambre chambreDisponible = null;
            for (int i = 0; i < hotel1.getNbChambre(); i++) {
                if (!chambres[i].setStatut() && chambres[i].capacity >= nombreOccupants) {
                    chambreDisponible = chambres[i];
                    break;
                }
            }

            if (chambreDisponible == null) {
                System.out.println("Aucune chambre disponible pour la réservation.");
                return;
            }

           
            Reservation reservation = new Reservation(client, chambreDisponible);
            hotel1.ajouterReservation(reservation);

            
            chambreDisponible.setStatut(true);

            System.out.println("Réservation ajoutée avec succès!");
        }

        public void annulerResa(Hotel hotel1) {
            System.out.print("Entrez le numéro de réservation: ");
            int numeroReservation = scanner.nextInt();
            scanner.nextLine();
            
            Reservation[] reservations = hotel1.getReservations();
            Reservation reservationAnnuler = null;
            for (int i = 0; i < hotel1.getNbResa(); i++) {
                if (reservations[i].num == numeroReservation) {
                    reservationAnnuler = reservations[i];
                    break;
                }
            }

            if (reservationAnnuler == null) {
                System.out.println("Réservation non trouvée. Impossible d'annuler la réservation.");
                return;
            }

            reservationAnnuler.setStatus(false);

            reservationAnnuler.getChambre().setStatut(false);

            System.out.println("Réservation annulée avec succès!");
        }

        public void afficherListeReservations(Hotel hotel1) {
            Reservation[] reservations = hotel1.getReservations();
            System.out.println("Liste des réservations:");
            for (int i = 0; i < hotel1.getNbResa(); i++) {
                System.out.println("Numéro de réservation: " + reservations[i].num +
                        ", Statut: " + (reservations[i].status ? "Validée" : "Annulée") +
                        ", Client: " + reservations[i].client.name + " " + reservations[i].client.firstname +
                        ", Chambre: " + reservations[i].chambre.num);
            }
        }
    }



}
