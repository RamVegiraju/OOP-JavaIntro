/* 
 * @author Ram Vegiraju
 * 10/02/2020
 * Feed class test
 * */

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class FeedTest {

	@Test
	public void testFeed() {
		Feed f = new Feed();
		ArrayList memes = new ArrayList<Meme>();
		assertEquals("Testing feed", memes, f.getMemes());
	}
	
	@Test
	public void toStringTest() {
		Feed f = new Feed();
		ArrayList memes = new ArrayList<Meme>();
		f.setMemes(memes);
		String res = "";
		for (Meme meme: f.getMemes()) {
			res += meme.toString() + "\n";
		}
		assertEquals(f.toString(), res);
	}
	
	@Test
	public void getNewMemeTest() {
		Feed f = new Feed();
		User u = new User();
		BackgroundImage b = new BackgroundImage();
		String caption = "";
		Meme m = u.createMeme(b, caption);
		u.shareMeme(m, f);
		assertEquals("New Meme Test", null, f.getNewMeme(u));
		User u1 = new User();
		assertEquals("New Meme Test", m, f.getNewMeme(u1));
		
	}
	
	@Test
	public void setAndGetMemes() {
		Feed f = new Feed();
		ArrayList memes  = new ArrayList<Meme>();
		f.setMemes(memes);
		assertEquals("Setter and Getter Feed Test", memes, f.getMemes());
		
	}

}
