package Hybrid_interface_test;

public class Calci2 extends Implementation implements CalciVersion2 {

		
		public double square(double a) {
			System.out.println("square of numbers is");
			return a*a;
		}
		@Override
		public double cube(double a) {
			
			System.out.println("cube of number is:");
			return a*a*a;
		}

		
		
	}

