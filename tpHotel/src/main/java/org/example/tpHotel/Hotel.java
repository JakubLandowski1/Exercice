package org.example.tpHotel;

import java.util.List;

public class Hotel {
    public Chambre[] getChambres() {
        return chambres;
    }

    public Reservation[] getReservations() {
        return reservations;
    }

    public Client[] getClients() {
        return clients;
    }

    public String getName() {
        return name;
    }

    public String name;
    public Chambre[] chambres;
    public Reservation[] reservations;
    public Client[] clients;
    public int nbChambre;
    public int nbResa;

    public int getNbChambre() {
        return nbChambre;
    }

    public int getNbResa() {
        return nbResa;
    }

    public int getNbClient() {
        return nbClient;
    }

    public int nbClient;

    public Hotel(String name, int nbChambre) {
        this.name = name;
        this.chambres = new Chambre[nbChambre];
        this.reservations = new Reservation[nbChambre];
        this.clients = new Client[nbChambre];
        this.nbChambre = 0;
        this.nbResa = 0;
        this.nbClient = 0;
    }

    public void ajouterClient(Client client) {
        clients[nbClient++] = client;
    }

    public void ajouterChambre(Chambre chambre) {
        chambres[nbChambre++] = chambre;
    }

    public void ajouterReservation(Reservation reservation) {
        reservations[nbResa++] = reservation;
    }



}
