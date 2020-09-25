
public class Motherboard {
	
	private String model;
	private String manufacturer;
	private int ramSlots;
	private int cardSlots;
	private String bios;
	
	public Motherboard(String model, String manufacturer, int ramSlots, int cardSlots, String bios) {
		this.model = model;
		this.manufacturer = manufacturer;
		this.ramSlots = ramSlots;
		this.cardSlots = cardSlots;
		this.bios = bios;
	}

	public void loadProgram(String programName) {
		System.out.println("Program " + programName + "is now loading..");
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
	 * @return the ramSlots
	 */
	public int getRamSlots() {
		return ramSlots;
	}

	/**
	 * @return the cardSlots
	 */
	public int getCardSlots() {
		return cardSlots;
	}

	/**
	 * @return the bios
	 */
	public String getBios() {
		return bios;
	}
	
	
	
	

}
