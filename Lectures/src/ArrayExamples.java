
public class ArrayExamples {

	public static void main(String[] args) {
		// 1D arrays
		// Declaration
		
		int[] intArray;
		String[] cityNames;
		
		//Examples of references to an array
		// Did not finish declaration
		
		//Declaring and Instantiating an Array
		int[] nums = new int[4]; //size of array is 4
		
		//Adding elements to the array
		nums[0] = 87; //first position
		nums[1] = 77;
		nums[2] = 24;
		nums[3] = 100;
		//nums[4] = 50; will cause an error, array index out of bounds error
		
		//We can do math operators with integer array
		nums[0] = 4 * nums[2] + 1;
		System.out.println(nums[0]);
		
		int x = 1;
		nums[x] = 200; //nums[1]= 200
		System.out.println(nums[1]);
		
		// Declare, Instantiate, and "Load" the array
		double[] rate = new double[] {10.4,2.3,9.9}; //size of array is 3, number of elements
		double[] rates = {10.5, 3.3, 2.1}; //shortcut 
		
		//loops and Arrays
		for(int y = 0; y < 4; y++) {
			System.out.println("y = " + y + ":" + nums[y]);
		}
		
		//Example: Average of 100 doubles
		
		double[] numbers = new double[100];
		//load the array with doubles
		for (int w = 0; w < numbers.length; w++) {
			numbers[w] = 10 * Math.random(); //using math library
		}
		
		// length:
		System.out.println("Array length is: " + numbers.length);
		
		//sum:
		double sum = 0.0; //defaul of 0.0
		for(int n = 0; n < numbers.length; n++) {
			sum = sum + numbers[n]; //add all values
		}
		
		//Calculate the average
		System.out.println("The average is: " + sum / numbers.length);
		
		//for-each loop example
		int[] myArray = new int[10];
		for(int val : myArray) {
			System.out.println(val);
		}
	}

}
