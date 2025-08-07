package Day3aftn;
public class MessageSender {
	    public void sendMessage(String message) {
	        System.out.println("Sending message: " + message);
	    }
	}
	class EmailSender extends MessageSender {
	    public void sendMessage(String message) {
	        System.out.println("Email sent: " + message);
	    }
	}
	class SMSSender extends MessageSender {
	    public void sendMessage(String message) {
	        System.out.println("SMS sent: " + message);
	    }
	}


