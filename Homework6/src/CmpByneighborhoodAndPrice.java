import java.util.Comparator;

/*WAY #3: {"High-end Search"}
- Sort first by neighborhood (sorting in ascending order),
- then by price (sorting more expensive properties before less expensive properties)
*/

public class CmpByneighborhoodAndPrice implements Comparator<Willow>{
	
	public int compare(Willow a, Willow b) {
		
		int retValue = a.getNeighborhood().compareTo(b.getNeighborhood());
		if (retValue !=0) {
			return retValue;
		}
		if (a.getPrice() > b.getPrice()) return -1;
        if (a.getPrice() < b.getPrice()) return 1;
        return 0;
	
	}

}
