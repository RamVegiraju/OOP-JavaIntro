/*
 * Ram Vegiraju (rav3sa)
 * Cohort 38
 * Other Members:
 * Connor Moon (chm3fe)
 * Jacob Taylor (jrt7ytc)
 * Emmanuel Edu (eee4fj)
 */




import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Duplicates {
	
	
	public static void main(String[] args) {
		ArrayList<String> inputList = new ArrayList<String>();
		
		
		Scanner key = new Scanner(System.in);
		System.out.println("How many Strings would you like to enter?");
		int num = key.nextInt();
		key.nextLine();

		
		String str;
		for(int i = 0; i < num; i++) {
			System.out.println("What String would you like to add?");
			str = key.nextLine();
			inputList.add(str);
			
		}
		
		
		System.out.println(inputList);
		System.out.println(removeDups(inputList));
		//comment out above and uncomment below if you want to try the array bonus
		//System.out.println(Arrays.toString(inputList));
		//System.out.println(Arrays.toString(removeDups(inputList)));
		
	}
	
	public static ArrayList<String> removeDups(ArrayList<String> al) {
		Set<String> res = new HashSet<String>(al); //using a hash set to filter out all non-unique elements
		ArrayList<String> result = new ArrayList<String>(res); //converting hash set to an array list
		return result;
	}

}
