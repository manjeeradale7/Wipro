package Day3;
public abstract class Notification {	
	
	    abstract void send(String message);
	}

	class EmailNotification extends Notification {
	    void send(String message) {
	        System.out.println("Sending EMAIL: " + message);
	    }
	}

	class SMSNotification extends Notification {
	    void send(String message) {
	        System.out.println("Sending SMS: " + message);
	    }
	}

	class PushNotification extends Notification {
	    void send(String message) {
	        System.out.println("Sending PUSH notification: " + message);
	    }
	}

	class TestNotificationSystem {
	    public static void main(String[] args) {
	        Notification email = new EmailNotification();
	        Notification sms = new SMSNotification();
	        Notification push = new PushNotification();

	        email.send("Hello via Email!");
	        sms.send("Hello via SMS!");
	        push.send("Hello via Push Notification!");
	    }
	}

