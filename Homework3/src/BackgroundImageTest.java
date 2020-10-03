/* 
 * @author Ram Vegiraju
 * 10/02/2020
 * BackgroundImage class test
 * */

import static org.junit.Assert.*;

import org.junit.Test;

public class BackgroundImageTest {
	
	@Test
	public void testBackgroundImage() {
		BackgroundImage b = new BackgroundImage();
	}

	@Test
	public void toStringTest() {
		BackgroundImage b = new BackgroundImage("Img File Name", "Title", "Description");
		String result = "Title <Description>";
		assertEquals(b.toString(),result);
	}
	
	@Test
	public void equalsTest() {
		BackgroundImage b = new BackgroundImage("Img File Name", "Title", "Description");
		BackgroundImage a = b;
		assertTrue("Objects should be equals", b.equals(a));
		BackgroundImage c = null;
		assertFalse("Null object should return false", b.equals(c));
		
	}
	
	@Test
	public void setAndGetTitle() {
		BackgroundImage b = new BackgroundImage("Img File Name", "Title", "Description");
		assertEquals("Title", b.getTitle());
		b.setTitle("Changing title");
		assertEquals("Changing title", b.getTitle());
	}
	
	@Test
	public void setAndGetDescription() {
		BackgroundImage b = new BackgroundImage("Img File Name", "Title", "Description");
		assertEquals("Description", b.getDescription());
		b.setDescription("Changing description");
		assertEquals("Changing description", b.getDescription());
	}
	
	@Test
	public void setAndGetImageFileName() {
		BackgroundImage b = new BackgroundImage("Img File Name", "Title", "Description");
		assertEquals("Img File Name", b.getImageFileName());
		b.setImageFileName("Changing file name");
		assertEquals("Changing file name", b.getImageFileName());
		
	}
	

}
