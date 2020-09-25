
public class Microwave {
	
	private int time;
	private boolean stop;
	private boolean start;
	private double defrost;
	private boolean popcorn;
	private double weight;
	
	
	//constructor
	public Microwave(int time, boolean stop, boolean start, double defrost, boolean popcorn, double weight) {
		this.time = time;
		this.stop = stop;
		this.start = start;
		this.defrost = defrost;
		this.popcorn = popcorn;
		this.weight = weight;
	}

	public boolean pop(boolean popcorn) {
		//stubbed code
		return false;
	}
	
	public void cook(int time, double weight) {
		//stubbed
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
