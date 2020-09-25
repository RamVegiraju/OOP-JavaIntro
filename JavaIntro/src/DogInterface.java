
public class DogInterface implements AnimalInterface{
	
	private String name;
	
	DogInterface() {
		name = "";
	}
	
	DogInterface(String name) {
		this.name = name;
	}
	
	
	@Override //polymorphism overriding a method from the base
	public String animalSound() {
		return "It barks";
	}
	
	
	public static void main(String[] args) {
		AnimalInterface dog1 = new DogInterface("Milo");
		System.out.println(dog1.toString());
		System.out.println(dog1.animalSound());

	}

}
