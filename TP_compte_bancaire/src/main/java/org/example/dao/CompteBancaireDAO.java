package org.example.dao;

import org.example.enums.StatutOperation;
import org.example.models.Client;
import org.example.models.CompteBancaire;
import org.example.models.Operation;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CompteBancaireDAO extends BaseDAO<CompteBancaire> {


    public CompteBancaireDAO(Connection connection) {
        super(connection);
    }

    @Override
    public boolean save(CompteBancaire element) throws SQLException {
        request = "INSERT INTO compte (client_id, solde)  VALUES (?, ?)" ;
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
        statement.setInt(2, element.getId());
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
        request = "SELECT * FROM compte INNER JOIN clients ON compte.client_id = clients.client_ID WHERE compte_id = ?";
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
            CompteBancaire compte = new CompteBancaire(
                    );
            compte.setSolde(resultSet.getDouble("solde"));
            compte.setId(resultSet.getInt("compte_id"));
            result.add(compte);
        }
        return result;

    }


    public boolean save(Operation operation, CompteBancaire compte) throws SQLException{
        request = "INSERT INTO operation (montant, statut, compte_id) VALUES (?,?,?)";
        statement = _connection.prepareStatement(request, Statement.RETURN_GENERATED_KEYS);
        statement.setDouble(1, operation.getMontant());
        statement.setString(2, String.valueOf(operation.getStatut()));
        statement.setInt(3, compte.getId());

        int nbRows = statement.executeUpdate();
        resultSet = statement.getGeneratedKeys();
        if(resultSet.next()){
            operation.setId(resultSet.getInt(1));
        }
        return nbRows == 1;
    }



    public List<Operation> getOperation(CompteBancaire compte) throws SQLException {
        List<Operation> result = new ArrayList<>();
        request = "SELECT * FROM operation WHERE compte_id = ?";
        statement = _connection.prepareStatement(request);
        statement.setInt(1, compte.getId());
        resultSet = statement.executeQuery();
        while (resultSet.next()) {
            Operation operation = new Operation(resultSet.getInt("operation_id"),
                    resultSet.getDouble("montant"),
                    StatutOperation.valueOf(resultSet.getString("statut")));

            result.add(operation);
        }
        return result;

    }

}
