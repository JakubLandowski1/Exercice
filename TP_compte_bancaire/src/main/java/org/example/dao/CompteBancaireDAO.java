package org.example.dao;

import org.example.models.Client;
import org.example.models.CompteBancaire;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CompteBancaireDAO extends BaseDAO<CompteBancaire> {


    protected CompteBancaireDAO(Connection connection) {
        super(connection);
    }

    @Override
    public boolean save(CompteBancaire element) throws SQLException {
        request = "INSERT INTO compte (client_id, solde) VALUES (?, ?)" ;
        statement = _connection.prepareStatement(request, Statement.RETURN_GENERATED_KEYS);
        statement.setInt(1, element.getClient().getId());
        statement.setDouble(2,element.getSolde());

        int nbRows = statement.executeUpdate();
        resultSet = statement.getGeneratedKeys();
        if(resultSet.next()){
            element.setId(resultSet.getInt(1));
        }
        return nbRows == 1;
    }

    @Override
    public boolean update(CompteBancaire element) throws SQLException {
        request = "UPDATE compte SET solde = ? WHERE compte_id = ?";
        statement = _connection.prepareStatement(request);
        statement.setDouble(1, element.getSolde());

        int nbRows = statement.executeUpdate();
        return nbRows == 1;
    }

    @Override
    public boolean delete(CompteBancaire element) throws SQLException {
        return false;
    }

    @Override
    public CompteBancaire get(int id) throws SQLException {
        CompteBancaire compte = null;
        request = "SELECT * FROM compte INNER JOIN client ON compte.client_id = client.client_ID WHERE compte_id = ?";
        statement = _connection.prepareStatement(request);
        statement.setInt(1, id);
        resultSet = statement.executeQuery();
        if (resultSet.next()) {
            compte = new CompteBancaire(resultSet.getInt("compte_id"),
                    resultSet.getDouble("solde"),
                    new Client(resultSet.getInt("client_ID"),
                            resultSet.getString("prenom"),
                            resultSet.getString("tel"),
                            resultSet.getString("nom"))
                            );
        }

        return compte;
    }

    @Override
    public List<CompteBancaire> get() throws SQLException {
        List<CompteBancaire> result = new ArrayList<>();
        request = "SELECT * FROM compte";
        statement = _connection.prepareStatement(request);
        resultSet = statement.executeQuery();
        while (resultSet.next()){
            CompteBancaire compte = new CompteBancaire(resultSet.getInt("compte_id"),
                    resultSet.getDouble("solde"),
                    new Client(resultSet.getInt("client_ID"),
                            resultSet.getString("prenom"),
                            resultSet.getString("tel"),
                            resultSet.getString("nom")));
            result.add(compte);
        }
        return result;

    }
}
