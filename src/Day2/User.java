package Day3aftn;
public class User {	
	    protected String name;
	    public User(String name) {
	        this.name = name;
	    }
	    public void showDetails() {
	        System.out.println("Name: " + name);
	    }
	}
class Studen extends User {
	    public Studen(String name) {
	        super(name);
	    }
	    public void showDetails() {
	        super.showDetails();
	        System.out.println("Role: Student");
	    }
	}
	class Professor extends User {
	    public Professor(String name) {
	        super(name);
	    }
	    public void showDetails() {
	        super.showDetails();
	        System.out.println("Role: Professor");
	    }
	}


