package com.Day10;
import java.util.HashMap;
	class Patient {
		private int id;
	    private String name;
	    private int age;
	    private String disease;
	    public Patient(int id, String name, int age, String disease) {
	        this.id = id;
	        this.name = name;
	        this.age = age;
	        this.disease = disease;
	    }
	    public int getId() {
	        return id;
	    }
	    public String getName() {
	        return name;
	    }
	    public int getAge() {
	        return age;
	    }
	    public String getDisease() {
	        return disease;
	    }
	    public String toString() {
	        return "ID: " + id + ", Name: " + name + ", Age: " + age + ", Disease: " + disease;
	    }
	}
	public class HospitalMenu {       
	public static void main(String[] args) {
		 HashMap<Integer, Patient> patientMap = new HashMap<>();
	        patientMap.put(101, new Patient(101, "Manjeera", 23, "Fever"));
	        patientMap.put(102, new Patient(102, "Sameera", 28, "Cold"));
	        patientMap.put(103, new Patient(103, "Meghana", 27, "Flu"));   
	        System.out.println("Registered Patients:");
	        for (Integer id : patientMap.keySet()) {
	            System.out.println(patientMap.get(id));
	        }
	        System.out.println("\nIs patient with ID 102 present: " + patientMap.containsKey(102));     
	        System.out.println(patientMap.containsValue(new Patient(103, "Meghana", 27, "	Flu")));    
	        Patient p = patientMap.get(101);
	        System.out.println("\nDetails of patient with ID 101:");
	        System.out.println(p);
	        patientMap.remove(102);
	        for (Integer id : patientMap.keySet()) {
	            System.out.println(patientMap.get(id));
	        }
	        System.out.println("\nNumber of patients: " + patientMap.size());
	        System.out.println("Is patient list empty? " + patientMap.isEmpty());
	        patientMap.clear();	        
	        System.out.println("size: " + patientMap.size());
	    }
}
