package Day3aftn;
public class Account {
	    protected String name;
	    public Account(String name) {
	        this.name = name;
	    }
	    public void showDetails() {
	        System.out.println("Account Holder: " + name);
	    }
	}
	class SavingsAccount extends Account {
	    public SavingsAccount(String name) {
	        super(name);
	    }
	    public void showDetails() {
	        super.showDetails();
	        System.out.println("Account Type: Savings");
	    }
	}
	class CurrentAccount extends Account {
	    public CurrentAccount(String name) {
	        super(name);
	    }
	    public void showDetails() {
	        super.showDetails();
	        System.out.println("Account Type: Current");
	    }
	}


