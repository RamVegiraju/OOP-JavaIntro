/* 
 * @author Ram Vegiraju
 * 10/14/2020 
 * DVD Class
 * */

public class DVD extends AmazonProduct{
	
	final double tax = .03;
	
	public DVD(double price, String name, boolean primeShipping) {
		super(price, name, CategoryOptions.ENTERTAINMENT, primeShipping);
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
