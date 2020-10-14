/* 
 * @author Ram Vegiraju
 * 10/14/2020 
 * Milk Class
 * */

public class Milk extends AmazonProduct{

	final double tax = .01;
	
	public Milk(double price, String name, boolean primeShipping) {
		super(price, name, CategoryOptions.PRODUCE, primeShipping);
	}

	@Override
	public double calcTax() {
		return (price * tax);
	}

	@Override
	public boolean isCouponEligible() {
		if (primeShipping) {
			return true;
		}else
			return false;
	}
	
	
	
	

}
