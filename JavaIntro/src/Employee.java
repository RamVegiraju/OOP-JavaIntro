
public class Employee extends Person{
	
	private int salary;
	private String profession;
	
	//default constructor
	Employee() {
		System.out.println("In the employee constructor");
	}
	
	//constructor
	Employee(String name, int age, String gender, int salary, String profession) {
		super(name, age, gender); //constructor call has to be at top, constructing the person
		this.salary = salary;
		this.profession = profession;
		//private vs protected
		//this.name = name;
	}
	
	//constructor with race
	Employee(String name, int age, String gender, String race, int salary, String profession) {
		super(name, age, gender,race); //constructor call has to be at top, constructing the person
		this.salary = salary;
		this.profession = profession;
		//private vs protected
		//this.name = name;
		}

	@Override
	public String toString() {
		//make parent class to string as well
		return super.toString() + "----" + "Employee [salary=" + salary + ", profession=" + profession + "]";
	}

	/**
	 * @return the salary
	 */
	public int getSalary() {
		return salary;
	}

	/**
	 * @param salary the salary to set
	 */
	public void setSalary(int salary) {
		this.salary = salary;
	}

	/**
	 * @return the profession
	 */
	public String getProfession() {
		return profession;
	}

	/**
	 * @param profession the profession to set
	 */
	public void setProfession(String profession) {
		this.profession = profession;
	}
	
	//can modify method in the base class
	@Override
	public String getRace() {
		return "Unknown";
	}
	

	public static void main(String[] args) {
		//Person emp = new Employee();//calls the default base class constructor
		//System.out.println(emp.toString());
		
		//Person emp2 = new Employee("Ram", 43, "Male", 150, "Engineer");
		//emp2.setRace("Hispanic");
		//System.out.println((emp2.toString()));
		
		Person emp3 = new Employee("Ram", 43, "Male", "Hispanic", 150, "Engineer");
		System.out.println((emp3.toString()));
		System.out.println(emp3.getRace());

	}

}
