import java.util.Arrays;
import java.util.List; 
import java.util.stream.Collectors; 
import java.util.stream.IntStream; 

public class ArrayAverage {
	
	public int centeredAverage(int[] nums) {
		Arrays.sort(nums);
		int minVal = nums[0];
		int maxVal = nums[nums.length - 1];
		int secondSmallest = nums[1];
		int secondLargest = nums[nums.length - 2];
		int sum = 0;
		int lengthArr = (nums.length - 2);
		int average = 0;
		for (int i = 1; i < nums.length - 1; i++) {
			sum += nums[i];
		}
		average = (sum/lengthArr);
		return average;
		  
	}

	public static void main(String[] args) {
		ArrayAverage sampleArrayAverage = new ArrayAverage();
		int[] sampArr = new int[4];
		sampArr[0] = 4;
		sampArr[1] = 4;
		sampArr[2] = 2;
		sampArr[3] = 1;
		System.out.println(sampleArrayAverage.centeredAverage(sampArr));

	}

}
