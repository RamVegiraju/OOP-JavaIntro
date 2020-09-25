
public class VipPerson {
	
	private String name;
	private double creditLimit;
	private String emailAddress;
	
	//default constructor
	VipPerson() {
		this("Default name", 50000.00, "default@email.com");
	}
	
	VipPerson(String name, double creditLimit) {
		this(name, creditLimit, "unknown@email.com");
	}

	VipPerson(String name, double creditLimit, String emailAddress) {
		this.name = name;
		this.creditLimit = creditLimit;
		this.emailAddress = emailAddress;
	}
	
	//getters

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the creditLimit
	 */
	public double getCreditLimit() {
		return creditLimit;
	}

	/**
	 * @return the emailAddress
	 */
	public String getEmailAddress() {
		return emailAddress;
	}

	@Override
	public String toString() {
		return "VipPerson [name=" + name + ", creditLimit=" + creditLimit + ", emailAddress=" + emailAddress + "]";
	}
	
	
	
	
	

}
