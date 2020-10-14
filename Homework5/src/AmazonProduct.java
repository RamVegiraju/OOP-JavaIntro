/**
 * Abstract class:  Amazon Product
 * 
 * The Amazon Product class defines the methods and fields that all Amazon products have in common:
 * fields: 
 *    price, name, category, number of stars (1-5), 
 *    eligibility for Prime shipping, and barcode
 *    
 * methods:
 *    calcTax() - to calculate the tax
 *    isEligible() - returns true if the product is eligible for Prime shipping, false otherwise
 * 
 * We calculate tax differently depending on the kind of product, 
 * and not every product is eligible for Prime shipping. 
 * 
 */
public abstract class AmazonProduct {
    /**
     * fields:
     *  - price: price of the product in Dollars (double)
     *  - name: name of the product (String)
     *  - category: the category of the product (Category Options)
     *  - numStars: the number of stars (whole numbers) the product has, as rated by Amazon users (int)
     *  - primeShipping: whether or not the product is eligible for Prime shipping (true) or not (false) (boolean)
     */
	protected double price;
	protected String name; // description of product, e.g. dvd, jeans, etc
	protected int numStars; // 1-5, only whole stars in this example
	protected boolean primeShipping; 
	protected CategoryOptions category; 
	// Enum are a good alternative to fix strings that don't change. 
	// This helps to programs with typing mistakes. 
	// https://www.w3schools.com/java/java_enums.asp
	// This is now a data type. See above: CategoryOptions category;
	protected enum CategoryOptions {
		  ENTERTAINMENT,
		  PRODUCE,
		  APPAREL
		}
	
	/**
	 * Constructor for the AmazonProduct class 
	 * @param price
	 * @param name
	 * @param category
	 * @param primeShipping
	 */
	public AmazonProduct(double p, String n, CategoryOptions c, boolean ps) {
		this.price = p;
		this.name = n;
		this.category = c;
		this.numStars = 0; // default value
		this.primeShipping = ps;
	}
	


	/**
	 * Calculates the tax for a given product, however, not all products have the same tax
	 * so we'll make the sub classes responsible for implementing this behavior.
	 */
	public abstract double calcTax(); // a method "stub" (an abstract method) to calculate the tax

	/**
	 * Check to to see if there is a coupon.
	 * @return
	 */
	public abstract boolean isCouponEligible();
	
	/**
	 * This method returns true if the product is eligible for Prime shipping, false otherwise
	 * @return primeShipping
	 */
	public boolean isEligible() {
	    return this.primeShipping; 
	}
	
	// GETTERS AND SETTERS: 
    /**
     * @return the price
     */
    public double getPrice() {
        return this.price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * @return the name 
     */
    public String getName() {
        return this.name;
    }    
    
    /**
     * @return the numStars
     */
    public int getNumStars() {
        return this.numStars;
    }

    /**
     * @param numStars the numStars to set
     */
    public void setNumStars(int numStars) {
        this.numStars = numStars;
    }

    /**
     * @return the primeShipping
     */
    public boolean getPrimeShipping() {
        return this.primeShipping;
    }

    /**
     * @param primeShipping the primeShipping to set
     */
    public void setPrimeShipping(boolean primeShipping) {
        this.primeShipping = primeShipping;
    }


    /**
     * @return the category
     */
    public CategoryOptions getCategory() {
        return this.category;
    }

    
	
}