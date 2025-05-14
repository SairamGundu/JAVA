package Hierarical_Inheritance;

public class Classroom {

	public static void main(String[] args) {
		Student1 s1=new Student1("Balaji" , "Sai");
		System.out.println("Student 1 is: "+ s1.tname);
		System.out.println("Teacher 1 is :" + s1.Sname);
		
		Student2 s2=new Student2("Suhail" , "Ram");
		System.out.println("Student 2 is: "+ s2.tname);
		System.out.println("Teacher 2  is :" + s2.Sname);
		
		
		
	}
}
