package org.example.models;

import java.util.ArrayList;
import java.util.List;

public class Client {

    private int id;
    private String nom;
    private String prenom;
    private String tel;
    private List<CompteBancaire> comptes;

// Setter
    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public void setComptes(List<CompteBancaire> comptes) {
        this.comptes = comptes;
    }

// Getter
    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getTel() {
        return tel;
    }

    public List<CompteBancaire> getComptes() {
        return comptes;
    }



// Constructor

    public Client(int id, String nom, String prenom, String tel) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.tel = tel;
        this.comptes =new ArrayList<>();
    }

// Méthodes

    public void ajouterCompte(CompteBancaire compte) {
        comptes.add(compte);
    }

}
