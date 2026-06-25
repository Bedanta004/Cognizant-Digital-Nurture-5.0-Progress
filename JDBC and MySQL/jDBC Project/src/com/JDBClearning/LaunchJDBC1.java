package com.JDBClearning;
import java.sql.*;

public class LaunchJDBC1 {

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
        
     
        //Execute Query
//      String sql = "INSERT INTO studentInfo(id, sname, sage, scity) VALUES(2, 'Manan', 31, 'Balarampur')";
//		int rowAffected = statement.executeUpdate(sql);
        
//      String sql = "UPDATE studentInfo set sage = 39 WHERE id =2";
//		int rowAffected = statement.executeUpdate(sql);
        
        
//      String sql1 = "DELETE FROM studentInfo WHERE id = 3";
//		statement.executeUpdate(sql1);
        
        String sql = "SELECT * FROM studentInfo";
		ResultSet rs = statement.executeQuery(sql );
        
		//Process the Result
        
//		if(rowAffected == 0) {
//			System.out.println("Unable to insert the Data");
//		}
//		else {
//			System.out.println("Data Inserted Successfully");
//		}
		
//		if(rowAffected == 0) System.out.println("Updation Failed");
//		else System.out.println("Update Successful");
		
		while(rs.next()) {
//			System.out.println(rs.getInt(1) + " " + rs.getString(2) + " "+ rs.getInt(3) + " "+ rs.getString(4));
			System.out.println(rs.getInt("id") + " " + rs.getString("sname") + " "+ rs.getInt("sage") + " "+ rs.getString("scity"));
		}
		
		
        //close the resources
        statement.close();
        connect.close();
        rs.close();
	}

}
