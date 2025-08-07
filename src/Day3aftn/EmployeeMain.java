package Day3aftn;
public class EmployeeMain {	
	    public static void main(String[] args) {
	        Manager manager = new Manager("Manjeera", 85000, "IT");
	        Developer developer = new Developer("Siri", 95000, "Java");
	        System.out.println("Manager Details");
	        manager.displayDetails();
	        System.out.println("\nDeveloper Details");
	        developer.displayDetails();
	    }
	}


