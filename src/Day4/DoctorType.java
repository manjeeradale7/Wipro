package Day4;
abstract class DoctorTypes {
    protected String name;
    protected String specialization;
    public DoctorTypes(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
    }
    public abstract void diagnose(Patient patient);
}
class GeneralPhysician extends DoctorTypes {
    public GeneralPhysician(String name) {
        super(name, "General Medicine");
    }
    public void diagnose(Patient patient) {
        System.out.println("Dr. " + name + " (" + specialization + ") diagnoses " + patient.getName());
        System.out.println("Diagnosis: Basic care advised for " + patient.getIllness() + ".");
    }
}
class Cardiologist extends DoctorTypes {
    public Cardiologist(String name) {
        super(name, "Cardiology");
    }
    public void diagnose(Patient patient) {
        System.out.println("Dr. " + name + " (" + specialization + ") diagnoses " + patient.getName());
            System.out.println("Diagnosis: Referred to general physician.");
        }
    }
