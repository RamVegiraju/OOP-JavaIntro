/**
 * 
 * @author CS 2110 Faculty
 * Vet class, where all domesticated animals must visit
 *
 */
public class Vet {

	// TODO The following method is incomplete; you need to fix it to:
	// a) take an animal argument and b) have the animal make its noise
	public static void giveShot(Animal a) {
		// do horrible things to the animal
		System.out.print(a.getName() + " after the shot cried " + a.makeNoise());

	}
	
	public static void main(String[] args) {
		Animal a = new Dog("Dog Jack");
		Animal b = new Cat("Cat Garfield");
		Animal c = new Animal("Animal Marlow");
		String aType = String.valueOf(a.getClass()).substring(6);
		
		Vet vet = new Vet();
		vet.giveShot(a);
		vet.giveShot(b);
		vet.giveShot(c);
		
		// TODO Complete the rest of the code to print the following output:
		// > Dog Jack after the shot cried Woof!
		// > Cat Garfield after the shot cried Miaw!
		// > Animal Marlow after the shot cried ...

	}

}
