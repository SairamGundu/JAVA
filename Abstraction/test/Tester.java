package Abstraction.test;

public class Tester {
	public static void main(String[] args) {
//		SBI_BANK s = new SBI_BANK(1203,"navi mumbai","SBI-BANK");
//		System.out.println("bank id is:" +s.id);
//		System.out.println("loaction of bank is:" + s.location);
//		System.out.println("bank name is:"+ s.bank_name);
//		s.welcome();
//		s.generateCash();
		ATM a = new SBI_BANK(1203,"navi mumbai","SBI-BANK");
		
		System.out.println("Bank id is:" +a.id);
		System.out.println("Loaction of bank is:" + a.location);
		System.out.println("Bank name is:"+ a.bank_name);
		a.welcome();
		a.generateCash();
		
		System.out.println();
		
		a = new AXIS_BANK(1298,"Thane","AXIS-BANK");
		System.out.println("Bank id is:" +a.id);
		System.out.println("Loaction of bank is:" + a.location);
		System.out.println("Bank name is:"+ a.bank_name);
		a.welcome();
		a.generateCash();
		
		System.out.println();
		
		a = new HDFC_BANK(1245,"Vashi","HDFC-BANK");
		System.out.println("Bank id is:" +a.id);
		System.out.println("Loaction of bank is:" + a.location);
		System.out.println("Bank name is:"+ a.bank_name);
		a.welcome();
		a.generateCash();
		
	}
}
		
		
		
