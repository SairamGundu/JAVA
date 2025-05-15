package Object_class;

public class Driver {

	public static void main(String[] args) {
		
		Book b1 = new Book("java" , 100);
		Book b2 = new Book("python", 2000);
		Book b3 = new Book("java" , 200);
		
		System.out.println(b1.hashCode());
		System.out.println(b2.hashCode());
		System.out.println(b3.hashCode());
		System.out.println(b1.hashCode()==b3.hashCode());
		System.out.println(b1.equals(b3));
		
		
		
	}

}
