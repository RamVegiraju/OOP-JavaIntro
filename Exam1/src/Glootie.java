/**  
 * This is the Glootie Class This is only class that you will need to edit. 
 * @author Your Friendly CS Professors
 * 
 */
public class Glootie {
	private int age; 
	private String planet;
	private double karma;
	private String name; 
	
	
	/**
	 * @return the age
	 */
	public int getAge() { return age; }



	/**
	 * @param age the age to set
	 */
	public void setAge(int age) { this.age = age; }



	/**
	 * @return the planet
	 */
	public String getPlanet() { return planet; }



	/**
	 * @param planet the planet to set
	 */
	public void setPlanet(String planet) { this.planet = planet; }



	/**
	 * @return the karma
	 */
	public double getKarma() { return karma; }



	/**
	 * @param karma the karma to set
	 */
	public void setKarma(double karma) { this.karma = karma; }



	/**
	 * @return the name
	 */
	public String getName() { return name; }



	/**
	 * @param name the name to set
	 */
	public void setName(String name) { this.name = name; }


	/**
	 * Constructor that takes in an array of Glootie 
	 * @param data - an array of Glootie Attributes
	 */
	public Glootie(String[] data) {
		this.age = Integer.parseInt(data[0]);
		this.planet = data[1]; 
		this.karma = Double.parseDouble(data[2]); 
		this.name = data[3];
	}
	
	/**
	 * Constructure that creates a new Glootie
	 * @param age
	 * @param planet
	 * @param karma
	 * @param name
	 */
	public Glootie(int age, String planet, Double karma, String name) {
		this.age = age;
		this.planet = planet;
		this.karma = karma;
		this.name = name; 
	}

	/**
	 * Applies the sigmoid function to a double x
	 * @param x
	 * @return sigmoid(x)
	 */
	public double sigmoid(double x) { return 1/(1+Math.pow(Math.E, -x)); }
	/**
	 * b0 = 0.1 ,  b1 = 0.5 and b2 = 0.5
	 * @return
	 */
	public double getAlphaFactor() {
		double alpha = sigmoid(.1 + (.5 * this.age/70) + (.5 * this.karma/130)) * 1000;
		return alpha;
	}

	/**
	 *
	 * @return To String representations of a Glootie
	 */
	@Override
	public String toString() {
		return "Glootie [age=" + age + ", planet=" + planet + ", karma=" + karma + ", name=" 
						+ name + " alpha factor= "+ this.getAlphaFactor() + "]";
	}

	/**
	 *
	 * @param obj
	 * @return true if both Glotties are equal.
	 */

	@Override
	public boolean equals(Object obj) {
		if(obj == null) {
			return false;
		}
		if(obj instanceof Glootie) {
			Glootie glootie = (Glootie) obj;
			double alph = glootie.getAlphaFactor();
			boolean a = this.planet.equals(glootie.planet);
			if (a == false && alph == this.getAlphaFactor()) {
				return true;
			}
		}
		return false;
	}
	
	
}
