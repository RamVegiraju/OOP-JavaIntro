import java.util.TreeSet;

public class Vehicle {
	
	private int wheels;
	private String fuel;
	
	Vehicle(int wheels, String fuel) {
		this.wheels = wheels;
		this.fuel = fuel;
	}

	public static void main(String[] args) {
		Vehicle aVehicle = new Vehicle(4,"gasoline");
		String s = aVehicle.toString();
		System.out.println(s);
		TreeSet<Double> treeHeights = new TreeSet<Double>();
		treeHeights.add(2.3);
		treeHeights.add(10.0);
		treeHeights.add(2.3);
		treeHeights.add(10.0);
		treeHeights.remove(2.3);
		treeHeights.add(3.7);
		System.out.println(treeHeights.toString());
	}

}