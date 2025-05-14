package Constructor_overloading;

public class Driver {
 public static void main(String[] args) {
	 Employee e1 = new Employee(123,"Sai",41,42000,"Sals");
		System.out.println(e1.eid + " "+ e1.ename +" " + e1.age + " " + e1.salary + " " + e1.department);
		
		Employee e2 = new Employee(124,"rami",42,50000,"dev");
		System.out.println(e2.eid + " "+ e2.ename +" " + e2.age + " " + e2.salary + " " + e2.department);
		
		Employee e3 = new Employee(124,"ramu",42);
		System.out.println(e3.eid + " "+ e3.ename +" " + e3.age );
}
}
