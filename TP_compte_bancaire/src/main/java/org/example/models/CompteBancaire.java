package org.example.models;

import org.example.enums.StatutOperation;

import java.util.ArrayList;
import java.util.List;

public class CompteBancaire {

    private int id;
    private double solde;
    private List<Operation> operations;
    private Client client;

// Setter
    public void setId(int id) {
        this.id = id;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public void setOperations(List<Operation> operations) {
        this.operations = operations;
    }

    public void setClient(Client client) {
        this.client = client;
    }

// Getter
    public int getId() {
        return id;
    }

    public double getSolde() {
        return solde;
    }

    public List<Operation> getOperations() {
        return operations;
    }

    public Client getClient() {
        return client;
    }


// Constructor
    public CompteBancaire(int id, double solde, Client client) {
        this.id = id;
        this.solde = solde;
        this.operations = new ArrayList<>();
        this.client = client;
    }

// Méthodes

  public void effectuerOperation(Operation operation) {
        operations.add(operation);
        if (operation.getStatut() == StatutOperation.DEPOT) {
            solde += operation.getMontant();
        } else {
            solde -= operation.getMontant();
        }
    }

}
