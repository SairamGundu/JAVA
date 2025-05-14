package Inheritance.class_loading;

public class Super {

	static {
		System.out.println("Parent class is loaded");
	}
	
	public static void add(int a, int b) {
		System.out.println(a+b);
	}
}

class Sub extends Super{
	
	static {
		System.out.println("Child class is loaded");
	}
	
	public static void sub(int a, int b) {
		System.out.println(a-b);
	}
	
	
	
}
