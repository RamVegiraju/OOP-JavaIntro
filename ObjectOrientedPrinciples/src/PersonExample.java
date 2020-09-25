
public class PersonExample {
	
	private String firstName;
	private String lastName;
	private int age;
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		if (age < 0 || age > 100) {
			this.age = 0;
		}else
			this.age = age;
	}
	
	public boolean isTeen() {
		if (this.age > 12 && this.age < 20) {
			return true;
		}else
			return false;
	}
	
	public String getFullName() {
		if (this.firstName.isEmpty() && this.lastName.isEmpty()) {
			return "";
		}else if (this.lastName.isEmpty()) {
			return this.firstName;
		}else if (this.firstName.isEmpty()) {
			return this.lastName;
		}else
			return this.firstName + " " + this.lastName;
	}
	
}
