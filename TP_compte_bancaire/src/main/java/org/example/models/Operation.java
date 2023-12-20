package org.example.models;

import org.example.enums.StatutOperation;

public class Operation {

    private int id;
    private double montant;
    private StatutOperation statut;

// getter
    public int getId() {
        return id;
    }
    public StatutOperation getStatut() {
        return statut;
    }

    public double getMontant() {
        return montant;
    }

// setter
    public void setId(int id) {
        this.id = id;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public void setStatut(StatutOperation statut) {
        this.statut = statut;
    }




// Constructor
    public Operation(int id, double montant, StatutOperation statut) {
        this.id = id;
        this.montant = montant;
        this.statut = statut;
    }

    public Operation() {

    }


    @Override
    public String toString() {
        return "Operation{" +
                "id=" + id +
                ", montant=" + montant +
                ", statut=" + statut +
                '}';
    }
}
