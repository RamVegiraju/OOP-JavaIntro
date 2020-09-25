
public class Dog extends Animal{
	
	//fields unique to Dog not all Animals
	private int eyes;
	private int legs;
	private int tail;
	private int teeth;
	private String coat;
	
	//all dogs have brain and body not going to make programmer initialize
	public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
		//super keyword initalizes the base class (animal class)
		super(name, 1, 1, size, weight); //super calls constructor for class that we are extending from
		this.eyes = eyes;
		this.legs = legs;
		this.tail = tail;
		this.teeth = teeth;
		this.coat = coat;
	}
	
	
	private void chew() {
		System.out.println("Dog.chew() called");
	}
	
	@Override
	public void eat() {
		System.out.println("Dog.eat() called"); //overrides base class method
		chew(); //calls a private method of the dog class
		super.eat(); //calls the base class method (animal class)
	}

}
