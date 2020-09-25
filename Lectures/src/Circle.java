//Class to represent a circle
public class Circle {
	
	// fields
	private double radius;
	private Point center; //data type can be another class
	
	//constructor
	public Circle (double radius, Point center) {
		this.radius = radius;
		this.center = center;
	}
	
	//another constructor
	public Circle(Circle c) { //copy constructor passing an object of the same type
		this.radius = c.radius;
		this.center = c.center;
	}

	public static void main(String[] args) {
		Point centerPoint = new Point(1.0, 2.0);
		Circle c1 = new Circle(3.0, centerPoint);
		System.out.println("Circle c1 is: " + c1);
		c1.setRadius(-3.0);
		System.out.println(c1);
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", center=" + center + "]";
	}

	/**
	 * @return the radius
	 */
	public double getRadius() {
		return radius;
	}

	/**
	 * @param radius the radius to set
	 */
	public void setRadius(double radius) { //input validation
		if(radius > 0) {
			this.radius = radius;
		}
		//otherwise, if someone provides value out of range
		else
			this.radius = 1.0;
	}

	/**
	 * @return the center
	 */
	public Point getCenter() {
		return center;
	}

	/**
	 * @param center the center to set
	 */
	public void setCenter(Point center) {
		this.center = center;
	}
	
	
	
	

}
