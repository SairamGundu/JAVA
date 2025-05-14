package Non_primitive_typecating_Upcasting;

public class Person {

	String name;
	Person (String name)
	{
		this.name=name;
	}
}

class Student extends Person
{
	int sid;
	Student(int sid, String name){
	super (name);
	this.sid=sid;
	}
}
