package toString;

public class Book {

	String title;
	String author;
	int price;
	
	public Book (String title, String author, int price) {
		
		this.title=title;
		this.author=author;
		this.price=price;
		
	}
	
	@Override
	public String toString() {
		return this.title + " " + this.author + " "+ this.price;
	}
	
}
