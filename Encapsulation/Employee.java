package Encapsulation;

public class Employee {

	private int id;
	private String name;
	private int age;
	private double salary;
	private String department;
	
	////getter for id;
	public int getId() {
		return id;
	}
	
	//Setter for id;
	public void setId(int id) {
		this.id=id;
	}
	
	//getter for name;
	public String getName(){
		return name;
	}
	
	//setter for name;
	public void setName(String name) {
		this.name=name;
	}
	
	//getter for age;
		public int getAge(){
			return age;
		}
		
		//setter for age;
		public void setAge(int age) {
			this.age=age;
		}
		
		//getter for salary;
		public double getSalary(){
			return salary;
		}
		
		//setter for salary;
		public void setSalary(double salary) {
			this.salary=salary;
		}
		
		//getter for dept;
		public String getDepartment(){
			return department;
		}
		
		//setter for dept;
		public void setDepartment(String department) {
			this.department=department;
		}
		
}
