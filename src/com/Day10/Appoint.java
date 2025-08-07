package com.Day10;
import java.time.LocalDateTime;
import java.util.*;
class Appointment {
    String patientName;
    private String dateTime;
    public Appointment(String patientName, String dateTime) {
        this.patientName = patientName;
        this.dateTime = dateTime;
    }
    public String toString() {
        return patientName + " - " + dateTime;
    }
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Appointment)) return false;
        Appointment other = (Appointment) obj;
        return Objects.equals(patientName, other.patientName) &&
               Objects.equals(dateTime, other.dateTime);
    }
    public int hashCode() {
        return Objects.hash(patientName, dateTime);
    }
}
public class Appoint {
    public static void main(String[] args) {
        TreeSet<Appointment> appointments = new TreeSet<>();      
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\nAppointment Menu");
            System.out.println("1.Add Appointment");
            System.out.println("2.View Appointments");
            System.out.println("3.Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); 
            switch (choice) {
                case 1:
                    System.out.print("Enter patient name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter appointment date/time (YYYY-MM-DD HH:MM): ");
                   String datetime = sc.nextLine();
                    Appointment newAppt = new Appointment(name, datetime);
                    if (appointments.contains(newAppt)) {
                        System.out.println(" Duplicate appointment.");
                    } else {
                        appointments.add(newAppt);
                        System.out.println(" Appointment added.");
                    }
                    break;
                case 2:
                    System.out.println("\n Scheduled Appointments:");
                    if (appointments.isEmpty()) {
                        System.out.println("No appointments found.");
                    } else {
                        for (Appointment a : appointments) {
                            System.out.println(a);
                        }
                    }
                    break;
                case 3:
                    System.out.println(" Exiting...");
                    break;
            }
        } while (choice != 3);
        sc.close();
    }
}

