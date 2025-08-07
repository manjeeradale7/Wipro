package Day6;
import java.util.*;
class PinException extends Exception {
	public PinException(String message) {
		super(message);
	}
}
class BalanceException extends Exception {
	public BalanceException(String message) {
		super(message);
	}
}
class User {
	private int accountNumber;
	private int pin;
	private double balance;
	public User(int accountNumber, int pin, double balance) {
		this.accountNumber = accountNumber;
		this.pin = pin;
		this.balance = balance;
	}
	public boolean validatePin(int inputPin) throws PinException {
		if (this.pin != inputPin) {
			throw new PinException("Incorrect PIN.");
		}
		return true;
	}
	public double getBalance() {
		return balance;
	}
	public void deposit(double amount) {
		balance += amount;
		System.out.println("Rs" + amount + " deposited.");
	}
	public void withdraw(double amount) {
		balance -= amount;
		System.out.println("Rs" + amount + " withdrawn.");
	}
}
public class Atm {
	private static final int MAX_ATTEMPTS = 3;
	private static Scanner scanner = new Scanner(System.in);
	private static Map<Integer, User> userDatabase = new HashMap<>();
	public static void main(String[] args) {
		userDatabase.put(1, new User(1, 1234, 5000));
		userDatabase.put(2, new User(2, 5678, 3000));
		try {
			System.out.print("Enter account number: ");
			int accNumber = scanner.nextInt();
			User currentUser = userDatabase.get(accNumber);
			boolean authenticated = false;
			for (int attempt = 1; attempt <= MAX_ATTEMPTS; attempt++) {
				System.out.print("Enter PIN: ");
				int enteredPin = scanner.nextInt();
				try {
					currentUser.validatePin(enteredPin);
					authenticated = true;
					break;
				} catch (PinException e) {
					System.out.println("Attempt " + attempt + ": " + e.getMessage());
					if (attempt == MAX_ATTEMPTS) {
						System.out.println("Too many failed attempts. Card blocked.");
						return;
					}
				}
			}
			if (authenticated) {
				int choice;
				do {
					System.out.println("1. Check Balance");
					System.out.println("2. Deposit");
					System.out.println("3. Withdraw");
					System.out.println("4. Exit");
					choice = scanner.nextInt();
					switch (choice) {
					case 1:
						System.out.println("Balance: " + currentUser.getBalance());
					case 2: {
						System.out.print(" Enter deposit amount: ");
						double depositAmt = scanner.nextDouble();
						currentUser.deposit(depositAmt);
					}
					case 3: {
						System.out.print("Enter withdrawal amount: ");
						double withdrawAmt = scanner.nextDouble();
					}
					case 4:
						System.out.println("Thank you! Session ended.");
					}
				} while (choice != 4);
			}
		} finally {
			System.out.println("Transaction session logged.");
			scanner.close();
		}
	}
}