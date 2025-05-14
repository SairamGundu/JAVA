package Singleton_design_model;

public class Student {
	static int count;
	static Student s;
	
	private Student() {
		
	}
	public static Student getStudent()
	{
		if(count==0)
		{
			count++;
			return s = new Student();
		}
		return s;
	}

}
