
public class BankAccount {
	
	private String firstName;
	private String secondName;
	private double balance;
	
	public BankAccount(String firstName, String secondName, double balance) {
		this.firstName = firstName;
		this.secondName = secondName;
		this.balance = balance;
	}
	
	//The branch argument is true if the customer is performing the transaction
	//at a branch with a teller.
	//It's false if the customer is performing the transaction at an ATM
	public double deposit(double amount, boolean branch) {
		balance += amount;
		return balance;
	}
	
	//The branch argument is true if the customer is performing the transaction
	//at a branch with a teller.
	//It's false if the customer is performing the transaction at an ATM
	public double withdraw(double amount, boolean branch) {
		balance -= amount;
		return balance;
	}
	
	public double getBalance() {
		return balance;
	}
	
	

}
