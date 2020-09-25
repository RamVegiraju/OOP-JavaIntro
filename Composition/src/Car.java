
public class Car extends Vehicle {
	private int doors;
	private int engineCapacity;
	
	//car has an is a relationship from vehicle (inheritance)
	//composition has a "has a" relationship
	public Car(String name, int doors, int engineCapacity) {
		super(name);
		this.doors = doors;
		this.engineCapacity = engineCapacity;
	}

}
