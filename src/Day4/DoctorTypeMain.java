package Day4;
public class DoctorTypeMain {
    public static void main(String[] args) {
        PatientServiceImpl service = new PatientServiceImpl();
        Patient p1 = new Patient(1, "A", "Fever");
        Patient p2 = new Patient(2, "B", "Heart Pain");
        service.register(p1);
        service.register(p2);
        System.out.println("\nShowing patient details:");
        service.show(1);
        System.out.println();
        service.show(2);
        DoctorTypes doc1 = new GeneralPhysician("Sameera");
        DoctorTypes doc2 = new Cardiologist("Manjeera");
        doc1.diagnose(p1); 
        System.out.println();
        doc2.diagnose(p2); 
    }
}

