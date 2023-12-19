package org.example;

import org.example.utils.ConnectionUtils;

import java.sql.*;
import java.util.Scanner;

public class Jdbc_exo {


    public static void addSqlTable() {
        Scanner scanner = new Scanner(System.in);
        Connection connection = null ;
        try {
            connection = ConnectionUtils.getMySQLConnection();
            System.out.println("connexion ok");

          /*  System.out.println("Merci de saisir le prénom : ");
            String firstName = scanner.nextLine();
            System.out.println("Merci de saisir le nom : ");
            String lastName = scanner.nextLine();
            System.out.println("Merci de saisir le numero de class : ");
            int numClass = scanner.nextInt();
            System.out.println("Merci de saisir la date d'obtention du diplome : ");
            scanner.nextLine();
            String date_diplome = scanner.nextLine();
            Date date = Date.valueOf(date_diplome);


            String request = "INSERT INTO etudiant (prenom, nom, date_diplome, num_classe) VALUES ( ?, ?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(request);
            preparedStatement.setString(1,firstName);
            preparedStatement.setString(2,lastName);
            preparedStatement.setDate(3, date);
            preparedStatement.setInt(4,numClass);
            preparedStatement.execute(); */

       /* String requestAfficher = "SELECT * FROM etudiant";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(requestAfficher);
            while (resultSet.next()){
                System.out.println(
                        resultSet.getInt("id")+") "+resultSet.getString("prenom")+" "+resultSet.getString("nom")

                );
            }
            statement.close(); */

        /*    String requestAfficherParClasse = "SELECT * FROM etudiant WHERE num_classe = 15";
            Statement statement2 = connection.createStatement();
            ResultSet resultSet2 = statement2.executeQuery(requestAfficherParClasse);
            while (resultSet2.next()){
                System.out.println(
                        resultSet2.getInt("id")+") "+resultSet2.getString("prenom")+" "+resultSet2.getString("nom")

                );
            }
            statement2.close(); */

          /*  System.out.println("Merci de saisir le prénom : ");
            String firstName = scanner.next();
            System.out.println("Merci de saisir le nom : ");
            String lastName = scanner.next();

            String request = "DELETE FROM etudiant WHERE prenom = ? AND nom = ? ";  */

            System.out.println("Merci de saisir l'id: ");
            int id = scanner.nextInt();

            String request = "DELETE FROM etudiant WHERE id = ? ";
            PreparedStatement preparedStatement = connection.prepareStatement(request);
            preparedStatement.setInt(1,id);

            preparedStatement.executeUpdate();



        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            if (connection != null){
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }


    }

}
