
//can have abstract class that extends from another abstract classes
//cannot instantiate an abstract class
public abstract class Bird extends Animal implements CanFly{
	
	public Bird(String name) {
		super(name);
	}
	
	@Override
	public void eat() {
		System.out.println(getName() + " is pecking ");
		
	}
	
	@Override
	public void breathe() {
		System.out.println("Breathe in, breathe out, repeat");
	}
	
	@Override
	public void fly() {
		System.out.println(getName() + "is flapping its wings");
	}

}
