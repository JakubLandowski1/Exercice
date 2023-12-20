package org.example.service;

import org.example.dao.ClientDAO;
import org.example.models.Client;
import org.example.utils.DatabaseManager;

import java.sql.Connection;
import java.sql.SQLException;

public class CompteService {
    private ClientDAO clientDAO;
    private Connection connection;

    public CompteService() {
        try {
            connection = new DatabaseManager().getConnection();
            clientDAO = new ClientDAO(connection);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        public boolean createClient(String prenom, String nom, String tel ){
            Client client = new Client();
        }



    }

}
