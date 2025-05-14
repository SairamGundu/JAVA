package Constructor_chaining;


public class Office {
	public static void main(String[] args) {
   Employee e1 = new Employee(123,"Sai",41,42000,"Sals");
			System.out.println(e1.eid + " "+ e1.ename +" " + e1.age + " " + e1.salary + " " + e1.department);

			Employee e2 = new Employee();
			
	}
}
