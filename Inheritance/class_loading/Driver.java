package Inheritance.class_loading;

public class Driver {
public static void main(String[] args) {
	Super.add(10,20);
	
	Sub.add(10, 30);
	
	Sub.sub(30, 10);
}
}
