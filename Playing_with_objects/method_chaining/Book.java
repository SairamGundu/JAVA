package Playing_with_objects.method_chaining;

public class Book {

	private int id;
	private String name;
	private String author;
	private int price;
	
//getters
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public int getPrice() {
		return price;
	}
	
//setters
	
	public Book setId(int id) {
		this.id=id;
		return this;
	}
	public Book setName(String name) {
		this.name=name;
		return this;
	}
	public Book setAuthor(String author) {
		this.author=author;
		return this;
	}
	public void setPrice(int price) {
		this.price=price;
		
	}
}
