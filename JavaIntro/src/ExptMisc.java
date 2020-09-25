
public class ExptMisc {
	
	public static void changeMe(Person pers) {
		pers.setName("Raju");
	}
	
	public static void changeMe2(Person pers) {
		pers = new Person("Federer", 40, "Male");
	}

	public static void main(String[] args) {
		Person pers = new Person("Ram", 44, "Male");
		System.out.println(pers.toString());
		System.out.println("------------");
		changeMe(pers);
		System.out.println(pers.toString());
		System.out.println("-------------");
		changeMe2(pers); //made no difference pass by value only allowed in java
		//think memory addresses look up later
		System.out.println(pers.toString());
		
		
		//FmtUtil formatUtil = new FmtUtil();
		//formatUtil.banner("Ram");
		
		FmtUtil.banner("Ram"); //static function no need for new keyword

	}

}
