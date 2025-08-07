package Day4;
import java.util.HashMap;
public class PatientServiceImpl{
	    private HashMap<Integer, Patient> map = new HashMap<>();
	    public void register(Patient patient) {
	        map.put(patient.getId(), patient); 
	    }
	    public void show(int id) {
	        Patient p = map.get(id);
	        if (p != null) {
	            p.display();
	        } 
	    }
	    public static void main(String[] args) {
	        PatientServiceImpl service = new PatientServiceImpl();
	        Patient p1 = new Patient(1, "Manjeera", null);
	        service.register(p1);	 
	        service.show(1);

	    }
	}


	