package com.JDBClearning;
import java.sql.*;

public class LaunchJDBC3 {

	public static void main(String[] args)
	{
		Connection connect = null;
		Statement statement = null;
		// Load and Register the Driver
        try {
        	connect = jdbcUtil.getConnection();
        	
        	
			Class.forName("com.mysql.cj.jdbc.Driver");
		
        
        // Establish the Connection
        
        String url = "jdbc:mysql://localhost:3306/JDBClearning";
        String user = "root";
        String password = "root123";
        connect = DriverManager.getConnection(url, user, password);
        
        //Creating Statement
        statement = connect.createStatement();
        
        
        String sql = "SELECT * FROM studentInfo";
        
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
		
        
	}
	catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    catch(SQLException e) {
        e.printStackTrace();
    }
    catch(Exception e) {
    	e.printStackTrace();
    }
//    Finally block will be executed each time
    finally {
    	//close the resources
        try {
			statement.close();
			connect.close();	
		}
        catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        }
	}

}
