public class Point {
    int x = 0;
    int y = 0;
    String color = null;

    public Point(int x, int y, String color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public Point(Point p) {
        this.x = p.x;
        this.y = p.y;
    }

    

    
   

	public static void main(String[] args) {
        Point a = new Point(1, 2, "red");
        Point b = new Point(2, 1, "blue");
        Point c = new Point(a);
        System.out.println(c.x);
        System.out.println(c.y);
        System.out.println(c.color);
        System.out.println(c.toString());
        
        
    }
}