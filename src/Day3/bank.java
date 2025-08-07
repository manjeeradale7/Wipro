package Day3;
public class bank {
	    private double balance;
	    public double getBalance() {
	        return balance;
	    }
	    public void setDeposit(double amount) {
	        if (amount > 0) {
	            balance += amount;
	        } else {
	            System.out.println("Deposit must be positive.");
	        }
	    }
	    public void setWithdraw(double amount) {
	        if (amount > 0 && amount <= balance) {
	            balance -= amount;
	        } 
	    }
	        public static void main(String[] args) {
		        bank account = new bank();
	       account.setDeposit(6000);     
		        account.setWithdraw(800);     
		            
		        System.out.println("Final Balance: Rs" + account.getBalance());
		    
		
	    }
	}

	


	

