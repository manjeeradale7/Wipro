package Day3aftn;
public class Animal {
	    private String name;
	    public Animal(String name) {
	        this.name = name;
	    }
	    public void displayInfo() {
	        System.out.println("Animal: " + name);
	    }
	}
	class Bird extends Animal {
	    public Bird(String name) {
	        super(name);
	    }
	    public void displayInfo() {
	        super.displayInfo();
	        System.out.println("Type: Bird");
	    }
	}
	class Mammal extends Animal {
	    public Mammal(String name) {
	        super(name);
	    }
	    public void displayInfo() {
	        super.displayInfo();
	        System.out.println("Type: Mammal");
	    }
	}
	class Reptile extends Animal {
	    public Reptile(String name) {
	        super(name);
	    }
	    public void displayInfo() {
	        super.displayInfo();
	        System.out.println("Type: Reptile");
	    }
	}

