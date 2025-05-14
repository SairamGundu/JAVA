package Abstraction.test;

public abstract class ATM {
int id;
String location;
String bank_name;

ATM(int id,String location,String bank_name){
	this.id=id;
	this.location=location;
	this.bank_name=bank_name;
	
}

public abstract void welcome();
public abstract void generateCash();
}
