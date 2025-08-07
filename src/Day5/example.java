package Day5;

public class example {
static class Inside{
	static class Again{
		static void show() {
			System.out.println("Inside inner static class");
		}
	}
	void display() {
		System.out.println("Inside class");
	}
}
public static void main(String[]args) {
	example.Inside inner = new example.Inside();
	inner.display();
	example.Inside.Again.show();
}
}
