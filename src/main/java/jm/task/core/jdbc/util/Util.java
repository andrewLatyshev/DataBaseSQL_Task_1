package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    private static final String URL = "jdbc:mysql://localhost:3306/firstbd";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";
    private static Connection connection;

    public Connection getConnection() {
        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            System.out.println("Connection OK!");
        } catch (SQLException e) {
            System.out.println("Connection failed");
        }
        return connection;
    }
}
