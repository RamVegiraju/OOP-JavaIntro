import java.lang.Math.*;

public class Sphere implements Solids{
	
	private double radius;
	private String color, name;
	
	public Sphere(double radius, String color, String name){
		this.radius = radius;
		this.color = color;
		this.name = name;
	}
	
	//Volume = 4/3*pi*r^3
	public double getVolume(){
		return ((4/3) * (Math.PI) * (Math.pow(this.radius, 3)));
	}
	
	public String getColor(){
		return this.color; 
	}
	
	public String getName(){
		return this.name;
	}

}
