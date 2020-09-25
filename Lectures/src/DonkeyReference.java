
public class DonkeyReference {
	public int numLegs = 4;
	public String status = "Standing";
	
	public void walk() {
		status = "Walking";
	}
	
	public void stop() {
		status = "Standing";
	}
	
	public void haveAccident() {
		numLegs = numLegs -1;
	}
	
	public void haveAccident(int severity) {
		numLegs = numLegs - severity;
	}
	
	public static void main(String[] args) {
		DonkeyReference mabel = new DonkeyReference();
		DonkeyReference chuck = new DonkeyReference();
		//DonkeyReference chuck = mabel; //this time when run we are accessing the same address even if it is a different variable
		
		System.out.println(mabel.numLegs);
		System.out.println(mabel.status);
		mabel.haveAccident();
		System.out.println(mabel.numLegs); //reduces to 3
		
		System.out.println(chuck.numLegs); //is 4 for chuck the other instance
	}
	

}
