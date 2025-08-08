package Day3aftn;
public class AnimalMain {	
	    public static void main(String[] args) {
	        Bird bird = new Bird("Pigeon");
	        Mammal mammal = new Mammal("Elephant");
	        Reptile reptile = new Reptile("Snake");
	        System.out.println("Bird");
	        bird.displayInfo();
	        System.out.println("\nMammal");
	        mammal.displayInfo();
	        System.out.println("\nReptile");
	        reptile.displayInfo();
	    }
	}


