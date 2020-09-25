import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	
	public static int[] twoSum(int[] nums, int target) {
		Map<Integer,Integer> mapExpt = new HashMap<Integer,Integer>();
		for (int i = 0; i <nums.length; i++) {
			int difference = (target - nums[i]);
			if (mapExpt.containsKey(difference)){
				return new int[] {mapExpt.get(difference), i};
			}else
				mapExpt.put(nums[i],i);
		}
		throw new IllegalArgumentException("No two sum solution");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
