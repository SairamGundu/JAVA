package Static_Member;

public class Static_variables {

	public static void main(String[] args) 
	{
		Driver d1 = new Driver("Python");
		Driver d2= new Driver("java");
		Driver.count=5;
		System.out.println(d1.title);
		System.out.println(d2.title);
		System.out.println(d1.count);
		System.out.println(d2.count);
		
	}	
	
}


