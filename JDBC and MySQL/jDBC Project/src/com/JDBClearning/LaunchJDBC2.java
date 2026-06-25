package com.JDBClearning;
import java.sql.*;

public class LaunchJDBC2 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		// Load and Register the Driver
        Class.forName("com.mysql.cj.jdbc.Driver");
        
        // Establish the Connection
        
        String url = "jdbc:mysql://localhost:3306/JDBClearning";
        String user = "root";
        String password = "root123";
        Connection connect = DriverManager.getConnection(url, user, password);
        
        //Creating Statement
        Statement statement = connect.createStatement();
        
        
        String sql = "SELECT * FROM studentInfo";//select operation
        //NON select operation --> else block
        //String sql = "Update studentInfo set sage = 55 WHERE id=2";
        
        //Execute Query
		
		boolean status = statement.execute(sql);
        
		
		if(status) {
			System.out.println("If Block");
			//Select
			ResultSet rs = statement.getResultSet();
			while(rs.next()) {
				System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3)
				+ " " + rs.getString(4));
			}
		}
		else {
			System.out.println("Else Block");
			//insert, update, delete
			int rows = statement.getUpdateCount();
			if(rows == 0) System.out.println("Operation Failed");
			else System.out.println("Operation Successful");
		}
		
        //close the resources
        statement.close();
        connect.close();
	}

}
