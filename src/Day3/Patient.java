package Day3;
public class Patient {	
	    private String name;
	    private String medicalHistory;
	    public String getName() {
	        return name;
	    }
	    public void setName(String name) {
	        this.name = name;
	    }
	    public String getMedicalHistory() {
	        return medicalHistory;
	    }
	    public void setMedicalHistory(String medicalHistory) {
	        this.medicalHistory = medicalHistory;
	    }
	    public void display() {
	        System.out.println("Name: " + name);
	        System.out.println("Medical History: " + medicalHistory);
	    }
	    public static void main(String[] args) {
	        Patient p = new Patient();
	        p.setName("java");
	        p.setMedicalHistory("High blood pressure");
	        p.display();
	    }
	}


