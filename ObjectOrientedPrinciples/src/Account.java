
public class Account {
	
	private String number;
	private double balance;
	private String customerName;
	private String customerEmailAddress;
	private String customerPhoneNumber;
	
	//constructor
	Account() {
		this("10", 2.50, "DefaulName", "DefaultAddress", "DefaultNumber");
		System.out.println("Empty constructor called");
	}
	
	//constructor overloading
	Account(String number, double balance, String customerName, String customerEmailAddress,
			String customerPhoneNumber){
		System.out.println("Account constructor called");
		//can also do
		//setNumber(number); useful for cases such as inheritance
		this.number = number;
		this.balance = balance;
		this.customerName = customerName;
		this.customerEmailAddress = customerEmailAddress;
		this.customerPhoneNumber = customerPhoneNumber;
		
	}
	
	
	
	Account(String customerName, String customerEmailAddress, String customerPhoneNumber) {
		//if you already have default values for a few variables
		this("9999", 100.55, customerName, customerEmailAddress, customerPhoneNumber);
	}

	public void deposit(double depositAmount) {
		this.balance += depositAmount;
		System.out.println("Deposit of " + depositAmount + "made. New balance is " + this.balance);
	}
	
	public void withdrawal(double withdrawalAmount) {
		if (this.balance - withdrawalAmount < 0) {
			System.out.println("Only " + balance + "available. Withdrawl not processed.");
		}else
			this.balance -= withdrawalAmount;
		System.out.println("Withdrawal of: " + withdrawalAmount + "processed.");
	}
	
	/**
	 * @return the number
	 */
	public String getNumber() {
		return number;
	}
	/**
	 * @param number the number to set
	 */
	public void setNumber(String number) {
		this.number = number;
	}
	/**
	 * @return the balance
	 */
	public double getBalance() {
		return balance;
	}
	/**
	 * @param balance the balance to set
	 */
	public void setBalance(double balance) {
		this.balance = balance;
	}
	/**
	 * @return the customerName
	 */
	public String getCustomerName() {
		return customerName;
	}
	/**
	 * @param customerName the customerName to set
	 */
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	/**
	 * @return the customerEmailAddress
	 */
	public String getCustomerEmailAddress() {
		return customerEmailAddress;
	}
	/**
	 * @param customerEmailAddress the customerEmailAddress to set
	 */
	public void setCustomerEmailAddress(String customerEmailAddress) {
		this.customerEmailAddress = customerEmailAddress;
	}
	/**
	 * @return the customerPhoneNumber
	 */
	public String getCustomerPhoneNumber() {
		return customerPhoneNumber;
	}
	/**
	 * @param customerPhoneNumber the customerPhoneNumber to set
	 */
	public void setCustomerPhoneNumber(String customerPhoneNumber) {
		this.customerPhoneNumber = customerPhoneNumber;
	}
	
	
	

}
