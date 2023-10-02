package cgi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Jdbccon {
    public static void main(String[] args) {
        String jdbcUrl = "jdbc:mysql://localhost:3306/ABC"; // Replace 'mydatabase' with your database name
        String username = "root"; // Replace with your database username
        String password = "root1234"; // Replace with your database password
        try {
            // Register the JDBC driver (optional for Java 8 and above)
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Establish the connection
            Connection connection = DriverManager.getConnection(jdbcUrl, username, password);
            System.out.println("Connected to the database!");

            // Perform database operations here
            // Close the connection
            connection.close();
            System.out.println("Connection closed.");
        } catch (ClassNotFoundException e) {
            System.out.println("JDBC Driver not found!");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Database connection error!");
            e.printStackTrace();
        }
    }
}
