import java.lang.Math.*;


public class Octahedron implements Solids{
	
	private double edge;
	private String color, name;
	
	public Octahedron(double edge, String color, String name){
		this.edge = edge;
		this.color = color;
		this.name = name;
	}
	
	// Volume= [(square root of 2)/3]  * edge^3  [Note: edge^3 is edge-cubed]
	public double getVolume(){
		return ((Math.sqrt(2)/3) * (Math.pow(this.edge, 3)));
	}
	
	public String getColor(){
		return this.color;
	}
	
	public String getName(){
		return this.name;
	}

}
