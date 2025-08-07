package com.Day11;
import java.util.*;
import java.time.*;
import java.time.format.*;
public class AppointmentsSchedule {
    public static void main(String[] args) {
        TreeMap<LocalTime, String> appointments = new TreeMap<>();
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm"); 
        LocalTime current = LocalTime.now();
       int choice;
        do {
            System.out.println("\nHospital Appointment");
            System.out.println("1. Add Appointment");
            System.out.println("2. View All Appointments");
            System.out.println("3. Remove Appointment");
            System.out.println("4. Reschedule Appointment");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); 
            switch (choice) {
                case 1:                   
                        System.out.print("Enter appointment time (HH:mm): ");
                        LocalTime time = LocalTime.parse(sc.nextLine(), formatter);
                        System.out.print("Enter patient name: ");
                        String patient = sc.nextLine();
                        System.out.print("Enter doctor name: ");
                        String doctor = sc.nextLine();
                        appointments.put(time, "Patient: " + patient + ", Doctor: " + doctor);
                        System.out.println("Appointment added successfully.");               
                case 2:
                        System.out.println("Appointments :");
                        for (Map.Entry<LocalTime, String> entry : appointments.entrySet()) {
                            System.out.println("Time: " + entry.getKey().format(formatter) + " - " + entry.getValue());
                        }                  
                case 3:                   
                        System.out.print("Enter appointment time to remove (HH:mm): ");
                        LocalTime removeTime = LocalTime.parse(sc.nextLine(), formatter);
                        String removed = appointments.remove(removeTime);                       
                            System.out.println("Removed Appointment -> Time: " + removeTime.format(formatter) + ", Details: " + removed);                  
                case 4:
                        System.out.print("Enter current appointment time (HH:mm): ");
                        LocalTime currentTime = LocalTime.parse(sc.nextLine(), formatter);
                        if (appointments.containsKey(currentTime)) {
                            String details = appointments.remove(currentTime);
                            System.out.print("Enter new appointment time (HH:mm): ");
                            LocalTime newTime = LocalTime.parse(sc.nextLine(), formatter);
                            appointments.put(newTime, details);
                            System.out.println("Appointment rescheduled successfully.");
                        }                
                case 5:
                    System.out.println("Exiting");
                    break;
            }
        } while (choice != 0);
        sc.close();
    }  
}

