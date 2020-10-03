import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		String hello = "You are doing awesome, " + "on this exam!";
		TreeMap<String,Integer> phoneBook = new TreeMap<>();
		phoneBook.put("Lorna", 321);
		phoneBook.put("Anna", 456);
		phoneBook.put("Grace", 789);
		phoneBook.put("Clayton", 333);
		phoneBook.put("Clayton", 115);  
		System.out.println(phoneBook);
		

	}

}
