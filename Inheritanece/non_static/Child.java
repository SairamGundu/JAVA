package Inheritanece.non_static;

public class Child extends Parent {
	
	double d;
	
	void test() {
		System.out.println("non-static method of child");
	}
	
	public static void main(String[] args) {
		Child c =new Child();
		
		System.out.println(c.a);
		System.out.println(c.d);
		c.demo();
		c.test();
	}

}
