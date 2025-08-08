package com.Day9;
import java.util.LinkedList;
import java.util.Scanner;
public class HospitalDemo {
	    public static void main(String[] args) {
	        LinkedList<String> queue = new LinkedList<>();
	        Scanner sc = new Scanner(System.in);
	        int choice;
	        do {
	            System.out.println("\n Menu:");
	            System.out.println("1. Admit Normal Patient");
	            System.out.println("2. Admit Emergency Patient");
	            System.out.println("3. View All Patients");
	            System.out.println("4. View First Patient");
	            System.out.println("5. View Last Patient");
	            System.out.println("6. Remove Patient");
	            System.out.println("7. Search Patient");
	            System.out.println("0. Exit");
	            System.out.print("Choose: ");
	            choice = sc.nextInt();
	            sc.nextLine(); 
	            switch (choice) {
	                case 1:
	                    System.out.print("Enter patient name: ");
	                    String normalName = sc.nextLine();
	                    queue.addLast(normalName); 
	                    System.out.println("Admitted (Normal): " + normalName);
	                    break;
	                case 2:
	                    System.out.print("Enter emergency patient name: ");
	                    String emergencyName = sc.nextLine();
	                    queue.addFirst(emergencyName); 
	                    System.out.println(" Admitted (Emergency): " + emergencyName);
	                    break;
	                case 3:
	                    if (queue.isEmpty()) {
	                        System.out.println("Queue is empty.");
	                    } else {
	                        System.out.println("Patient Queue:");
	                        for (String patient : queue) {
	                            System.out.println(" - " + patient);
	                        }
	                    }
	                    break;
	                case 4:
	                    System.out.println(queue.isEmpty() ? "No patients." : "First: " + queue.getFirst());
	                    break;
	                case 5:
	                    System.out.println(queue.isEmpty() ? "No patients." : " Last: " + queue.getLast());
	                    break;
	                case 6:
	                    if (queue.isEmpty()) {
	                        System.out.println("No one to treat.");
	                    } else {
	                        System.out.println("Treated: " + queue.removeFirst());
	                    }
	                    break;
	                case 8:
	                    System.out.println("Exiting");
	                    break;
	                case 7:
	                    System.out.print("Enter patient name to search: ");
	                    String Name = sc.nextLine();
	                    if (queue.contains(Name)) {
	                        System.out.println(Name + " is in the queue.");
	                    } else {
	                        System.out.println(Name + " not found.");
	                    }
	                    break;
	                default:
	                    System.out.println("Invalid choice.");
	            }
	        } while (choice != 0);
	        sc.close();
	    }
	}
