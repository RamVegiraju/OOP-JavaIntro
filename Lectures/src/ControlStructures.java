
public class ControlStructures {

	public static void main(String[] args) {
		//grading application
		
		int grade = 92;
		if (grade > 90) {
			System.out.println("Your grade is: A");
		}
		else if(grade > 80) {
			System.out.println("Your grade is: B");
		}
		else if(grade > 70) {
			System.out.println("Your grade is: C");
		}
		//else does not need to have curly braces
		else
			System.out.println("Grade lower than C");
		
		//loops
		//while loop
		int i = 0;
		while (i <= 5) {
			System.out.println("The value is: " + i);
			i++;; //i = i +1
		}
		
		//for loop - know how many iterations
		for(int q = 0; q < 15; q = q + 2) {
			//body
			System.out.println(q);
		}
		
		//for-each loop
		
		String[] foodItems = {"Steak", "Strawberries","Cheese"};
		
		//foodItems is an array of Strings - Let's iterate through
		
		for (String food: foodItems) {
			System.out.println("I like to eat: " + food);
		}
		

	}

}
