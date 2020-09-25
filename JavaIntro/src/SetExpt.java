import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExpt {
	
	private static void printSet(Set<String> expt) {
		for (String item: expt) {
			System.out.println(item);
		}
	}

	public static void main(String[] args) {
		Set<String> exptSet = new HashSet<String>();
		exptSet.add("Ram");
		exptSet.add("Tanvi");
		exptSet.add("Raju");

		printSet(exptSet);
		exptSet.add("Ram");
		printSet(exptSet);
		
		Set<String> sortSet = new TreeSet<String>(); //sorted set
		sortSet.add("Ram");
		sortSet.add("Tanvi");
		sortSet.add("Raju");
		printSet(sortSet);
		
		if (sortSet.contains("Ram")) {
			System.out.println("Ram is in the set");
		}else
			System.out.println("It is not in the set");
	}

}
