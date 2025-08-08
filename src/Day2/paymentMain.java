package Day3aftn;
public class paymentMain {	
	    public static void main(String[] args) {
	        Payment ccPayment = new CCPayment("1234-5678-9101-1121");
	        Payment upiPayment = new UPIPayment("123456789@ybl");
	        ccPayment.pay(58360);
	        upiPayment.pay(48450);
	    }
	}


