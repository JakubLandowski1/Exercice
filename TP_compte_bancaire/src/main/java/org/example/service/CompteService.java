package org.example.service;

import org.example.dao.ClientDAO;
import org.example.dao.CompteBancaireDAO;
import org.example.enums.StatutOperation;
import org.example.models.Client;
import org.example.models.CompteBancaire;
import org.example.models.Operation;
import org.example.utils.DatabaseManager;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class CompteService {
    private ClientDAO clientDAO;
    private Connection connection;
    private CompteBancaireDAO compteDAO;


    public CompteService() {
        try {
            connection = new DatabaseManager().getConnection();
            compteDAO = new CompteBancaireDAO(connection);
            clientDAO = new ClientDAO(connection);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public boolean createClient(String prenom, String nom, String tel ){
        Client client = new Client();
        client.setPrenom(prenom);
        client.setNom(nom);
        client.setTel(tel);

        try {
            return clientDAO.save(client);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean createCompte(double solde, Client client){
        CompteBancaire compte = new CompteBancaire();
        compte.setClient(client);
        compte.setSolde(solde);
        System.out.println(compte);
        try {
            return compteDAO.save(compte);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public Client getClient(int id) {
        try {
            return clientDAO.get(id);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public CompteBancaire getCompte(int id) {
        try {
            return compteDAO.get(id);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }



    public boolean createOperations (CompteBancaire compte, double montant, StatutOperation statutOperation) {
        Operation operation = new Operation();
        operation.setMontant(montant);
        operation.setStatut(statutOperation);
        compte.effectuerOperation(operation);

        System.out.println(compte);

        try {
            compteDAO.update(compte);
            return compteDAO.save(operation, compte);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }

    public List<Operation> getOperations(CompteBancaire compteBancaire) {
        try {
            return compteDAO.getOperation(compteBancaire);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public List<CompteBancaire> getCompte() {
        try {
            return compteDAO.get();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }





}
