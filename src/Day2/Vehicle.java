package Day3aftn;
public abstract class Vehicle {
	    public abstract void startEngine();
	}
	class Car extends Vehicle {
	    public void startEngine() {
	        System.out.println("Car engine started.");
	    }
	}
	class Bike extends Vehicle {
	    public void startEngine() {
	        System.out.println("Bike engine started.");
	    }
	}


