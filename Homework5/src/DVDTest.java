import static org.junit.Assert.*;

import org.junit.Test;

public class DVDTest {

	@Test
	public void testConstructor() {
		try {
			AmazonProduct dvd = new DVD(2.5, "Latose Free",true);
		}catch(Exception e) {
			fail("Error DVD-Test-Line-10: Creating new instrance of DVD"
					+ "Check your constructor");
		}
	}
	
	@Test
	public void testCalTax() {
		AmazonProduct dvd = new DVD(2.5, "Latose Free",true);
		if(dvd.calcTax() != 0.075) {
			fail("Error DVD-Test-Line-21: Failed to calculate correct Tax"
					+ "Check your calTax method");
		}
	}
	
	
	@Test
	public void testInhertedMethod() {
		AmazonProduct dvd = new DVD(2.5, "Latose Free",true);
		try {
			dvd.getCategory();
		}catch(Exception e){
			fail("Error DVD-Test-Line-33: Inhereted method not present"
					+ "did your remember to Extend the supperClass");
		}
	}
	
	@Test
	public void testIsCategorySet() {
		AmazonProduct dvd = new DVD(2.5, "Latose Free",true);
		if(dvd.getCategory() == null) {
			fail("Error DVD-Test-Line-42: "
					+ "did remember to set the DVD Category");
		}
		assert(dvd.getCategory() == AmazonProduct.CategoryOptions.ENTERTAINMENT);

	}
	

}
