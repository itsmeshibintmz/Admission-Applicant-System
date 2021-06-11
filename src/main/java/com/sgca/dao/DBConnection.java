
package com.sgca.dao;


// To access packages and its classes in this class
import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Class used for Connecting To MYSQL Database
 * 
 * @author Shibin Thomas
 * Version 1.0
 *
 */
public class DBConnection {
    /**
     * Method used to connect to Database
     * 
     * @return Connection variable
     */
    public static Connection getConnection() {
        Connection conn = null;
        // To check Connection code block for errors and to print a error
        // message when an error is encountered.
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            // This method creates a Connection object, which is used to create
            // SQL statements, and process the results.
            conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/sgca", "root", "root");
            System.out.println("Got connection ");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        // Returns the connection variable
        return conn;
    }
}