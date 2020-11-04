
import java.util.Comparator;
import java.lang.Integer;

public class CompareByWinsLossesChamps implements Comparator<BasketBallTeam> {
	
	public int compare(BasketBallTeam a, BasketBallTeam b){
			Integer winsA = a.getNumberOfWins();
			Integer winsB = b.getNumberOfWins();
			int res = winsA.compareTo(winsB);
			return res;		
	}

}
