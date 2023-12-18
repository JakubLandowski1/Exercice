package org.example.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtils {


    public static Connection getMySQLConnection() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/jdbc_exo";
        String userName = "root";
        String password = "password";
        Connection connection = DriverManager.getConnection(url,userName,password);
        return connection;
    }


}
