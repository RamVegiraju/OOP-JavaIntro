/**
 * 
 * @author ramvegiraju
 *
 *Sample UML
 *
 *Chicken
 *
 *-----------
 *
 *- isAlive: boolean
 *- ageInDays: int
 *- hoursToMakeEgg: int
 *	______________
 *
 *-------------
 *
 *+ cluck
 *- layEegg: Egg
 *---------------
 */
public class Person {
	
	private String name; //instance variable
	private int age;
	private String gender;
	private static String defaultName = "Roger"; //belongs to all objects of class, a class/static variable
	private static final Integer maxAge = 100; //final makes it unmodifiable
	private String race; //can have variables you don't expose
	
	//static and class are in sync, static universal for all class instances
	
	//constructor name is same as class name
	
	/**
	 * @return the race
	 */
	public String getRace() {
		return race;
	}

	/**
	 * @param race the race to set
	 */
	public void setRace(String race) {
		this.race = race;
	}

	Person(){
		name = defaultName;
		age = 0;
		gender = "";
	}
	
	//multiple constructors
	
	Person(String name, int age, String gender){
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	Person(String name, int age, String gender, String race){
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.race = race;
	}
	
	//getter
	
	public String getName(){
		return this.name;
	}
	
	
	//setter
	public void setName(String name){
		this.name = name;
	}
	
	
	//age
	
	//getter
	public int getAge() {
		return this.age;
	}
	
	//setter
	public void setAge(int age){
		this.age = age;
	}
	
	//gender
	
	//getter
	
	public String getGender() {
		return gender;
	}
	
	//setter

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public Boolean isMinor(){
		if (this.age > 18) {
			return false;
		}else{
			return true;
		}
	}
	
	/*
	
	public String toString(){
		String str = "";
		str = "Person[ ";
		str += "Name: ";
		str += name;
		str += " Age: ";
		str += String.valueOf(age); //to cast use valueOf
		str += " ]";
		return str;
	} */
	
	


	public static void main(String[] args) {
		Person pers = new Person("Ram Vegiraju", 44, "Male");
		pers.setRace("Indian"); //can use setter even if variable isn't in constructor
		System.out.println(pers.toString());
		

	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", gender=" + gender + ", race=" + race + "]";
	}

	

}
