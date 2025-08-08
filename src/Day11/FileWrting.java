package com.Day11;
import java.io.FileWriter;
import java.io.IOException;
public class FileWrting {	
	    public static void main(String[] args) {
	        try {
	            FileWriter writer = new FileWriter("C:\\Users\\MANJEERA\\eclipse\\java-2025-06\\eclipse\\simple.txt");
	            writer.write("Hi");
	            writer.close();
	            System.out.println("Text written");
	        } catch (IOException e) {
	            System.out.println("Error: " + e.getMessage());
	        }
	    }
	}
