
public class Animal {
	
	private String name;
	
	Animal() {
		name = "Unknown";
	}
	
	Animal(String name) {
		this.name = name;
	}
	

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	

	@Override
	public String toString() {
		return "Animal [name=" + name + "]";
	}
	
	public String animalSound() {
		return "Unknown sound";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
