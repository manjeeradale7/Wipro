package Day4;
	public class BankApp {
	    public static void main(String[] args) {
	        Account acc1 = new Account(1, "Manjeera", 5000.0);
	        Account acc2 = new Account(7, "Siri", 8000.0);
	        TransactionService service = new TransactionManager();
	        service.deposit(acc1, 2000);
	        service.withdraw(acc2, 1000);
	        System.out.println("\nAccount Details:");
	        acc1.display();
	        acc2.display();
	        BankAccountType accountType1 = new SavingsAccount();
	        BankAccountType accountType2 = new CurrentAccount();
	        System.out.println("\nInterest Calculations:");
	        System.out.println("Savings Interest: Rs" + accountType1.calculateInterest(acc1));
	        System.out.println("Current Interest: Rs" + accountType2.calculateInterest(acc2));
	    }
	}

