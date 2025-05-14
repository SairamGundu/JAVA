package Playing_with_objects.factory_method;

public class tester {

	public static void main(String[] args) {
		//Box b1= new Box();
		//b1.length=10;
		//System.out.println(b1);
		//System.out.println(b1.length);
		
		Box b1 = Box.getBox();
				System.out.println(b1);
				b1.length =10;
				System.out.println(b1.length);
		
		Box b2 = Box.getBox(20);
		System.out.println(b2);
			
	}
}
