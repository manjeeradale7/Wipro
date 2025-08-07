package Day3;
public class salary {
	    private double salary;
	  	    public double getSalary() {
	        return salary;
	    }   
	    public void setSalary(double salary) {
	        if (salary >= 0) { 
	            this.salary = salary;
	        } 
	    }
	    public static void main(String[] args) {
	        salary emp = new salary();
	        emp.setSalary(52450);
	        System.out.println("Employee Salary: Rs " + emp.getSalary());	        
	    }
	}


