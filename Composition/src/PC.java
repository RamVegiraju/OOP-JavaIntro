
public class PC {
	
	private Case theCase;
	private Monitor monitor;
	private Motherboard motherboard;
	
	//PC is composed off the other three classes
	public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
		this.theCase = theCase;
		this.monitor = monitor;
		this.motherboard = motherboard;
	}

	public void powerUp() {
		theCase.pressPowerButton();
		drawLogo();
	}
	
	private void drawLogo() {
		//fancy graphics
		monitor.drawPixelAt(1200, 50, "yellow");
	}
	

	/**
	 * @return the motherboard
	 */
	private Motherboard getMotherboard() {
		return motherboard;
	}
	
	
	
	

}
