
public class SquirrelCigar {
	
	public boolean cigarParty(int cigars, boolean isWeekend) {
		
		if ((cigars >= 40 && cigars <= 60) && (isWeekend == false)) {
			return true;
		}else if ((cigars >= 40) && (isWeekend == true)) {
			return true;
		}else
			return false;
		  
	}

	public static void main(String[] args) {
		SquirrelCigar testCigar = new SquirrelCigar();
		System.out.println(testCigar.cigarParty(80, false));

	}

}
