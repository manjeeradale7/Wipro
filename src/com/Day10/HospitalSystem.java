package com.Day10;
import java.util.*;
class Doctor {
	String name;
	String department;
	String licenseNum;
	public Doctor(String name, String department, String licenseNum) {
		this.name = name;
		this.department = department;
		this.licenseNum = licenseNum;
	}
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (!(o instanceof Doctor))
			return false;
		Doctor other = (Doctor) o;
		return Objects.equals(this.licenseNum, other.licenseNum);
	}
	public int hashCode() {
		return Objects.hash(licenseNum);
	}
	public String toString() {
		return name +" "+ department + " " +licenseNum;
	}
}	
public class HospitalSystem {
	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in); 
		HashSet<Doctor> register = new HashSet<>();
		boolean running = true; 
		while (running) { 
			System.out.println("\n Menu:"); 
			System.out.println("1. Add Doctor"); 
			System.out.println("2. Show All Registered Doctors"); 
			System.out.println("3. Exit"); 
			System.out.println("Enter your choice: "); 
			int choice= sc.nextInt(); 
			sc.nextLine(); 
			switch (choice)
			{ 
			case 1: System.out.print("Enter Name: "); 
			String name = sc.nextLine(); 
			System.out.println("Enter Department: "); 
			String department = sc.nextLine(); 
			System.out.println("Enter License Number: "); 
			String license = sc.nextLine(); 
			Doctor doc = new Doctor(name, department, license); 
			if (register.contains(doc)) { 
				System.out.println("Already registered with license: " + license); 
				} else { 
					register.add(doc);
					System.out.println("Doctor added successfully."); 
					} break; 
					case 2: 
						System.out.println("Registered Doctors:"); 
					for (Doctor d : register) 
					{ System.out.println(d);
					} break; 
					case 3: 
						running = false; 
						break;
        }
    }
	}
}
