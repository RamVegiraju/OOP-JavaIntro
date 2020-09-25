
public class Wall {
	
	private double width;
	private double height;
	
	public Wall() {
		width = 0.0;
		height = 0.0;
	}
	
	public Wall(double width, double height) {
		if (width < 0) {
			this.width = 0;
		}else
			this.width = width;
		if (height < 0) {
			this.height = 0;
		}else
			this.height = height;
	}
	

	/**
	 * @return the width
	 */
	public double getWidth() {
		return width;
	}

	/**
	 * @return the height
	 */
	public double getHeight() {
		return height;
	}
	
	

	/**
	 * @param width the width to set
	 */
	public void setWidth(double width) {
		if (width < 0) {
			this.width = 0;
		}else
			this.width = width;
	}

	/**
	 * @param height the height to set
	 */
	public void setHeight(double height) {
		if (height < 0) {
			this.height = 0;
		}else
			this.height = height;
	}
	
	public double getArea() {
		return (this.height * this.width);
	}

	public static void main(String[] args) {
		Wall wall = new Wall(5,4);
		System.out.println("area= " + wall.getArea());
		wall.setHeight(-1.5);
		System.out.println("width= " + wall.getWidth());
		System.out.println("height= " + wall.getHeight());
		System.out.println("area= " + wall.getArea());

	}

}
