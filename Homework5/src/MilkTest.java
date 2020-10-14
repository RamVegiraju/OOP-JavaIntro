import static org.junit.Assert.*;

import org.junit.Test;

public class MilkTest {

	@Test
	public void testConstructor() {
		try {
			AmazonProduct milk = new Milk(2.5, "Latose Free",true);
		}catch(Exception e) {
			fail("Error Milk-Test-Line-10: Creating new instrance of Milk"
					+ "Check your constructor");
		}
	}
	
	@Test
	public void testCalTax() {
		AmazonProduct milk = new Milk(2.5, "Latose Free",true);
		if(milk.calcTax() != 0.025) {
			fail("Error Milk-Test-Line-21: Failed to calculate correct Tax"
					+ "Check your calTax method");
		}
	}
	
	
	@Test
	public void testInhertedMethod() {
		AmazonProduct milk = new Milk(2.5, "Latose Free",true);
		try {
			milk.getCategory();
		}catch(Exception e){
			fail("Error Milk-Test-Line-33: Inhereted method not present"
					+ "did your remember to Extend the supperClass");
		}
	}
	
	@Test
	public void testIsCategorySet() {
		AmazonProduct milk = new Milk(2.5, "Latose Free",true);
		if(milk.getCategory() == null) {
			fail("Error Milk-Test-Line-42: "
					+ "did remember to set the Milk Category");
		}
	}
	

}
