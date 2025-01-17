
public class Monitor {
	
	private String model;
	private String manufacturer;
	private int size;
	private Resolution nativeResolution; //example of composition
	
	public Monitor(String model, String manufacturer, int size, Resolution nativeResolution) {
		this.model = model;
		this.manufacturer = manufacturer;
		this.size = size;
		this.nativeResolution = nativeResolution;
	}
	
	public void drawPixelAt(int x, int y, String color) {
		System.out.println("Drawing pixel at " + x + "," + y + "in colour " + color);
	}

	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}

	/**
	 * @return the manufacturer
	 */
	public String getManufacturer() {
		return manufacturer;
	}

	/**
	 * @return the size
	 */
	public int getSize() {
		return size;
	}

	/**
	 * @return the nativeResolution
	 */
	public Resolution getNativeResolution() {
		return nativeResolution;
	}
	
	
	

}
