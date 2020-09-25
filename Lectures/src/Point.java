import java.util.ArrayList;

public class Point {
	
	//fields
	private double x; // x coordinate
	private double y; // y coordinate
	
	//constructor
	public Point() { //default constructor
		this.x = 0.0;
		this.y = 0.0;
	}
	
	//constructor 2
	//constructor overloading
	public Point(double x, double y) {
		this.x = x;
		this.y = y; //this differentiates between param passed in by method and this keyword
	}

	public static void main(String[] args) {
		//testing
		Point p; // a Point reference defined
		//doesnt create an actual point
		//p can hold a point but does not have anything
		Point p1 = new Point();
		Point p2 = new Point(3.0,0.0);
		// Point p3 = new Point(4.0,2.9.4.4.); error because not constructor that takes 3 params
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		//ArrayList<Point> points;
		//System.out.println(points);
		
		//testing distanceBetween method
		double dis = p1.distanceBetween(p2);
		System.out.println("Distance between p1 and p2");
		System.out.println(dis);
		

	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
	//writing separate methods
	//distance method
	public double distanceBetween(Point p) {
		double xdiff = this.x - p.x;
		double ydiff = this.y - p.y;
		
		return Math.sqrt(xdiff*xdiff + ydiff*ydiff);
	}

	/**
	 * @return the x
	 */
	public double getX() {
		return this.x;
	}

	/**
	 * @param x the x to set
	 */
	public void setX(double x) {
		this.x = x;
	}

	/**
	 * @return the y
	 */
	public double getY() {
		return this.y;
	}

	/**
	 * @param y the y to set
	 */
	public void setY(double y) {
		this.y = y;
	}
	
	

}
