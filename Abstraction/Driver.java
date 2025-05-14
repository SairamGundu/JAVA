package Abstraction;

public class Driver {
public static void main(String[] args) {
	Car c = new Car("amg", 2024);
	System.out.println("Car model is " + c.model);
	System.out.println("Car year is " + c.year);
	c.start();
	c.stop();

	Vehical V1 = new Car("amg", 2024);
	System.out.println("Car model is " + V1.model);
	System.out.println("Car year is " + V1.year);
	V1.start();
	V1.stop();
	
	Vehical V2 = new Bike("Honda", 2024);
	System.out.println("Bike model is " + V2.model);
	System.out.println("Bike year is " + V2.year);
	V2.start();
	V2.stop();

	
	
}
}
