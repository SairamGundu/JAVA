package Playing_with_objects.factory_method;

public class Box {

	int length;
	
	private Box() {
		
	}
	
	private Box(int length)
	{
		this.length=length;
	}
	
	public static Box getBox()
	{
		//Box b = new Box();
		//return b;
		return new Box();
	}
	public static Box getBox(int length)
	{
		return new Box(length);
	}
	
}
