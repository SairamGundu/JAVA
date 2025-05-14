package Abstraction.test;

public class SBI_BANK extends ATM {
	
	SBI_BANK(int id,String location,String bank_name){
		
		super(id,location,bank_name);
	}	
	public void welcome() {
		
		System.out.println("welcome to SBI Bank");
	}
	public void generateCash() {
		System.out.println("withdrow the cash from SBI  ATM");
	}
	
}
