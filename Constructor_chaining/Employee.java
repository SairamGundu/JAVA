package Constructor_chaining;

public class Employee {
	int eid;
	String ename;
	int age;
	double salary;
	String  department;
	
	Employee(){
		
		
		System.out.println("Sairam no con");
	}
	Employee(int eid){
		this();
		this.eid = eid;
	}
	Employee(int eid,String ename)
	{
	this(eid);
	this.ename = ename;
	}
	Employee(int eid,String ename,int age)
	{
		this(eid,ename);
		this.age = age;
	}
	Employee(int eid,String ename,int age,double salary)
	{
		this(eid,ename,age);
		this.salary = salary;
	}
	Employee(int eid,String ename,int age,double salary,String department)
	{
		this(eid,ename,age,salary);
		
		this.department = department;
	}
}
