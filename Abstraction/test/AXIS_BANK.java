package Abstraction.test;


public class AXIS_BANK extends ATM{
	
	AXIS_BANK(int id,String location,String bank_name){
		super(id,location,bank_name);
	}
	public void welcome() {
		System.out.println("welcome to AXIS Bank");
		}
		public void generateCash() {
			System.out.println("withdrow the cash from AXIS  ATM");
		}
		
	}