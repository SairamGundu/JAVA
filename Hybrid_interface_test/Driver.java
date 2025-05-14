package Hybrid_interface_test;

public class Driver {

	public static void main(String[] args) {
		Calci1 c1  = new Calci1();
		Calci2 c2 = new Calci2();
		
		System.out.println("addition"+ c1.add(10));
		System.out.println("addition"+ c1.add(10,20));
		System.out.println("subraction"+ c1.sub(10,5));
		System.out.println("Power"+ c1.power(10.0,20.1));

		System.out.println("power"+ c2.square(10));
		System.out.println("cube"+ c2.cube(20));
		
		
	}
	
	





	
}
