
public class StringEnd {
	
	public String theEnd(String str, boolean front) {
		if (front == true) {
			char answer = str.charAt(0);
			String result = Character.toString(answer);
			return result;
		}else {
			char lastChar = str.charAt(str.length() - 1);
			String result2 = Character.toString(lastChar);
			return result2;
		}
		
	}

	public static void main(String[] args) {
		StringEnd testEnd = new StringEnd();
		System.out.println(testEnd.theEnd("Ram", false));

	}

}
