
public class Point {
	
	private double x;
	private double y;

	public Point(double x, double y){
		this.x = x;
		this.y = y;
	}
	
	public static void main(String[] args) {
		Point p1 = new Point(2, 2);
		Point p2 = new Point(1, 2);
		System.out.println("Point p1 has x value: " + p1.getX());
		System.out.println("Point p2 has x value: " +  p2.getX());
		p2.setY(3);
		System.out.println("Point p1 has y value: " + p1.getY());
		System.out.println("Point p2 has y value: " + p2.getY());
		
		System.out.println(p1);
		System.out.println(p2);

		System.out.println(p1.distance(p2));
	}
	
	public double distance(Point p){
		return Math.sqrt((this.x-p.x)*(this.x-p.x) + (this.y-p.y)*(this.y-p.y));
		
	}
	
	@Override
	public String toString(){
		return "(" + this.getX() + ", " + this.y + ")";
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

}