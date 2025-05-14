package Abstraction.test;

public class HDFC_BANK extends ATM {
	
	HDFC_BANK(int id,String location,String bank_name){
		super(id,location,bank_name);
	}
	public void welcome() {
		
	System.out.println("welcome to HDFC Bank");
	}
	public void generateCash() {
		System.out.println("withdrow the cash from HDFC  ATM");
	}
	

}