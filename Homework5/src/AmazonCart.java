/**
 * Amazon Cart class that extends the abstract Cart and represents a specific type of 
 * chart that only holds Amazon objects.  
 * @author Your friendly CS Profs. 
 *
 */
public class AmazonCart extends AbstractCart<AmazonProduct> {

	@Override
	/**
	 * Calculate the total of all the items in the cart include tax.
	 * @return total
	 */
	public double calculateTotal() {
		double total = 0.0;
		for(AmazonProduct item : this.cart.keySet()) {
			int itemCount = this.cart.get(item);
			total += (item.getPrice() + item.calcTax())*itemCount;
		}
		return total;
	}

}
