import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ItrExpt {
	
	private static void printList(List<String> lst) {
		Iterator<String> itr = lst.iterator();
		//has next returns a boolean
		while(itr.hasNext()) {
			String item = itr.next();
			System.out.println(item);
		}
		
	}

	public static void main(String[] args) {
		List<String> expt = new ArrayList<String>();
		expt.add("Ram");
		expt.add("Test");
		expt.add("Sample");
		
		printList(expt);
		Collections.sort(expt);
		printList(expt);
	}

}
