
public class Expt {

	public static void main(String[] args) {
		/*
		int x = 4;
		System.out.println("Output: " + x);
		
		Integer tmp = new Integer(44);
		int tmp2 = tmp.intValue();
		
		Integer tmp3 = 44;
		
		//String
		String name = new String("Ram");
		//System.out.println(name);
		
		//Shortcut
		String name2 = "Ram2";
		//System.out.println(name2); */
		
		Person pers = new Person("Ram Vegiraju", 44, "Male");
		//System.out.println("Name: " + pers.getName());
		//System.out.println("Age: " + pers.getAge());
		//System.out.println("Minor: " + pers.isMinor());
		Boolean isPersonMinor = pers.isMinor();
		if (isPersonMinor == false){
			System.out.println(pers.getName() + " is not a minor");
		}else{
			System.out.println(pers.getName() + " is a minor");
		}
		
		System.out.println(pers.toString());
	}

}
