package Day3aftn;
public abstract class Payment {	
	    public abstract void pay(double amount);
	}
	class CCPayment extends Payment {
	    private String cardNumber;
	    public CCPayment(String cardNumber) {
	        this.cardNumber = cardNumber;
	    }
	    public void pay(double amount) {
	        System.out.println("Paid " + amount + "/- using Credit Card  " 
	            + cardNumber.substring(cardNumber.length()));
	    }
	}
	class UPIPayment extends Payment {
	    private String upiId;
	    public UPIPayment(String upiId) {
	        this.upiId = upiId;
	    }
	    public void pay(double amount) {
	        System.out.println("Paid " + amount + "/- using UPI ID " + upiId);
	    }
	}

