package Day5;
public class Copy {
	    String name;
	    int Id;
	    Copy(String name, int Id) {
	        this.name = name;
	        this.Id = Id;
	    }
	    Copy(Copy other) {
	        this.name = other.name;
	        this.Id = other.Id;
	    }
	    public static void main(String[] args) {
	        Copy s1 = new Copy("Manjeera", 7);
	        Copy s2 = new Copy(s1); 
	        System.out.println("Original: " + s1.name + ", " + s1.Id);
	        System.out.println("Copy: " + s2.name + ", " + s2.Id);
	    }
	}

