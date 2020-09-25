
public class IntegerDistance {
	
	public boolean closeFar(int a, int b, int c) {
		int distanceBA = Math.abs(b-a);
		int distanceCA = Math.abs(c-a);
		int distanceCB = Math.abs(c-b);
		int distanceBC = Math.abs(b-c);
		boolean result = true;
		
		if ((distanceBA == 1) && (distanceCA == 1)) {
			result = false;
		}else if ((distanceBA <= 1) && (distanceCA >= 2) && (distanceCB >= 2)) {
			result = true;
		}else if ((distanceCA <= 1) && (distanceBA >= 2) && (distanceBC >= 2)) {
			result = true;
		}else
			result = false;
		return result;
	}

	public static void main(String[] args) {
		IntegerDistance testDist = new IntegerDistance();
		System.out.println(testDist.closeFar(1, 2, 3));
		

	}

}
