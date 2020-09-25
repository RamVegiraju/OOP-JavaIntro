
public class Polygon {
	
	private int sides;
	private String type;
	
	Polygon() {
		sides = 0;
		type = "unknown";
	}
	
	Polygon(int sides, String type) {
		this.sides = sides;
		this.type = type;
	}
	

	/**
	 * @return the sides
	 */
	public int getSides() {
		return sides;
	}

	/**
	 * @param sides the sides to set
	 */
	public void setSides(int sides) {
		this.sides = sides;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
