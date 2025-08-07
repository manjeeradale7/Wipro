package com.Day12;

import java.sql.*;

public class DBconnection
{
public static void main(String[] args)
	{
 
	try {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "manju@2002");
		
		/*String sql="INSERT INTO patients(name, age, disease) VALUES(?, ?, ?)";
		
		PreparedStatement pstmt=con.prepareStatement(sql);
		String[][] data=
		{
				{"Anshita", "22", "Fever"},
				{"Sri Laxmi", "23", "Cold"},
				{"Ashwarya", "22", "headche"},
				{"Manjeera", "22", "Pain"}
		};
			for(String[] row : data)
		{
			pstmt.setString(1, row[0]);
			pstmt.setInt(2, Integer.parseInt(row[1]));
			pstmt.setString(3, row[2]);
			pstmt.executeUpdate();
		}*/
		/*String sql="UPDATE patients SET name=? WHERE name=?";
		
		PreparedStatement pstmt=con.prepareStatement(sql);
 
		pstmt.setString(1, "Sai Manjeera");
		pstmt.setString(2, "Manjeera");
		int rows=pstmt.executeUpdate();*/
		String sql="DELETE FROM patients WHERE name=?";
		
		PreparedStatement pstmt=con.prepareStatement(sql);
 
		pstmt.setString(1, "Sai Manjeera");
		
		int rows=pstmt.executeUpdate();
		System.out.println(" All patients inserted successfully");
		con.close();
	    }
	catch (Exception e)
	{
	e.printStackTrace();
			
	}
	}
}
 
 

