package Abstraction;

public class Car extends Vehical {
		
		Car (String model, int year){
		super(model, year);	
		}
		
		public void start() {
			System.out.println("Car started");
			
		}
		
		public void stop() {
			System.out.println("Car stopped");
			
		}
		
	 }

