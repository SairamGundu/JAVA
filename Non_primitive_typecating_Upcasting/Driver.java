package Non_primitive_typecating_Upcasting;

public class Driver {
public static void main(String[] args) {
Student s=	new Student(101, "Sai");
System.out.println(s.sid);
System.out.println(s.name);
System.out.println("*********************");
//Upcasting Implicitly
Person p =s;
System.out.println(p.name);
//System.out.println(p.sid);//CTE
System.out.println("*********************");
//Upcasting explicitly
Person  p1 =(Person) s;
System.out.println(p1.name);
}
}
