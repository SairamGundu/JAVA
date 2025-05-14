package Abstraction;

public abstract class Vehical {

	String model;
	int year;
	
	Vehical(String model, int year){
		this.model=model;
		this.year=year;
	}
	
	public abstract void start();
		public abstract void stop();
				
	
	
	
}
