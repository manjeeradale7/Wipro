package Day3aftn;
public class Person {
	    protected String name;
	    public Person(String name) {
	        this.name = name;
	    }
	    public void showDetails() {
	        System.out.println("Name: " + name);
	    }
	}
	class Student extends Person {
	    public Student(String name) {
	        super(name);
	    }
	    public void showDetails() {
	        super.showDetails();
	        System.out.println("Role: Student");
	    }
	}
	class Teacher extends Person {
	    public Teacher(String name) {
	        super(name);
	    }
	    public void showDetails() {
	        super.showDetails();
	        System.out.println("Role: Teacher");
	    }
	}


