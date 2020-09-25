
public class Main {

	public static void main(String[] args) {
		/** lacks proper encapsulation
		 * create another class with proper encapsulation
		Player player = new Player();
		player.fullName = "Time"; //if you change variable name cannot find the field anymore
		player.health = 20;
		player.weapon = "Sword";
		
		int damage = 10;
		player.loseHealth(damage);
		System.out.println("Remaining health = " + player.healthRemaining());
		
		damage = 11;
		player.health = 200; //takes control out of the player class, because this field is accessible directly to the user
		player.loseHealth(damage);
		System.out.println("Remaining health = " + player.healthRemaining());
		
		*/
		
		//already encapsulated, now we need to use a getter to access the value
		EnhancedPlayer player = new EnhancedPlayer("Tim", 50, "Sword");
		System.out.println("Initial health is " + player.getHealth());
	}

}
