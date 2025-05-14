package Static_Methods;

public class Sample {

	public static void print() {
		System.out.println("Hi i am static method");
	}
	
	public static void main(String[] args) {
		print();
		Sample.print();
	}
}
