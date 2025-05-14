package Has_a_relationshi_one.to.one;

public class Car {
private String brand;

public String getBrand() {
	return brand;
	
}

public void setBrand(String brand) {

this.brand=brand;

}
Car(){}
Car(String brand){
	
	setBrand(brand);
}

private Engine e = new Engine(1000);

public Engine getEngine()
{
	return e;
}
}
