package org.example.tpHotel;

public class Reservation {
    private static int nextId = 1;
    public int num;
    public boolean status;
    public Client client;
    public Chambre chambre;

    public Reservation(Client client, Chambre chambre) {
        this.num = nextId++;
        this.status = true;
        this.client = client;
        this.chambre = chambre;
    }

    public int getNum() {
        return num;
    }

    public boolean isStatus() {
        return status;
    }

    public Client getClient() {
        return client;
    }

    public Chambre getChambre() {
        return chambre;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }


}
