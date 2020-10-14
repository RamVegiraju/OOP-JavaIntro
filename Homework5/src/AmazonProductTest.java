import static org.junit.Assert.*;

import org.junit.Test;

/**
 * 
 */

/**
 * @author Your friendly CS Prof. 
 *
 */
public class AmazonProductTest {

	/**
	 * Test method for {@link AmazonProduct#isEligible()}.
	 */
	@Test
	public void testIsEligible() {
		Shirt s = new Shirt(100, "Versace", false);
		assert(s.isEligible() == false);
	}

	/**
	 * Test method for {@link AmazonProduct#getPrice()}.
	 */
	@Test
	public void testGetPrice() {
		DVD d = new DVD(10, "Black Panther", true);
		assert(d.getPrice() == 10);
	}

	/**
	 * Test method for {@link AmazonProduct#setPrice(double)}.
	 */
	@Test
	public void testSetPrice() {
		DVD d = new DVD(12, "Black Panther", true);
		d.setPrice(10);
		assert(d.getPrice() == 10);
	}

	/**
	 * Test method for {@link AmazonProduct#getName()}.
	 */
	@Test
	public void testGetName() {
		DVD d = new DVD(10, "Black Panther", true);
		assert(d.getName().equals("Black Panther"));
	}

	/**
	 * Test method for {@link AmazonProduct#getNumStars()}.
	 */
	@Test
	public void testGetandSetNumStars() {
		DVD d = new DVD(10, "Black Panther", true);
		assert(d.getNumStars() == 0);
		d.setNumStars(5);
		assert(d.getNumStars() == 5);
	}


	/**
	 * Test method for {@link AmazonProduct#getPrimeShipping()}.
	 */
	@Test
	public void testGetAndSetPrimeShipping() {
		Shirt s = new Shirt(100, "Versace", false);
		assert(s.getPrimeShipping() == false);
		s.setPrimeShipping(true);
		assert(s.getPrimeShipping() == true);

	}

	/**
	 * Test method for {@link AmazonProduct#getCategory()}.
	 */
	@Test
	public void testGetCategory() {
		Shirt s = new Shirt(100, "Versace", false);
		assert(s.getCategory() == AmazonProduct.CategoryOptions.APPAREL);
	}

}
