package DataHiding_Encapsulation;

public class BankAccount {
private String accountHolderName;
private double balance;

public BankAccount(String accountHolderName,double initialBalance) 
{
	this.accountHolderName=accountHolderName;
	
	if(initialBalance>0) {
		balance = initialBalance;
	}
	else {
		System.out.println("Enter valid Amount");
	}
	
}

//Getter for accountHolderName

public String getAccountHolderName() {
	return accountHolderName;
}

//getter for Balance
public double getBalance() {
	return balance;
}

public void Deposit(double amount)
{
	if (amount>0)
	{
		balance = balance+amount;
		System.out.println();
	}
	else
	{
	System.out.println("Deposit valid amount");	
	}
	
}

public void Withdraw(double amount)
{
	if (amount>0 && balance>= amount)
	{
		balance = balance-amount;
	}
	else {
		System.out.println("Insufficient Balance");
	}
}
	
}


