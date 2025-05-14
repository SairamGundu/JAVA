package Constructor_overloading;

public class Employee {
	
		int eid;
		String ename;
		int age;
		double salary;
		String  department;
		
		Employee(){
			
		}
		Employee(int eid){
			this.eid = eid;
		}
		Employee(int eid,String ename)
		{
		this.ename = ename;
		}
		Employee(int eid,String ename,int age)
		{
			this.eid = eid;
			this.ename = ename;
			this.age = age;
		}
		Employee(int eid,String ename,int age,double salary)
		{
			this.eid = eid;
			this.ename = ename;
			this.age = age;
			this.salary = salary;
		}
		Employee(int eid,String ename,int age,double salary,String department)
		{
			this.eid = eid;
			this.ename = ename;
			this.age = age;
			this.salary = salary;
			this.department = department;
		}
		
			
		
	}


