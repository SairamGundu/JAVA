package Constructor_overloading;

public class Classroom {
public static void main(String[] args) {
	Student s1 = new Student(101,"shital",19,"19/8/1997");
	System.out.println(s1.sid + "  " + s1.name + " " + s1.age + " " +s1.dob);
	
	Student s2 = new Student(102,"sairam",18);
System.out.println(s2.sid + "  " + s2.name + " " + s2.age + " " +s2.dob);

Student s3 = new Student(103,"seema");
	System.out.println(s3.sid + "  " + s3.name);

}
}
