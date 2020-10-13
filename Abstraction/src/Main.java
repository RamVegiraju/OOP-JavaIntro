
public class Main {

	public static void main(String[] args) {
		Dog dog = new Dog("Yorkie");
		dog.breathe();
		dog.eat();
		
		//cannot instantiate an abstract class
		/*
		Bird bird = new Bird("Parrot");
		bird.breathe();
		bird.eat();*/
		
		//need to create a new class
		Parrot parrot = new Parrot("Australian ringneck");
		parrot.breathe();
		parrot.eat();
		
		Penguin penguin = new Penguin("Emperor");
		penguin.fly();
		penguin.breathe();
		penguin.eat();

	}

}
