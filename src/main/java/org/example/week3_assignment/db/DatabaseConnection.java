package org.example.week3_assignment.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    private static final String URL = "jdbc:mysql://127.0.0.1:3307/shopping_cart_localization";
    private static final String USER = "root";
    private static final String PASSWORD = "root123"; // change if your real password is different

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}