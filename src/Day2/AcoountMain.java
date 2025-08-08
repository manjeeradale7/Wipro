package Day3aftn;
public class AcoountMain {
	    public static void main(String[] args) {
	        SavingsAccount sa = new SavingsAccount("Manjeera");
	        CurrentAccount ca = new CurrentAccount("Dale");
	        System.out.println("Savings Account");
	        sa.showDetails();
	        System.out.println("\nCurrent Account");
	        ca.showDetails();
	    }
	}


