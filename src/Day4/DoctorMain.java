package Day4;
public class DoctorMain {
	    public static void main(String[] args) {
	        Patient p = new Patient(7, "Manjeera", null);
	        Surgeon doc = new Surgeon("Dale");
	        doc.diagnose(p);
	    }
	}


