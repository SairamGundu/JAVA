package Boolean_equals;

public class Book {

	String title;
	double price;
	
	public Book(String title, double price) {
		this.title = title;
		this.price= price;
	}
	
	@Override
	public boolean equals(Object o) {
		
		Book b= (Book) o;
		
		return this.title.equals(b.title)&& this.price==b.price;
		
		
	}
}
