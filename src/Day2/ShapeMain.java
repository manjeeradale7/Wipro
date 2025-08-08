package Day3aftn;
public abstract class ShapeMain {	
	    public static void main(String[] args) {
	        Shape circle = new Circle(45);
	        Shape rectangle = new Rectangle(85, 4);
	        System.out.println("Circle area: " + circle.area());
	        System.out.println("Rectangle area: " + rectangle.area());
	    }
	}


