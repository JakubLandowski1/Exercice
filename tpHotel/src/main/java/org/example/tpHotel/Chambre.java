package org.example.tpHotel;

public class Chambre{

    public int num;
    public boolean statut;
    public double tarif;
    public int capacity;

    public Chambre(int num, double tarif, int capacity) {
        this.num = num;
        this.statut = false;
        this.tarif = tarif;
        this.capacity = capacity;
    }
    public int getNum() {
        return num;
    }

    public boolean isStatut() {
        return statut;
    }

    public void setStatut(boolean statut) {
        this.statut = statut;
    }

    public double getTarif() {
        return tarif;
    }

    public int getCapacity() {
        return capacity;
    }
}
