package toString;

public class Driver {
public static void main(String[] args) {
	Book b1 = new Book("Python", "james R", 1000);
			
			System.out.println(b1);
			System.out.println(b1.toString()
					);
	System.out.println(b1.title);
	System.out.println(b1.author);
	System.out.println(b1.price);
	
}
}
