package com.practica1.codigorapidito; // Asegúrate de que esté en el paquete correcto

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/universidad"; // Cambia 'universidad' por el nombre de tu base de datos
    private static final String USER = "root"; // Cambia 'root' por tu usuario de MySQL
    private static final String PASSWORD = "root"; // Cambia 'root' por tu contraseña de MySQL

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
