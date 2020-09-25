
public class CarIntroduction {
	
	//state component (variables)
	//private means these variables aren't accessible by other classes
	private int doors;
	private int wheels;
	private String model;
	private String engine;
	private String colour;
	
	//methods
	
	//setter (mutator)
	public void setModel(String model) {
		String validModel = model.toLowerCase();
		if(validModel.equals("carerra") || validModel.equals("commodore")) {
			this.model = model;
		}else
			this.model = "Unknown";
	}
	
	//getter (accessor)
	public String getModel() {
		return this.model;
	}

}
