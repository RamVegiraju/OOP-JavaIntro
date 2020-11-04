
import java.util.Comparator;

/*WAY #2: {"Prioritizing bedrooms and garage"}
- Sort first by the number of bedrooms
(sorting properties with more bedrooms before properties with less bedrooms)
- then by garage (sorting properties that have a garage before properties that don't have a garage.)*
*/
public class CmpByBedroomsAndGarage {
	
	public int compare(Willow a, Willow b) {
		
		Integer bedroomsIntegerA = new Integer(a.bedrooms);
		Integer bedroomsIntegerB = new Integer(b.bedrooms);
		
		int retValue = bedroomsIntegerA.compareTo(bedroomsIntegerB);
		if (retValue !=0) return retValue;
		if (a.garage == true &&  b.garage== false) {
			return -1;
		}
		else if (a.garage == false && b.garage == false) {
			return 0;
		}
		else if (a.garage== true && b.garage==true) {
			return 0;
			}
		else {
			return 1;
		
	}

}
}
