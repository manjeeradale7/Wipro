package Day4;
public abstract class Doctor {
	protected String name;
    protected String specialization;
    public Doctor(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
    }
	protected abstract void diagnose(Patient p1);
}
class Surgeon extends Doctor {
    public Surgeon(String name) {
        super(name, "Cardiologist");
    }
    public void diagnose(Patient patient) {
        System.out.println("Dr. " + name + " (" + specialization + ") is diagnosing " + patient.getName());
        System.out.println("Diagnosis: Patient may need an Operation.");
    }
}

