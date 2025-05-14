package Objects_and_classes;

public class Non_static_methods {

	public void print() {
		System.out.println("non-static method");
	}
	
	public static void main(String[] args) {
		Non_static_methods d = new Non_static_methods();
		
		d.print();
	}
	
}
