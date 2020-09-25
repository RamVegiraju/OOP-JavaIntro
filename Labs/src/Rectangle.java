

public class Rectangle {
	
	// fields
	private double length;
	private double width;
	
	// default constructor (takes no parameters)
	public Rectangle() {
		// length and width assigned default values (4 for length and 2 for width)
		this.length = 4;
		this.width = 2;
	}
	
	// constructor 
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}
	
	// WRITE an appropriate 
	//     (1) toString method
	//     (2) getter and setter methods for the length field
	//     (3) getter and setter methods for the width field 
	
	/**
	 * @return the length
	 */
	public double getLength() {
		return length;
	}

	/**
	 * @param length the length to set
	 */
	public void setLength(double length) {
		this.length = length;
	}

	/**
	 * @return the width
	 */
	public double getWidth() {
		return width;
	}

	/**
	 * @param width the width to set
	 */
	public void setWidth(double width) {
		this.width = width;
	}
	
	
	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", width=" + width + "]";
	}

	public static void main(String[] args) {
		Rectangle sample = new Rectangle(4,3);
		System.out.println(sample.toString());
		System.out.println(sample.getLength());
		System.out.println(sample.getWidth());
		sample.setLength(5);
		sample.setWidth(4);
		System.out.println(sample.getLength());
		System.out.println(sample.getWidth());
		

	}


}
