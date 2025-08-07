package Day3;

public class bankmain {
	public class Main {
	    public static void main(String[] args) {
	        bank account = new bank();
       account.setDeposit(6000);     
	        account.setWithdraw(800);     
	        account.setWithdraw(600);     
	        account.setDeposit(-90);      
	        System.out.println("Final Balance: Rs" + account.getBalance());
	    }
	}

}
