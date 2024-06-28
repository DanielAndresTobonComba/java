package com.persistencia;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.MessageFormat;


public class Products {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/products";
        String user = "campus2023";
        String password = "campus2023";

        // Intentamos establecer la conexión y crear la tabla
        try (Connection connection = DriverManager.getConnection(url, user, password);
             Statement statement = connection.createStatement()) {

          /*// Consulta SQL para crear la tabla 'inventario' si no existe
            String createTableSQL = "CREATE TABLE IF NOT EXISTS category (" +
                    "id INT PRIMARY KEY AUTO_INCREMENT, " +
                    "name VARCHAR(50))";
                    System.out.println("Categorias registradas");

            // Ejecutamos la consulta para crear la tabla
            statement.execute(createTableSQL);*/

            // Para insertar datos

/*           String insertData = "INSERT INTO category (name) VALUES" + 
            "('Pinturas'), " + 
            "('Herramientas')";

            statement.executeUpdate(insertData); 
            System.out.println("Datos insertados correctamente."); */


/*             // Hacer una consulta y recorrer el valor de retorno de la consulta con un while y se usa una impresion con formato

            String query = "SELECT id,name FROM category";
            ResultSet rs = statement.executeQuery(query);

            while (rs.next()) {

                int id = rs.getInt("id");
                String name = rs.getString("name");
                System.out.println(MessageFormat.format("Id Categoria {0} - Nombre {1}", id, name));
                
            } */

/* 
            // Operacion update 

            String updateSQL = "UPDATE category SET name = 'Grifos' WHERE id = 1";
            int rowsUpdated = statement.executeUpdate(updateSQL);
            System.out.println("Numero de filas actualizadas: " + rowsUpdated) */;


            // Operacion delete 

            String deleteSql = "DELETE FROM category WHERE id = 2";
            int rowsDeleted = statement.executeUpdate(deleteSql);
            System.out.println("Numero de filas eliminadas: " + rowsDeleted);

        } catch (SQLException e) {
            // Manejo de excepciones específico para problemas de SQL
            System.err.println("Error al crear la tabla: " + e.getMessage());
        }
    }
}
