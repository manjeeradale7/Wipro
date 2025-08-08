package com.Day12;
import java.sql.*;
 
public class DBConnect
{
public static void main(String[] args)
	{
 
	try {
		//Load JDBC Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		//Establish connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "manju@2002");
		
		System.out.println("Connected Successsfully");
		con.close();
	 }
	catch ( Exception e)
	{
		System.out.println("Class not found");
	e.printStackTrace();
			
	}
	
	}
}
 
 
