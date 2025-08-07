package com.Day8;
import java.util.*;
class Pat {
    String name;
    int age;
    String disease;
    Pat(String n, int a, String d) {
        name = n; age = a; disease = d;
    }
    public String toString() {
        return name + " | " + age + " | " + disease;
    }
}
public class Hospital {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Pat> list = new ArrayList<>();
       while (true) {
            System.out.println("Choose option: ");
            System.out.println("1.Add New Patient");
            System.out.println("2.View All Patients");
            	System.out.println("3.Patient by Index");
            	System.out.println("4.Update Patient Disease");
            	System.out.println("5.Remove Patient by Index");
            	System.out.println("6.Remove Patient by Name");
            	System.out.println("7.Check if Patient Exists");
            	System.out.println("8.Show Total Patients");
            	System.out.println("9.Clear All Records");
            	System.out.println("10.Find First/Last Index of a Patient");
            	System.out.println("11.Check if List is Empty");
            	System.out.println("12.Exit");
            int op = sc.nextInt(); 
            sc.nextLine();
            switch (op) {
                case 1:
                    System.out.print("Name: "); 
                    String n = sc.nextLine();
                    System.out.print("Age: "); 
                    int a = sc.nextInt(); 
                    sc.nextLine();
                    System.out.print("Disease: "); 
                    String d = sc.nextLine();
                    list.add(new Pat(n, a, d)); 
                    break;
                case 2:
                    for (Pat p : list) 
                    	System.out.println(p); 
                    break;
                case 3: 
                    int i = sc.nextInt(); 
                    sc.nextLine();
                    if (i >= 0 && i < list.size()) 
                    	System.out.println(list.get(i)); 
                    break;
                case 4: 
                    i = sc.nextInt(); 
                    sc.nextLine();
                    if (i >= 0 && i < list.size()) 
                    	list.get(i).disease = sc.nextLine();
                    break;
                case 5: 
                    i = sc.nextInt(); 
                    sc.nextLine();
                    if (i >= 0 && i < list.size()) 
                    	list.remove(i); 
                    break;
                case 6: 
                    String name = sc.nextLine();
                    list.removeIf(p-> p.name.equalsIgnoreCase(name)); 
                    break;
                case 7: 
                    name = sc.nextLine();
                    boolean found = false;
                    for (Pat p : list)
                        if (p.name.equalsIgnoreCase(name)) 
                        	found = true;
                    System.out.println(found); 
                    break;
                case 8:
                    System.out.println("Total: " + list.size()); 
                    break;
                case 9: 
                    list.clear(); 
                    break;
                case 10: 
                    name = sc.nextLine();
                    int first = -1, last = -1;
                    for (i = 0; i < list.size(); i++) {
                        if (list.get(i).name.equalsIgnoreCase(name)) {
                            if (first == -1) first = i;
                            last = i;
                        }
                    }
                    System.out.println("First: " + first + ", Last: " + last); break;
                case 11:
                    System.out.println(list.isEmpty()); 
                    break;
                case 12: 
                    return;
            }
        }
    }
}