package Hierarical_Inheritance;

public class Student1 extends Teacher {

	String Sname;
	Student1(String Sname , String tname){
		super(tname);
		this.Sname=Sname;
	}
}
