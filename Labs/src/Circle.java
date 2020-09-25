
public class Circle {

	private Point p;
	private double radius;
	
	public Circle(Point c, double rad){
		p = c;
		radius = rad;
	}
	
	public Circle(){
		p = new Point(0,0);
		radius = 1;
	}
	
	
	
	public static void main(String[] args) {
	
		Point p = new Point(1,1);
		Circle c = new Circle(p, 3);
		System.out.println(c);
		
		String s = "3.1415";
		double pi = Double.parseDouble(s);
		System.out.println(pi * 5);
		
		
		//test equals method
		Circle c1 = c;
		Circle c2 = c;
		System.out.println(c1.equals(c2));
		
		Point p1 = new Point (0,5);
		Circle c4 = new Circle(p1,4);
		System.out.println(c.equals(c4));
	}
	
	@Override
	public String toString(){
		return "<" + p + ", " + "radius: " + radius +">";
	}
	
	@Override
	public boolean equals(Object o) {
		if(this == o) {
			return true;
		}
		
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		
		Circle tst = (Circle) o;
		return p.equals(this.p) && radius == this.radius;
		
	}

}
