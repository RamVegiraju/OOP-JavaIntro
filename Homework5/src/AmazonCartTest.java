import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class AmazonCartTest {

	@Test
	public void testAddingItemToCard() {
		Milk m = new Milk(2.5, "Lactose Free", false);
		AmazonCart  amazonCart = new AmazonCart();
		amazonCart.addItem(m);
		if(amazonCart.contains(m) != true) {
			fail("Error AmazonCart-Line-13: Items not currently added to cart");
		}
	}
	
	@Test
	public void testCalculateTotal() {
		Milk m = new Milk(3, "Lactose Free", true);
		DVD d = new DVD(10, "Black Panther", true);
		Shirt s = new Shirt(100, "Versace", false);
		AmazonCart  amazonCart = new AmazonCart();
		amazonCart.addItem(m);
		amazonCart.addItem(d);
		amazonCart.addItem(s);
		assert(amazonCart.calculateTotal() == 120.33);	
	}
	
	@Test 
	public void testAddingDupplicates() {
		Milk m = new Milk(3, "Lactose Free", true);
		DVD d = new DVD(10, "Black Panther", true);
		Shirt s = new Shirt(100, "Versace", false);
		AmazonCart  amazonCart = new AmazonCart();
		amazonCart.addItem(m);
		amazonCart.addItem(m);
		amazonCart.addItem(d);
		amazonCart.addItem(d);
		amazonCart.addItem(s);
		amazonCart.addItem(s);
		assert(amazonCart.calculateTotal() == 240.66);	
	}
	
	@Test 
	public void testRemovingItem() {
		Milk m = new Milk(3, "Lactose Free", true);
		DVD d = new DVD(10, "Black Panther", true);
		Shirt s = new Shirt(100, "Versace", false);
		AmazonCart  amazonCart = new AmazonCart();
		amazonCart.addItem(m);
		amazonCart.removeItem(m);
		amazonCart.addItem(d);
		amazonCart.addItem(s);
		amazonCart.addItem(s);
		assert(amazonCart.calculateTotal() == 224.3);	
	}
	
	@Test 
	public void testRemovingItem2() {
		Milk m = new Milk(3, "Lactose Free", true);
		DVD d = new DVD(10, "Black Panther", true);
		Shirt s = new Shirt(100, "Versace", false);
		AmazonCart  amazonCart = new AmazonCart();
		amazonCart.addItem(m);
		amazonCart.removeItem(m);
		assert(amazonCart.removeItem(d) == false);
		amazonCart.addItem(d);
		amazonCart.addItem(s);
		amazonCart.addItem(s);
		assert(amazonCart.calculateTotal() == 224.3);	
	}
	
	@Test 
	public void testRemovingItem3() {
		Milk m = new Milk(3, "Lactose Free", true);
		DVD d = new DVD(10, "Black Panther", true);
		Shirt s = new Shirt(100, "Versace", false);
		AmazonCart  amazonCart = new AmazonCart();
		amazonCart.addItem(m);
		amazonCart.addItem(m);
		amazonCart.removeItem(m);
		amazonCart.removeItem(m);
		assert(amazonCart.removeItem(d) == false);
		amazonCart.addItem(d);
		amazonCart.addItem(s);
		amazonCart.addItem(s);
		assert(amazonCart.calculateTotal() == 224.3);	
	}
	
	
	@Test
	public void testAddingArrayListOfItems() {
		ArrayList<Milk> mArray = new ArrayList<>();
		Milk m1 = new Milk(3, "Lactose Free", true);
		Milk m2 = new Milk(2, "Whole Milk", true);
		Milk m3 = new Milk(9.5, "Goats Milk", true);
		mArray.add(m1);
		mArray.add(m2);
		mArray.add(m3);
		AmazonCart  amazonCart = new AmazonCart();
		amazonCart.addItems(mArray);
	}

	
	@Test
	public void testRemovingArrayListOfItems() {
		ArrayList<Milk> mArray = new ArrayList<>();
		Milk m1 = new Milk(3, "Lactose Free", true);
		Milk m2 = new Milk(2, "Whole Milk", true);
		Milk m3 = new Milk(9.5, "Goats Milk", true);
		mArray.add(m1);
		mArray.add(m2);
		mArray.add(m3);
		AmazonCart  amazonCart = new AmazonCart();
		amazonCart.addItems(mArray);
		amazonCart.removeItems(mArray);
		assert(amazonCart.calculateTotal() == 0);
	}
}
