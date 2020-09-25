
public class Point {
	
	private int x;
	private int y;
	
	public Point() {
		x = 0;
		y = 0;
	}
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	

	/**
	 * @return the x
	 */
	public int getX() {
		return x;
	}

	/**
	 * @param x the x to set
	 */
	public void setX(int x) {
		this.x = x;
	}

	/**
	 * @return the y
	 */
	public int getY() {
		return y;
	}

	/**
	 * @param y the y to set
	 */
	public void setY(int y) {
		this.y = y;
	}
	
	//Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1))
	//first method takes no parameters and returns distance from the origin
	public double distance() {
		double result = Math.sqrt((y - 0) * (y - 0) + (x - 0) * (x - 0));
		return result;
	}
	
	//second method takes in x and y coordinates of another point
	public double distance(int x, int y) {
		double result = Math.sqrt((this.y - y) * (this.y - y) + (this.x - x) * (this.x - x));
		return result;
	}
	
	//third method takes in a point type
	public double distance(Point pt) {
		double result = Math.sqrt((this.y - pt.y) * (this.y - pt.y) + (this.x - pt.x) * (this.x - pt.x));
		return result;
	}
	

	public static void main(String[] args) {
		Point pt1 = new Point(6,5);
		Point pt2 = new Point(3,1);
		System.out.println(pt1.distance());
		System.out.println(pt1.distance(2,2));
		System.out.println(pt1.distance(pt2));
		
		Point point = new Point();
		System.out.println(point.distance());
		

	}

}
