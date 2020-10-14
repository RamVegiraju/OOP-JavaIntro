/**
 * This class represents a Shirt object.
 * The tax rate on Shirts is 7%
 * @author Your friendly CS Profs
 *
 */
public class Shirt extends AmazonProduct {
	final double taxRate = 0.07;
	/**
	 * A Shirt is automatically assigned to 
	 * the Apparel category
	 * @param price
	 * @param name
	 * @param primeShipping
	 */
	public Shirt(double price, String name, boolean prime) {
		super(price, name, CategoryOptions.APPAREL, prime );
	}
	/**
	 * Calculate the tax on DVDs. The tax rate for Shirts is 7%
	 */
	@Override
	public double calcTax() {
		return this.getPrice()*taxRate;
	}
	@Override
	public boolean isCouponEligible() {
		return false;
	}
	
}
