package Hybrid_interface_test;

public class Implementation implements BasicCalci {

	@Override
	public int add(int a) {
		System.out.println("adding a number");
		return a;
	}
	@Override
	public int add(int a, int b) {
		System.out.println("adding two number");
		return a+b;
	}
	@Override
	public int sub(int a, int b) {
		System.out.println("subtract two number");
		return a-b;
	}
	
	
	
}
