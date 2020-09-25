import java.util.HashSet;

/**
 * Creating a demonstration class to put into set container
 * 
 * **/
public class CornerRestaurant {

	private String name;
	private int rating;
	private String cost;
	
	public CornerRestaurant() {
		
	}
	
	public CornerRestaurant(String name, int rating, String cost) {
		this.name = name;
		this.rating = rating;
		this.cost = cost;
	}
	
	public static void main(String[] args) {
		CornerRestaurant cr1 = new CornerRestaurant("Little Johns", 5, "$");
		CornerRestaurant cr2 = new CornerRestaurant("Chrisitan's Pizza",4, "$");
		CornerRestaurant cr3 = new CornerRestaurant("Revolutionary Soup", 5, "$$");
		
		
		HashSet<CornerRestaurant> corner = new HashSet<CornerRestaurant>();
		
		//adding items to a hash set
		corner.add(cr1);
		corner.add(cr2);
		corner.add(cr3);
		
		System.out.println(corner.size() + " items in this container");
		for (CornerRestaurant cr: corner) {
			System.out.println(cr.getName());
		}
		
		//removing
		corner.remove(cr1);
		System.out.println(corner.size() + " items in this container");
		System.out.println(cr1);
		
	}
	
	public String toString() {
		return this.name + " rated as " + this.rating + " costing " + this.cost;
	}
	
	public boolean equals(Object o) {
		if (o == null) {
			return false;
		}
		//if ( o.getClass() == this.getClass())
		if (! (o instanceof CornerRestaurant)) {
			return false;
		}
		CornerRestaurant otherObject = (CornerRestaurant) o;
		if (otherObject.cost.equals(this.cost) && otherObject.name.equals(this.name) && otherObject.rating == this.rating){
			return true;
		}else
			return false;
	}

	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the rating
	 */
	public int getRating() {
		return rating;
	}

	/**
	 * @param rating the rating to set
	 */
	public void setRating(int rating) {
		this.rating = rating;
	}

	/**
	 * @return the cost
	 */
	public String getCost() {
		return cost;
	}

	/**
	 * @param cost the cost to set
	 */
	public void setCost(String cost) {
		this.cost = cost;
	}
	
	
}
