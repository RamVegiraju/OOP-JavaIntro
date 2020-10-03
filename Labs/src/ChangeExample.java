
public class ChangeExample {

	public static void main(String[] args) {
		int[] x = { 5, 5, 5 };
		int[] returned = changeValue(x);
		printArray(returned);           // see note below
		System.out.print("  "); // print two spaces
		printArray(x);                  // see note below

	}
	
	public static int[] changeValue(int[] value) {
		for (int p = 0; p < value.length; p++) {
			value[p] = 7;
		}
		return value;
	}
	
	public static void printArray(int[] value) {
		for (int i: value) {
			System.out.println(i + ", ");
		}
	}

}
