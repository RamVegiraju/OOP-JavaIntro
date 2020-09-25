
public class RoundSum {
	
	public int round10(int num) {
		
		int roundedNum = (num % 10);
		if (roundedNum >= 5) {
			return (num + (10 - (num%10)));
		}else
			return (num - (num%10));
		
	}
	
	
	public int roundSum(int a, int b, int c) {
		return round10(a) + round10(b) + round10(c);	  
	}

	public static void main(String[] args) {
		//System.out.println(round10(55));

	}

}
