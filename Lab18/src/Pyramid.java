
public class Pyramid implements Solids{
	
	private double length, width, height;
	private String color, name;
	
	public Pyramid(double length, double width, double height, String color, String name) {
		this.length = length;
		this.width = width;
		this.height = height;
		this.color = color;
		this.name = name;
	}
	
	//Volume = length*width*height/3
	public double getVolume(){
		return ((this.length * this.width * this.height)/3);
	}
	
	public String getColor(){
		return this.color;
	}
	
	public String getName(){
		return this.name;
	}

}
