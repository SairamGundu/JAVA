package Initializers;

public class Non_satic_initializers {

	static {
		
		System.out.println("I am static block 1");
		
	}
	
	{
		System.out.println("I am non Static block ");
		
	}
	
	Non_satic_initializers(){
		System.out.println("I m no args constructor");
	}
	
	
	public static void main(String[] args) {
		System.out.println("I am main method");
		Non_satic_initializers i = new Non_satic_initializers();
		Non_satic_initializers i1 = new Non_satic_initializers();
		
	}
	
	
}
