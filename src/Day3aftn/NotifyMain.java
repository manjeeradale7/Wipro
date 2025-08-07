package Day3aftn;
public class NotifyMain {	
	    public static void main(String[] args) {
	        Notification email = new EmailNotification();
	        Notification sms = new SMSNotification();
	        Notification push = new PushNotification();
	        email.send("Hello");
	        sms.send("Recieved a Text");
	        push.send("Notification");
	    }
	}

