package Has_a_relationshi_one.to.one;

public class Driver {
public static void main(String[] args) {
	Car c =new Car("BMW");
	System.out.println(c.getBrand());
	Engine e = c.getEngine();
	System.out.println(e.getCC());
	System.out.println(c.getEngine().getCC());
	
	
	
}
}
