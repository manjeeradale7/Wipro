package Day4;
import java.util.HashMap;
public class Account {
	    private int accountNumber;
	    private String holderName;
	    private double balance;
	    public Account(int accountNumber, String holderName, double balance) {
	        this.accountNumber = accountNumber;
	        this.holderName = holderName;
	        this.balance = balance;
	    }
	    public int getAccountNumber() { 
	    	return accountNumber; 
	    	}
	    public String getHolderName() { 
	    	return holderName; 
	    	}
	    public double getBalance() { 
	    	return balance; 
	    	}
	    public void deposit(double amount) { 
	    	balance += amount; 
	    	}
	    public void withdraw(double amount) {
	        if (amount <= balance) 
	        	balance -= amount;
	        else System.out.println("Insufficient balance.");
	    }
	    public void display() {
	        System.out.println("Account No: " + accountNumber);
	        System.out.println("Holder: " + holderName);
	        System.out.println("Balance: Rs" + balance);
	    }
	}
	interface TransactionService {
	    void deposit(Account account, double amount);
	    void withdraw(Account account, double amount);
	}
	class TransactionManager implements TransactionService {
	    public void deposit(Account account, double amount) {
	        account.deposit(amount);
	        System.out.println("Deposited Rs" + amount);
	    }
	    public void withdraw(Account account, double amount) {
	        account.withdraw(amount);
	        System.out.println("Withdrawn Rs" + amount);
	    }
	}
	abstract class BankAccountType {
	    protected double rate;
	    public BankAccountType(double rate) {
	        this.rate = rate;
	    }
	    public abstract double calculateInterest(Account account);
	}

	class SavingsAccount extends BankAccountType {
	    public SavingsAccount() {
	        super(4.0); 
	    }
	    public double calculateInterest(Account account) {
	        return account.getBalance() * rate / 100;
	    }
	}
	class CurrentAccount extends BankAccountType {
	    public CurrentAccount() {
	        super(2.0); 
	    }
	    public double calculateInterest(Account account) {
	        return account.getBalance() * rate / 100;
	    }
	}

	

