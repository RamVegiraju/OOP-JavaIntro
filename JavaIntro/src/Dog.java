
public class Dog extends Animal{
	
	Dog() {
		super();
	}
	
	Dog(String name) {
		super(name);
	}
	
	@Override //polymorphism overriding a method from the base
	public String animalSound() {
		return "It barks";
	}
	
	//method overloading, different signature
	public String animalSound(String expt) {
		return "Sound is: " + expt;
	}
	
	//method overloading vs method overwriting
	public String animalSound(String expt, String expt2) {
		return "Sound is: " + expt + expt2;
	}

	public static void main(String[] args) {
		Animal dog1 = new Dog("Milo");
		System.out.println(dog1.toString());
		System.out.println(dog1.animalSound());

	}

}
