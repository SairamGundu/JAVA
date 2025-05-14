package Passing_arguments_for_super_calling_statement;

public class Student extends Person {

	int sid;
	Student(int sid , String name){
		super(name);
		this.sid=sid;
	}
}
