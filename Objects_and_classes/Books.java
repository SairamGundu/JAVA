package Objects_and_classes;

public class Books {
	
	String title;
	String author;
	int price;
	
	public static void main(String[] args) {
		
		Books b = new Books();
		System.out.println("========Before Initialisation=======");
		System.out.println("Title: " + b.title);
		System.out.println("Author: " + b.author);
		System.out.println("Price: " + b.price);
		
		b.title = "Java P";
		b.author = "J.G";
		b.price = 500;
		
		System.out.println("========After Initialisation=======");
		System.out.println("Title: " + b.title);
		System.out.println("Author: " + b.author);
		System.out.println("Price: " + b.price);
		
		
		Books b2 = new Books();

		b2.title = "SQL";
		b2.author = "E.G";
		b2.price = 250;
		
		System.out.println("========After Initialisation=======");
		System.out.println("Title: " + b2.title);
		System.out.println("Author: " + b2.author);
		System.out.println("Price: " + b2.price);
		
		Books b3 = new Books();

		b3.title = "Web Tech";
		b3.author = "abc";
		b3.price = 400;
		
		System.out.println("========After Initialisation=======");
		System.out.println("Title: " + b3.title);
		System.out.println("Author: " + b3.author);
		System.out.println("Price: " + b3.price);
		
		
		
	}
}
