package Inheritance;

public class Child extends Parent  {
	
	static String s;
	public static void demo() {
		System.out.println("child class static()");
		
	}
	
	public static void main(String[] args) {
		System.out.println(s);
		System.out.println(a);
		demo();
		print();
	}

}
