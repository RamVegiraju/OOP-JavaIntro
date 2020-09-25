import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


public class MapExpt {
	
	private static void printSet(Set<String> expt) {
		for (String item: expt) {
			System.out.println(item);
		}
	}
	
	public static void printMap(Map<String,Integer> sampleMap) {
		//keys form a set
		Set<String> keySet = sampleMap.keySet();
		printSet(keySet);
		
		//printing values for corresponding keys
		Iterator<String> itr = keySet.iterator();
		while (itr.hasNext()) {
			String key = itr.next();
			Integer val = sampleMap.get(key);
			System.out.println(key + " : " + val);
		}
	}
	
	//shorter more efficient method to print key value pairs
	public static void printMap2(Map<String,Integer> sampleMap) {
		for(String key: sampleMap.keySet()) {
			System.out.println(key + " : " + sampleMap.get(key));
		}
	}
	
	//another method
	public static void printMap3(Map<String,Integer> sampleMap) {
		for(Map.Entry<String, Integer> entry: sampleMap.entrySet()) {
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println(key + " : " + value);
		}
	}
	
	

	public static void main(String[] args) {
		Map<String,Integer> mapExpt = new HashMap<String,Integer>();
		mapExpt.put("Ram", 40);
		mapExpt.put("Tanvi", 10);
		mapExpt.put("Aruna", 50);
		mapExpt.put("Ram", 15); //keys have to be unique overrides first value
		printMap(mapExpt);
		printMap2(mapExpt);

	}

}
