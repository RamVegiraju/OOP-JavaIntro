
public abstract class AnimalAbstract {
	
	private String name;
	
	AnimalAbstract() {
		name = "Unknown";
	}
	
	AnimalAbstract(String name) {
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
	
	public abstract String animalSound();																															
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
