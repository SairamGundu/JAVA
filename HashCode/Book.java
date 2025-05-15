package HashCode;


public class Book {

	String title;
	double price;

	Book(String title, double price){
		this.title=title;
		this.price=price;
		
	}

	@Override 

	public boolean equals(Object o) {
		Book b = (Book) o;
		
		return this.price == b.price && this.title.equals(b.title);
		
		

	}

	@Override
	public int hashCode() {
		return (int) price + title.hashCode();
	}
}
