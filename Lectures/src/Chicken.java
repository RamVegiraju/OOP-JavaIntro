
public class Chicken {
	
	//STATE
	private boolean isAlive = true;
	private int ageInDays = 0;
	private static int hoursToMakeEgg = 26; //static variable is something like pi universal for all classes
	//all chickens with take same hours to make an egg
	
	public static void main(String[] args) {
		//create two chickens
		Chicken zeno = new Chicken();
		Chicken hera = new Chicken();
		
		//assigns default values in constructor
		System.out.println(zeno.getAgeInDays()); //default is 0
		System.out.println(hera.getAgeInDays());
		
		//hours to make an egg default is 25
		System.out.println(zeno.getHoursToMakeEgg()); //the default is 26
		System.out.println(hera.getHoursToMakeEgg());
		
		
		zeno.setAgeInDays(100);
		hera.setAgeInDays(50);
		zeno.setHoursToMakeEgg(15); //once you change a static variable it changes for all instances in the class
		
		System.out.println(zeno.getAgeInDays());
		System.out.println(hera.getAgeInDays());
		System.out.println(zeno.getHoursToMakeEgg()); //the default is 26
		System.out.println(hera.getHoursToMakeEgg());
		
	}
	
	//BEHAVIOR
	public void cluck() {
		System.out.println("Cluck!");
	}
	private Egg layEgg() {
		Egg e = new Egg();
		
		return e;
	}
	
	/**
	 * @return the isAlive
	 */
	public boolean isAlive() {
		return isAlive;
	}
	/**
	 * @param isAlive the isAlive to set
	 */
	public void setAlive(boolean isAlive) {
		this.isAlive = isAlive;
	}
	/**
	 * @return the ageInDays
	 */
	public int getAgeInDays() {
		return ageInDays;
	}
	/**
	 * @param ageInDays the ageInDays to set
	 */
	public void setAgeInDays(int ageInDays) {
		this.ageInDays = ageInDays;
	}
	/**
	 * @return the hoursToMakeEgg
	 */
	public static int getHoursToMakeEgg() {
		return hoursToMakeEgg;
	}
	/**
	 * @param hoursToMakeEgg the hoursToMakeEgg to set
	 */
	public static void setHoursToMakeEgg(int hoursToMakeEgg) {
		Chicken.hoursToMakeEgg = hoursToMakeEgg;
	}
	
	
	

}

class Egg {
	
}
