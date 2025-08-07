package Day13;
import java.sql.*;
public class DBConnect
{
public static void main(String[] args)
	{ 
	try {		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "manju@2002");
		System.out.println("Connected Successsfully");	
		Statement stmt=con.createStatement();	
		String sql="CREATE TABLE IF NOT EXISTS student("+"id INT PRIMARY KEY AUTO_INCREMENT,"
				+ "name VARCHAR(100),"+"age INT,"+"course VARCHAR(100))";	
		stmt.executeUpdate(sql);
		System.out.println("Table 'student' created successfully.");
		con.close();
	 }
	catch (Exception e)
	{
	e.printStackTrace();			
	}
	}
}
 
 

