package org.example.dao;

import org.example.models.Client;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ClientDAO extends BaseDAO<Client> {
// Constructor
    public ClientDAO(Connection connection) {
        super(connection);
    }

    @Override
    public boolean save(Client element) throws SQLException {
       request = "INSERT INTO client (nom, prenom,tel) VALUES (?,?, ?)";
       statement = _connection.prepareStatement(request, Statement.RETURN_GENERATED_KEYS);
       statement.setString(1, element.getNom());
       statement.setString(2, element.getPrenom());
       statement.setString(3, element.getTel());
       int nbRows = statement.executeUpdate();
        if(resultSet.next()){
            element.setId(resultSet.getInt(1));
        }
        return nbRows == 1 ;
    }

    @Override
    public boolean update(Client element) throws SQLException {
        request = "UPDATE person SET prenom = ?, nom = ?, tel = ? WHERE id = ?";
        statement = _connection.prepareStatement(request);
        statement.setString(1, element.getPrenom());
        statement.setString(2, element.getNom());
        statement.setString(3, element.getTel());
        statement.setInt(4,element.getId());
        int nbRows = statement.executeUpdate();
        return nbRows == 1;
    }

    @Override
    public boolean delete(Client element) throws SQLException {
        return false;
    }

    @Override
    public Client get(int id) throws SQLException {
        Client client = null;
        request = "SELECT * FROM client WHERE id = ?";
        statement = _connection.prepareStatement(request);
        statement.setInt(1, id);
        resultSet = statement.executeQuery();
        if(resultSet.next()){
            client = new Client(resultSet.getInt("id"),
            resultSet.getString("prenom"),
            resultSet.getString("nom"),
            resultSet.getString("tel"));
        }
        return client;
    }

    @Override
    public List<Client> get() throws SQLException {
        List<Client> result = new ArrayList<>();
        statement = _connection.prepareStatement(request);
        resultSet = statement.executeQuery();
        while (resultSet.next()){
            Client client = new Client( resultSet.getInt("id"),
                    resultSet.getString("prenom"),
                    resultSet.getString("nom"),
                    resultSet.getString("tel"));
            result.add(client);
        }
        return null;
    }
}
