import java.util.ArrayList;
import java.util.List;

public class MedianMinMaxRemove {
	
	public static ArrayList<Integer> sortRemove(ArrayList<Integer> inputArrayList) {
		ArrayList<Integer> sorted = new ArrayList<Integer>(inputArrayList); //copy constructor to make a copy
		sorted.sort(null); //comparator smallest to largest sorts
		//removing median
		int indexMedian = sorted.size()/2;
		sorted.remove(indexMedian); //removes median
		sorted.remove(sorted.size()-1); //last index is one less than size, removes max
		sorted.remove(0); //min is at index 0
		
		return sorted;
	}

	public static void main(String[] args) {
		ArrayList<Integer> numberArray = new ArrayList<Integer>();
		int numberCount = 10;
		for (int i = 0; i < numberCount; i++) {
			int randomNumber = (int)(Math.random()*100); //generating random numbers
			numberArray.add(randomNumber);
		}
		
		System.out.println(numberArray);
		ArrayList<Integer> sorted = sortRemove(numberArray); //can use sorted again because outside of method scope
		System.out.println(sorted); //three shorter with min max median removed

	}

}
