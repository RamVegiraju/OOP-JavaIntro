
import java.util.Comparator;

public class CompareByPlayoffsAndSalary implements Comparator<BasketBallTeam> {
	
	public int compare(BasketBallTeam a, BasketBallTeam b){
		Boolean playoffA = a.isPlayoffTeam();
		Boolean playoffB = b.isPlayoffTeam();
		Double salaryA = a.getSalaryInMillions();
		Double salaryB = b.getSalaryInMillions();
		int retVal = playoffA.compareTo(playoffB);
		if (playoffA == playoffB) {
			int retVal2 = salaryA.compareTo(salaryB);
			return retVal2;
		}
		return retVal;
				
	}

}


