package Comparables;


public class laptop {

	String brand;
	double price;
	String model;
	String processor;
	
	public laptop(String brand, double price, String model, String processor) {
		
	this.brand=brand;
	this.price=price;
	this.model=model;
	this.processor= processor;
	}
	
	@Override
	public String toString() {
		return this.brand+" "+this.price+" "+this.model+" "+this.processor;
	}
	@Override
	public boolean equals (Object O) {
			laptop l = (laptop) O;
			return this.brand.equals(l.brand)&&this.price==l.price && this.model.equals(l.model) && this.processor==l.processor	;
		}
	

	public int compareTo(Object O) {
	laptop l =(laptop) O;
	if (this.price > l.price)
	{
		return-1;
	}
	else if (this.price < l.price) 
	{
		return 1;
	}
	else {
		return 0;
	}
}
}
	

