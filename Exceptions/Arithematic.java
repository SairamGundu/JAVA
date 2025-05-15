package Exceptions;

public class Arithematic {
	public static void main(String[] args) {
		try{
			int a = 10;
		
        int b = 0;
        int result = a / b;  // This will throw ArithmeticException
        System.out.println("Result: " + result);
		}
		catch(ArithmeticException e)
	{
			System.out.println("Error please divide valid no.");
	}
		
	}
}
