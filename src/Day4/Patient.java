package Day4;
public class Patient {	
	    private int id;
	    private String name;
	    private String illness;
	    public Patient(int id, String name,String illness) {
	        this.id = id;
	        this.name = name;
	        this.illness = illness;
	    }
	    public int getId() {
	        return id;
	    }
	    public String getName() {
	        return name;
	    }
	    public String getIllness() {
	        return illness;
	    }
	    public void display() {
	        System.out.println("Patient ID: " + id);
	        System.out.println("Name: " + name);
	    }
	}