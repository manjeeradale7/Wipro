package Day3aftn;
public class RemoteMain {
	    public static void main(String[] args) {
	        Remote tv = new TVRemote();
	        Remote ac = new ACRemote();
	        tv.turnOn();
	        tv.turnOff();
	        ac.turnOn();
	        ac.turnOff();
	    }	
}
