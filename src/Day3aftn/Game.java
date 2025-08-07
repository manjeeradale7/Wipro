package Day3aftn;
public abstract class Game {	
	    public abstract void start();
	    public abstract void play();
	    public abstract void pause();
	    public abstract void stop();
	}
	class SnakeGame extends Game {
	    public void start() {
	        System.out.println("Snake Game Started");
	    }
	    public void play() {
	        System.out.println("Playing");
	    }
	    public void pause() {
	        System.out.println("Game Paused.");
	    }
	    public void stop() {
	        System.out.println("Game Stopped.");
	    }
	}
	class CarGame extends Game {
	    public void start() {
	        System.out.println("Car Game Started!");
	    }
	    public void play() {
	        System.out.println("Driving");
	    }
	    public void pause() {
	        System.out.println(" Game Paused.");
	    }
	    public void stop() {
	        System.out.println(" Game Stopped.");
	    }
	}


