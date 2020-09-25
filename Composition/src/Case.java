
public class Case {
	
	private String model;
	private String manufacturer;
	private String powerSupply;
	private Dimensions dimnesions;
	
	public Case(String model, String manufacturer, String powerSupply, Dimensions dimnesions) {
		this.model = model;
		this.manufacturer = manufacturer;
		this.powerSupply = powerSupply;
		this.dimnesions = dimnesions;
	}
	
	public void pressPowerButton() {
		System.out.println("Power button pressed");
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
	 * @return the powerSupply
	 */
	public String getPowerSupply() {
		return powerSupply;
	}

	/**
	 * @return the dimnesions
	 */
	public Dimensions getDimnesions() {
		return dimnesions;
	}
	
	
	
	

}
