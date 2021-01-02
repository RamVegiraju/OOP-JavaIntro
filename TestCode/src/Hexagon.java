
public class Hexagon {
    int x = 0; // x-coordinate in 2-D space
    int y = 0; // y-coordinate in 2-D space
    String color = null;
    static final int NUM_SIDES = 6;
    static int count = 0;
    public Hexagon(int x, int y, String color) { // Constructor 1
        this.x = x;
        this.y = y;
        this.color = color;
        this.count = this.count + 1; 
    }
    public Hexagon(Hexagon p) { // Constructor 2
        this.x = p.x;
        this.y = p.y;
        this.count = this.count + 1; 
    }
    public static void main(String[] args) { // main method
        Hexagon h1 = new Hexagon(1, 2, "red");
        Hexagon h2 = new Hexagon(2, 1, "blue");
        // following print statements (prints the value and a space)
        System.out.print(h1.count + " "); 
        Hexagon h3 = new Hexagon(h1);
        System.out.print(h3.count + " ");
        System.out.print(h2.count + " ");
        System.out.print(h2.NUM_SIDES);
    }
}