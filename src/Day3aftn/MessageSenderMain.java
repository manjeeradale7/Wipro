package Day3aftn;
public class MessageSenderMain {
	    public static void main(String[] args) {
	        MessageSender sender; 
	        sender = new EmailSender();
	        sender.sendMessage("Email!");
	        sender = new SMSSender();
	        sender.sendMessage("SMS!");
	    }
	}


