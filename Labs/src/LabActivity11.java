import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;


/**
* Lab Activity 11 - Sets
* Practice writing methods that involve Sets and Maps
* Using specific implementation classes: HashSet and TreeMap
* Don't forget to comment the code that you write. Also, test your code in the main method
*/
public class LabActivity11 {
	
	/**
	    * This method (names) takes in two sets: one of names already on cards
	    * and the other containing the top 100 names. The method returns
	    * a set of names for the new cards needed (in topNames but not in cards) 
	    */
	public static HashSet<String> names(HashSet<String> cards, HashSet<String> topNames) {
		
		HashSet<String> result = new HashSet<String>();
		for(String name: topNames) {
			if(cards.contains(name) == false) {
				result.add(name);
			}
		}
		return result;
		
	}
	
	/**
	    * This method (reverseBook) takes a TreeMap representation of a phonebook
	    * (Key=Name, a String, and Value=Number, an Integer).
	    * The method returns the reverse phonebook (that is, you know the number
	    * and you're looking for the name)
	    */  
	public static TreeMap<Integer, String> reverseBook(TreeMap<String, Integer> phoneBook){
		TreeMap<Integer,String> myPhonebook = new TreeMap<>();
	    for (Map.Entry<String,Integer> ele : phoneBook.entrySet()) {
	    	myPhonebook.put(ele.getValue(), ele.getKey());
	    }
	    return myPhonebook;
	}

	public static void main(String[] args) {
		
		//testing first method 
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
		
		
		//testing second method
		TreeMap<String,Integer> phoneBook = new TreeMap<>();
	    phoneBook.put("Ram", 77777);
	    phoneBook.put("Test", 23481);
	    phoneBook.put("Expt", 32455);
	    phoneBook.put("Demo", 67546);
	    System.out.println(phoneBook.get("Ram"));
	    TreeMap<Integer,String> reverse = reverseBook(phoneBook);
	    System.out.println(reverse.get(77777));
		

	}

}
