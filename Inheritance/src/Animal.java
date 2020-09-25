
public class Animal {
	
	private String name;
	private int brain;
	private int body;
	private int size;
	private int weight;
	
	public Animal(String name, int brain, int body, int size, int weight) {
		this.name = name;
		this.brain = brain;
		this.body = body;
		this.size = size;
		this.weight = weight;
	}
	
	//these methods are available to the base class
	public void eat() {
		System.out.println("Animal.eat() called");
	}
	
	public void move() {
		
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the brain
	 */
	public int getBrain() {
		return brain;
	}

	/**
	 * @return the body
	 */
	public int getBody() {
		return body;
	}

	/**
	 * @return the size
	 */
	public int getSize() {
		return size;
	}

	/**
	 * @return the weight
	 */
	public int getWeight() {
		return weight;
	}
	
	
	

}
