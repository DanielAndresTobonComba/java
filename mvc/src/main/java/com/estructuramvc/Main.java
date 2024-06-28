package com.estructuramvc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
        
       
        try (Connection connection = DriverManager.getConnection(url, user, password);
             Statement statement = connection.createStatement()) { 

                System.out.println("Conexion creada");
             } catch (SQLException e) {
            // Manejo de excepciones específico para problemas de SQL
            System.err.println("Error al crear la tabla: " + e.getMessage());
        }
    }
}