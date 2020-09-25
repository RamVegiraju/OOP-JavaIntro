import java.util.Arrays;
import java.util.List;

public class Evens {
	
	public static int[] copyEvens(int[] nums, int count) {
		int [] output = new int[count];
		int outputIndex = 0;
		for (int i = 0; i < nums.length; i++) {
			if ((nums[i] % 2 == 0) && (outputIndex <= (count -1))) {
				output[outputIndex] = nums[i];
				outputIndex++;
			}
		}
		return output;
		  
	}

	public static void main(String[] args) {
		int[] ages = new int[6];
		ages[0] = 44;
		ages[1] = 10;
		ages[2] = 50;
		ages[3] = 43;
		ages[4] = 32;
		ages[5] = 30;
		System.out.println(copyEvens(ages,2));

	}

}
