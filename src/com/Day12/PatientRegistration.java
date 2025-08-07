package com.Day12;
import java.sql.*;
import java.util.Scanner;
public class PatientRegistration{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Patient Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Enter Disease: ");
        String disease = sc.nextLine();
        System.out.print("Enter Admission Date (YYYY-MM-DD): ");
        String admissionDate = sc.nextLine();
        System.out.print("Enter Doctor Assigned: ");
        String doctor = sc.nextLine();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital", "root", "manju@2002");
           Statement stmt = conn.createStatement();  
            String insertSQL = "INSERT INTO patients (name, age, disease, admission_date, doctor_assigned) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement pstmt = conn.prepareStatement(insertSQL);
            pstmt.setString(1, name);
            pstmt.setInt(2, age);
            pstmt.setString(3, disease);
            pstmt.setDate(4, Date.valueOf(admissionDate));
            pstmt.setString(5, doctor);
            pstmt.executeUpdate();
            System.out.println("Patient registered successfully!");
            pstmt.close();
            stmt.close();
            conn.close();
        } catch (ClassNotFoundException e) {
            System.out.println(" JDBC Driver not found: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("Database error: " + e.getMessage());
        }
    }
}