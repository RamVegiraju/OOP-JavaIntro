import static org.junit.Assert.*;

import org.junit.Test;

public class ShirtTest {

	@Test
	public void testConstructor() {
		try {
			AmazonProduct shirt = new Shirt(10.15, "Latose Free",true);
		}catch(Exception e) {
			fail("Error Shirt-Test-Line-10: Creating new instrance of Shirt"
					+ "Check your constructor");
		}
	}
	
	@Test
	public void testCalTax() {
		AmazonProduct shirt = new Shirt(0.7, "Latose Free",true);
		if(shirt.calcTax() != 0.049) {
			fail("Error Shirt-Test-Line-21: Failed to calculate correct Tax"
					+ "Check your calTax method");
		}
	}
	
	
	@Test
	public void testInhertedMethod() {
		AmazonProduct shirt = new Shirt(12.5, "Latose Free",true);
		try {
			shirt.getCategory();
		}catch(Exception e){
			fail("Error Shirt-Test-Line-33: Inhereted method not present"
					+ "did your remember to Extend the supperClass");
		}
	}
	
	@Test
	public void testIsCategorySet() {
		AmazonProduct shirt = new Shirt(2.5, "Latose Free",true);
		if(shirt.getCategory() == null) {
			fail("Error Shirt-Test-Line-42: "
					+ "did remember to set the Shirt Category");
		}
		assert(shirt.getCategory() == AmazonProduct.CategoryOptions.APPAREL);
	}
	

}
