package com.JDBClearning;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;

public class jdbcUtil {

    static {
        try 
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } 
        catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }
    }
    
    public static Connection getConnection() throws SQLException {
        // Establish the connection
        String url = "jdbc:mysql://localhost:3306/JDBClearning";
        String user = "root";
        String password = "root123";

        return DriverManager.getConnection(url, user, password);
    }
    public static void closeConnection(Connection connect, Statement statement) throws SQLException {
    	statement.close();
    	connect.close();
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}