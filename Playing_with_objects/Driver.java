package Playing_with_objects;

public class Driver {
	public static void main(String[] args) {
		Student s1 =new Student();
		Student s2= s1;
		Student s3= s2;
		Student s4= s3;
		Student s5= s4;
	
		s1.id= 101;
		s1.name="sai";
		s1.age=23;
		
		System.out.println(s3.id);
		System.out.println(s3.name);
		System.out.println(s3.age);
		
		s4.id=102;
		s4.name="ram";
		s4.age=25;
		
		System.out.println(s5.id);
		System.out.println(s5.name);
		System.out.println(s5.age);
		
		System.out.println(s1.id);
		System.out.println(s1.name);
		System.out.println(s1.age);
		
		
		
		
		
		
	}

}
