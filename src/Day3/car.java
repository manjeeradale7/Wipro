package Day3;
public class car {
	    private int speed;
	    private double fuelLevel;
	    public int getSpeed() {
	        return speed;
	    }
	    public void setSpeed(int speed) {
	        if (speed >= 0) {
	            this.speed = speed;
	        }
	    }
	    public double getFuelLevel() {
	        return fuelLevel;
	    }
	    public void setFuelLevel(double fuelLevel) {
	        if (fuelLevel >= 0 && fuelLevel <= 100) {
	            this.fuelLevel = fuelLevel;
	        }
	    }
	    public static void main(String[] args) {
	        car myCar = new car();
	        myCar.setSpeed(75);
	        myCar.setFuelLevel(63);
	        System.out.println("Speed: " + myCar.getSpeed() );
	        System.out.println("Fuel Level: " + myCar.getFuelLevel());
	    }
	}



