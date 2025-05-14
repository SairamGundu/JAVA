package Encapsulation;

public class office {

	public static void main(String[] args) {
		
	Employee e =new Employee();
	
	e.setId(101);
	e.setName("Sairam");
	e.setAge(23);
	e.setSalary(30000);
	e.setDepartment("Tech");
	
	System.out.println(e.getId());
	System.out.println(e.getName());
	System.out.println(e.getAge());
	System.out.println(e.getSalary());
	System.out.println(e.getDepartment());
	
Employee e1 =new Employee();
	
	e1.setId(102);
	e1.setName("navin");
	e1.setAge(23);
	e1.setSalary(10000);
	e1.setDepartment("Tech");
	
	System.out.println(e1.getId());
	System.out.println(e1.getName());
	System.out.println(e1.getAge());
	System.out.println(e1.getSalary());
	System.out.println(e1.getDepartment());
	
Employee e2=new Employee();
	
	e2.setId(103);
	e2.setName("Ramu");
	e2.setAge(25);
	e2.setSalary(350000);
	e2.setDepartment("Tech");
	
	System.out.println(e2.getId());
	System.out.println(e2.getName());
	System.out.println(e2.getAge());
	System.out.println(e2.getSalary());
	System.out.println(e2.getDepartment());
	}
}
