package Day3aftn;
public abstract class Notification {
	    abstract void send(String message);
	}
	class EmailNotification extends Notification {
	    void send(String message) {
	        System.out.println("EMAIL: " + message);
	    }
	}
	class SMSNotification extends Notification {
	    void send(String message) {
	        System.out.println("SMS: " + message);
	    }
	}
	class PushNotification extends Notification {
	    void send(String message) {
	        System.out.println("PUSH notification: " + message);
	    }
	}

