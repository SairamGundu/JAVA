package Singleton_design_model;

public class Driver {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1 =Student.getStudent();
		System.out.println(s1);
		Student s2 = Student.getStudent();
		System.out.println(s2);
		Student s3 = Student.getStudent();
		System.out.println(s3);

		

	}
}
