package Variable_shadowing_super;

public class Son extends Father {

	String name="John";
	
	public void displayDetails() {
		System.out.println("Father name is " + super.name);
		System.out.println("Son name is "+ name);

	}
}
