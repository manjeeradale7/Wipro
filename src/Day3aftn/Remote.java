package Day3aftn;
public abstract class Remote {
	    public abstract void turnOn();
	    public abstract void turnOff();
	}
	class TVRemote extends Remote {
	    public void turnOn() {
	        System.out.println("TV is turned ON.");
	    }
	    public void turnOff() {
	        System.out.println("TV is turned OFF.");
	    }
	}
	class ACRemote extends Remote {
	    public void turnOn() {
	        System.out.println("AC is turned ON.");
	    }
	    public void turnOff() {
	        System.out.println("AC is turned OFF.");
	    }
	}


