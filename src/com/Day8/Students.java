package com.Day8;
import java.util.*;
public class Students {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        List<String> names = new ArrayList<>();
	        List<Integer> rolls = new ArrayList<>();
	        List<Double> marksList = new ArrayList<>();
	        System.out.print("Number of students: ");
	        int count = sc.nextInt();
	        for (int i = 0; i < count; i++) {
	            System.out.println("\nStudent " + (i + 1));
	            System.out.print("Name: ");
	            String name = sc.next();
	            System.out.print("Roll Number: ");
	            int roll = sc.nextInt();
	            System.out.print("Marks: ");
	            double marks = sc.nextDouble();
	            names.add(name);
	            rolls.add(Integer.valueOf(roll));
	            marksList.add(Double.valueOf(marks));
	        }
	        System.out.println("\nStudent Records");
	        for (int i = 0; i < count; i++) {
	            System.out.println("Name: "+names.get(i)+", Roll: "+rolls.get(i)+", Marks: "+ marksList.get(i));
	        }	      
	        sc.close();
	    }
	}

