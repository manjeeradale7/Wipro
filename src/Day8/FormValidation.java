package com.Day8;
import java.util.Scanner;
public class FormValidation {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter age: ");
	        String ageInput = sc.nextLine();
	        System.out.print("Enter marks: ");
	        String marksInput = sc.nextLine();
	        int age = Integer.parseInt(ageInput);          
	        double marks = Double.parseDouble(marksInput); 
	        if (age >= 0 && marks >= 0.0 && marks <= 75.0) {
	            System.out.println("Validated Data:");
	            System.out.println("Age: " + age);
	            System.out.println("Marks: " + marks);
	        } else {
	            System.out.println("Invalid input values.");
	        }
	        sc.close();
	    }
	}
