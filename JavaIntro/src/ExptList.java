import java.util.ArrayList;
import java.util.List;

public class ExptList {

	public static void main(String[] args) {
		// list is an abstract class cannot instantiate
		
		List names = new ArrayList();
		names.add("Ram");
		names.add("Nadal");
		names.add("Federer");
		
		int size = names.size();
		
		for(int i = 0; i < size; i++) {
			System.out.println(names.get(i)); //for list don't use square brackets 
		}
		System.out.println("-------------------");
		//second method
		for(Object name: names) {
			System.out.println(name);
		}
		
		//generics can limit types of object you insert into list
		
		List<String> names2 = new ArrayList<String>();
		names2.add("Test");
		names2.add("Ram");
		names2.add("Testin");
		
		System.out.println("------------------");
		for(String name2: names2) {
			System.out.println(name2);
		}
		
		List<Integer> names3 = new ArrayList<Integer>();
		names3.add(4);
		names3.add(5);
		names3.add(6);
		
		System.out.println("---------------");
		for(Integer name3: names3) {
			System.out.println(name3);
		}
		
		System.out.println("----------------");
		Person p1 = new Person("Ram", 44, "Male");
		Person p2 = new Person("Raju", 50, "Male");
		Person p3 = new Person("Tanvi", 10, "Female");
		
		System.out.println("---------------");
		
		List<Person> persons = new ArrayList<Person>();
		persons.add(p1);
		persons.add(p2);
		persons.add(p3);
		for(Person person: persons) {
			System.out.println(person.toString());
		}

	}

}
