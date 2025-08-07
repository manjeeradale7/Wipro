package com.Day11;
import java.util.*;
public class AppointmentSchedule {
    public static void main(String[] args) {
        TreeMap<Integer, String> appointments = new TreeMap<>();
        appointments.put(930, "Manjeera");     
        appointments.put(1230, "Sameera");    
        appointments.put(1100, "Siri"); 
        appointments.put(1100, "Aish");
        System.out.println("All Appointments:");
        for (Map.Entry<Integer, String> entry : appointments.entrySet()) {
            System.out.println("Time: " + entry.getKey() + " - Patient: " + entry.getValue());
        }
        appointments.remove(1230);
        System.out.println("\nAfter removing 12:30 appointment:");
        for (Map.Entry<Integer, String> entry : appointments.entrySet()) {
            System.out.println("Time: " + entry.getKey() + " - Patient: " + entry.getValue());
        }
        appointments.remove(1100);
        appointments.put(1130, "Siri");
        Map.Entry<Integer, String> next = appointments.higherEntry(930);
        System.out.println("\nNext after 9:30 : " + next);
        Map.Entry<Integer, String> last = appointments.lowerEntry(1200);
        System.out.println("Last before 12:00 : " + last);
    }
}

