import java.util.Arrays;

public class ArrayOrder {
	
	public boolean array123(int[] nums) {
		boolean test = true;
		if (nums.length < 3) {
			return test = false;
		}
		for (int i = 0; i < (nums.length - 2); i++) {
			if ((nums[i] == 1) && (nums[i+1] == 2) && (nums[i+2] == 3)) {
				test = true;
			}else
				test = false;
		}
		return test;
	}

	public static void main(String[] args) {
		ArrayOrder sampleSeq = new ArrayOrder();
		int[] sampArr = new int[4];
		sampArr[0] = 4;
		sampArr[1] = 3;
		sampArr[2] = 2;
		sampArr[3] = 1;
		System.out.println(sampleSeq.array123(sampArr));

	}

}
