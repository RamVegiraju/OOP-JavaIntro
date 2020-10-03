/* 
 * @author Ram Vegiraju
 * 10/02/2020
 * Meme class test
 * */

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class MemeTest {

	@Test
	public void testMeme() {
		Meme m = new Meme();
		ArrayList<Rating> ratings = new ArrayList<Rating>();
		BackgroundImage b = new BackgroundImage();
	}
	
	@Test
	public void equalsTest() {
		String caption = "caption";
		BackgroundImage img = new BackgroundImage("Img File Name", "Title", "Description");
		String username = "username";
		User u = new User(username);
		ArrayList<Meme> uCreated = new ArrayList<Meme>();
		ArrayList<Meme> uViewed = new ArrayList<Meme>();
		u.setMemesCreated(uCreated);
		u.setMemesViewed(uViewed);
		Meme m = new Meme(img, caption, u);
		m.setShared(false);
		ArrayList<Rating> rates = new ArrayList<Rating>();
		m.setRatings(rates);
		uCreated.add(m);
		uViewed.add(m);
		
		Meme b = m;
		assertTrue("Objects should be equals", m.equals(b));
		Meme c = null;
		assertFalse("Objects should not be equal", m.equals(c));
		
	}
	
	@Test
	public void toStringTest() {
		
	}
	
	@Test
	public void calculateRatingTest() {
		String caption = "caption";
		BackgroundImage img = new BackgroundImage("Img File Name", "Title", "Description");
		String username = "username";
		User u = new User(username);
		ArrayList<Meme> uCreated = new ArrayList<Meme>();
		ArrayList<Meme> uViewed = new ArrayList<Meme>();
		u.setMemesCreated(uCreated);
		u.setMemesViewed(uViewed);
		Meme m = new Meme(img, caption, u);
		m.setShared(false);
		ArrayList<Rating> rates = new ArrayList<Rating>();
		m.setRatings(rates);
		uCreated.add(m);
		uViewed.add(m);
		boolean empt = m.getRatings().isEmpty();
		double sum = 0.0;
		if (empt == true) {
			sum = 0.0;
		}else
			for (Rating rate: m.getRatings()) {
				double var = rate.getScore();
				sum += var;
			}
		assertEquals(sum, m.calculateRating(), 0.0);
	}
	
	@Test
	public void setAndGetCreator() {
		//instance of meme object
		String caption = "caption";
		BackgroundImage img = new BackgroundImage("Img File Name", "Title", "Description");
		String username = "username";
		User u = new User(username);
		ArrayList<Meme> uCreated = new ArrayList<Meme>();
		ArrayList<Meme> uViewed = new ArrayList<Meme>();
		u.setMemesCreated(uCreated);
		u.setMemesViewed(uViewed);
		Meme m = new Meme(img, caption, u);
		m.setShared(false);
		ArrayList<Rating> rates = new ArrayList<Rating>();
		m.setRatings(rates);
		uCreated.add(m);
		uViewed.add(m);
		String username2 = "username2";
		User u2 = new User(username2);
		ArrayList<Meme> uCreated2 = new ArrayList<Meme>();
		ArrayList<Meme> uViewed2 = new ArrayList<Meme>();
		u2.setMemesCreated(uCreated2);
		u2.setMemesViewed(uViewed2);
		
		//testing setters and getters
		assertEquals(u, m.getCreator());
		m.setCreator(u2);
		assertEquals(u2, m.getCreator());
		
		
	}
	
	@Test
	public void setAndGetBackgroundImage() {
		//instance of meme object
		String caption = "caption";
		BackgroundImage img = new BackgroundImage("Img File Name", "Title", "Description");
		BackgroundImage img2 = new BackgroundImage("Img File Name2", "Title2", "Description2");
		String username = "username";
		User u = new User(username);
		ArrayList<Meme> uCreated = new ArrayList<Meme>();
		ArrayList<Meme> uViewed = new ArrayList<Meme>();
		u.setMemesCreated(uCreated);
		u.setMemesViewed(uViewed);
		Meme m = new Meme(img, caption, u);
		m.setShared(false);
		ArrayList<Rating> rates = new ArrayList<Rating>();
		m.setRatings(rates);
		uCreated.add(m);
		uViewed.add(m);
		String username2 = "username2";
		User u2 = new User(username2);
		ArrayList<Meme> uCreated2 = new ArrayList<Meme>();
		ArrayList<Meme> uViewed2 = new ArrayList<Meme>();
		u2.setMemesCreated(uCreated2);
		u2.setMemesViewed(uViewed2);
		
		//testing setters and getters
		assertEquals(img, m.getBackgroundImage());
		m.setBackgroundImage(img2);
		assertEquals(img2, m.getBackgroundImage());
	}
	
	@Test
	public void setAndGetRatings() {
		//instance of meme object
		String caption = "caption";
		BackgroundImage img = new BackgroundImage("Img File Name", "Title", "Description");
		BackgroundImage img2 = new BackgroundImage("Img File Name2", "Title2", "Description2");
		String username = "username";
		User u = new User(username);
		ArrayList<Meme> uCreated = new ArrayList<Meme>();
		ArrayList<Meme> uViewed = new ArrayList<Meme>();
		u.setMemesCreated(uCreated);
		u.setMemesViewed(uViewed);
		Meme m = new Meme(img, caption, u);
		m.setShared(false);
		ArrayList<Rating> rates = new ArrayList<Rating>();
		ArrayList<Rating> rates2 = new ArrayList<Rating>();
		m.setRatings(rates);
		uCreated.add(m);
		uViewed.add(m);
		String username2 = "username2";
		User u2 = new User(username2);
		ArrayList<Meme> uCreated2 = new ArrayList<Meme>();
		ArrayList<Meme> uViewed2 = new ArrayList<Meme>();
		u2.setMemesCreated(uCreated2);
		u2.setMemesViewed(uViewed2);
		
		//testing setters and getters
		assertEquals(rates, m.getRatings());
		m.setRatings(rates2);
		assertEquals(rates2, m.getRatings());
	}
	
	@Test
	public void setAndGetCaption() {
		//instance of meme object
		String caption = "caption";
		BackgroundImage img = new BackgroundImage("Img File Name", "Title", "Description");
		BackgroundImage img2 = new BackgroundImage("Img File Name2", "Title2", "Description2");
		String username = "username";
		User u = new User(username);
		ArrayList<Meme> uCreated = new ArrayList<Meme>();
		ArrayList<Meme> uViewed = new ArrayList<Meme>();
		u.setMemesCreated(uCreated);
		u.setMemesViewed(uViewed);
		Meme m = new Meme(img, caption, u);
		m.setShared(false);
		ArrayList<Rating> rates = new ArrayList<Rating>();
		ArrayList<Rating> rates2 = new ArrayList<Rating>();
		m.setRatings(rates);	
		uCreated.add(m);
		uViewed.add(m);
		String username2 = "username2";
		User u2 = new User(username2);
		ArrayList<Meme> uCreated2 = new ArrayList<Meme>();
		ArrayList<Meme> uViewed2 = new ArrayList<Meme>();
		u2.setMemesCreated(uCreated2);
		u2.setMemesViewed(uViewed2);
		
		//testing setters and getters
		assertEquals(caption, m.getCaption());
		String caption2 = "changingCaption";
		m.setCaption(caption2);
		assertEquals(caption2, m.getCaption());
		
	}
	
	@Test
	public void setAndGetShared() {
		
		//instance of meme object
		String caption = "caption";
		BackgroundImage img = new BackgroundImage("Img File Name", "Title", "Description");
		BackgroundImage img2 = new BackgroundImage("Img File Name2", "Title2", "Description2");
		String username = "username";
		User u = new User(username);
		ArrayList<Meme> uCreated = new ArrayList<Meme>();
		ArrayList<Meme> uViewed = new ArrayList<Meme>();
		u.setMemesCreated(uCreated);
		u.setMemesViewed(uViewed);
		Meme m = new Meme(img, caption, u);
		boolean sharedTest = false;
		m.setShared(sharedTest);
		ArrayList<Rating> rates = new ArrayList<Rating>();
		ArrayList<Rating> rates2 = new ArrayList<Rating>();
		m.setRatings(rates);
		uCreated.add(m);
		uViewed.add(m);
		String username2 = "username2";
		User u2 = new User(username2);
		ArrayList<Meme> uCreated2 = new ArrayList<Meme>();
		ArrayList<Meme> uViewed2 = new ArrayList<Meme>();
		u2.setMemesCreated(uCreated2);
		u2.setMemesViewed(uViewed2);
		
		//testing setters and getters
		assertEquals(sharedTest, m.getShared());
		boolean sharedTest2 = true;
		m.setShared(sharedTest2);
		assertEquals(sharedTest2, m.getShared());
		
		
	}

}
