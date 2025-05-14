package Hybrid_interface_test;

public class Calci1 extends Implementation implements CalciVersion1  {
	@Override
	 public double power(double a,double b) {
		 System.out.println("Power of two numbers:");

	       return (a* b);
	       
		    }
		
}
