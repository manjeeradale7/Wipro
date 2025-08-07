package Day3aftn;
public class Employee {
	    private String name;
	    private double salary;
	    public Employee(String name, double salary) {
	        this.name = name;
	        this.salary = salary;
	    }
	    public void displayDetails() {
	        System.out.println("Name: " + name);
	        System.out.println("Salary: Rs" + salary);
	    }
	}
	class Manager extends Employee {
	    private String department;
	    public Manager(String name, double salary, String department) {
	        super(name, salary);
	        this.department = department;
	    }
	    public void displayDetails() {
	        super.displayDetails();
	        System.out.println("Department: " + department);
	    }
	}
	class Developer extends Employee {
	    private String language;
	    public Developer(String name, double salary, String language) {
	        super(name, salary);
	        this.language = language;
	    }
	    public void displayDetails() {
	        super.displayDetails();
	        System.out.println("Programming Language: " + language);
	    }
	}


