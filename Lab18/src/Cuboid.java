
public class Cuboid implements Solids {

	private double length, width, height;
	
	private String color, name;
	
	public Cuboid(double length, double width, double height, String color, String name){
		this.length = length;
		this.width = width;
		this.height = height;
		this.color = color;
		this.name = name;
	}
	
	//Volume = length*width*height
	public double getVolume(){
		return (this.length * this.width * this.height);
	}
	
	public String getColor(){
		return this.color;
	}
	
	public String getName(){
		return this.name;
	}
	
}