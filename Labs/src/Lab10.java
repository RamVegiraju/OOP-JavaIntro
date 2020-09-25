import java.util.HashSet;

public class Lab10 {
	
	
	public static HashSet<String> names(HashSet<String> cards, HashSet<String> topNames) {
		
		HashSet<String> result = new HashSet<String>();
		for(String name: topNames) {
			if(cards.contains(name) == false) {
				result.add(name);
			}
		}
		return result;
		
	}

	public static void main(String[] args) {
		HashSet<String> test = new HashSet<String>();
		test.add("Ram");
		test.add("sample");
		test.add("expt");
		HashSet<String> test2 = new HashSet<String>();
		test2.add("Ram");
		test2.add("new name");
		test2.add("new name 2");
		HashSet<String> res = names(test,test2);
		System.out.println(res);

	}

}
