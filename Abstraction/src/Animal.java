
public abstract class Animal {
	
	private String name;
	
	public Animal(String name) {
		this.name = name;
	}
	
	//abstract methods, the rest is normal java code
	public abstract void eat();
	public abstract void breathe();
	
	public String getName() {
		return name;
	}

}
