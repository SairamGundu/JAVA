package Objects_and_classes;

public class Book {

	public static void main(String[] args) {
		Book b1;
		b1 = new Book();
		
		System.out.println(b1);
		
		Book b2 = new Book();
		System.out.println(b2);

		Book b3 = new Book();
		System.out.println(b3);

		System.out.print(b1 == b2);
		
	}
}

