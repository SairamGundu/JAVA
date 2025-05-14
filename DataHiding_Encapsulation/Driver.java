package DataHiding_Encapsulation;

public class Driver {

	public static void main(String[] args) {
		
		BankAccount b1 = new BankAccount("Sai", 1000);
		System.out.println(b1.getAccountHolderName());
		System.out.println(b1.getBalance());
		b1.Deposit(500);
		b1.Withdraw(100);
		System.out.println(b1.getBalance());
		
		
	}
}
