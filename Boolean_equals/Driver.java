package Boolean_equals;


public class Driver {
	public static void main(String[] args) {
		
		Book b1 = new Book("java" , 100);
		Book b2 = new Book("python", 2000);
		Book b3 = new Book("java" , 100);
		
		
		System.out.println(b1.equals(b3));
		System.out.println(b1.equals(b2));
		
	}

}
