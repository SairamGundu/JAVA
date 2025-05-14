package Constructors;
import java.util.Scanner;

public class Classroom {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Student 1");
		Student s1 = new Student();
		System.out.print("Enter Name");
		s1.name= sc.next();

		System.out.print("Enter age");
		s1.age= sc.nextInt();
		
		System.out.print("Enter Gender");
		s1.gender= sc.next();
		
		
		System.out.println(s1.name);
		System.out.println(s1.age);
		System.out.println(s1.gender);
		
		System.out.print("");
		System.out.print("Student 1");
		Student s2 = new Student();
		System.out.print("Enter Name");
		s2.name= sc.next();

		System.out.print("Enter age");
		s2.age= sc.nextInt();
		
		System.out.print("Enter Gender");
		s2.gender= sc.next();
		
		
		System.out.println(s2.name);
		System.out.println(s2.age);
		System.out.println(s2.gender);
		
		
		
		
		
	}
}
