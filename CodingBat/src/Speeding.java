
public class Speeding {
	
	public int caughtSpeeding(int speed, boolean isBirthday) {
		int result = 0;
		int extraMiles = 0;
		
		if (isBirthday) {
	        extraMiles = 5;
	    }
		if (speed <= (60 + extraMiles)) {
	        result = 0;
	    } else if (speed >= (61 + extraMiles) && speed <= (80 + extraMiles)) {
	        result = 1;
	    } else {
	        result = 2;
	    }
		
		
		return result;
		  
	}

	public static void main(String[] args) {
		Speeding speedTest = new Speeding();
		System.out.println(speedTest.caughtSpeeding(64, true));
	}

}
