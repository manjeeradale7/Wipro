package Day3aftn;
public class UserMain {	
	    public static void main(String[] args) {
	        Studen student = new Studen("Manjeera");
	        Professor professor = new Professor("Dale");
	        System.out.println("Student Profile");
	        student.showDetails();
	        System.out.println("\nProfessor Profile");
	        professor.showDetails();
	    }	
}
