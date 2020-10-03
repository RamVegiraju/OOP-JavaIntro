/* 
 * @author Ram Vegiraju
 * 10/02/2020
 * User class test
 * */

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class UserTest {

	@Test
	public void testUser() {
		User u = new User("username");
		ArrayList<Meme> uCreated = new ArrayList<Meme>();
		ArrayList<Meme> uViewed = new ArrayList<Meme>();
	}
	
	@Test
	public void toStringTest() {
		
	}
	
	@Test
	public void equalsTest() {
		String username = "username";
		User u = new User(username);
		ArrayList<Meme> uCreated = new ArrayList<Meme>();
		ArrayList<Meme> uViewed = new ArrayList<Meme>();
		u.setMemesCreated(uCreated);
		u.setMemesViewed(uViewed);
		User a = u;
		assertTrue("Objects should be equals", u.equals(a));
		User b = null;
		assertFalse("Null object should return false", u.equals(b));
		
	}
	
	@Test
	public void calculateReputationTest() {
		String username = "username";
		User u = new User(username);
		ArrayList<Meme> uCreated = new ArrayList<Meme>();
		ArrayList<Meme> uViewed = new ArrayList<Meme>();
		u.setMemesCreated(uCreated);
		u.setMemesViewed(uViewed);
		String caption = "caption";
		BackgroundImage bi = new BackgroundImage("Img File Name", "Title", "Description");
		
	}
	
	@Test
	public void rateNextMemeTest() {
		String username = "username";
		User u = new User(username);
		ArrayList<Meme> uCreated = new ArrayList<Meme>();
		ArrayList<Meme> uViewed = new ArrayList<Meme>();
		u.setMemesCreated(uCreated);
		u.setMemesViewed(uViewed);
		String caption = "caption";
		BackgroundImage bi = new BackgroundImage("Img File Name", "Title", "Description");
		
	}
	
	@Test
	public void shareMemeTest() {
		String username = "username";
		User u = new User(username);
		ArrayList<Meme> uCreated = new ArrayList<Meme>();
		ArrayList<Meme> uViewed = new ArrayList<Meme>();
		u.setMemesCreated(uCreated);
		u.setMemesViewed(uViewed);
		String caption = "caption";
		BackgroundImage bi = new BackgroundImage("Img File Name", "Title", "Description");
		
	}
	
	@Test
	public void deleteMemeTest() {
		String username = "username";
		User u = new User(username);
		ArrayList<Meme> uCreated = new ArrayList<Meme>();
		ArrayList<Meme> uViewed = new ArrayList<Meme>();
		u.setMemesCreated(uCreated);
		u.setMemesViewed(uViewed);
		String caption = "caption";
		BackgroundImage bi = new BackgroundImage("Img File Name", "Title", "Description");
		
	}
	
	@Test
	public void createMemeTest() {
		String username = "username";
		User u = new User(username);
		ArrayList<Meme> uCreated = new ArrayList<Meme>();
		ArrayList<Meme> uViewed = new ArrayList<Meme>();
		u.setMemesCreated(uCreated);
		u.setMemesViewed(uViewed);
		String caption = "caption";
		BackgroundImage bi = new BackgroundImage("Img File Name", "Title", "Description");
		
	}
	
	@Test
	public void setAndGetUserName() {
		String username = "username";
		User u = new User(username);
		ArrayList<Meme> uCreated = new ArrayList<Meme>();
		ArrayList<Meme> uViewed = new ArrayList<Meme>();
		u.setMemesCreated(uCreated);
		u.setMemesViewed(uViewed);
		assertEquals("username", u.getUserName());
		u.setUserName("Changing username");
		assertEquals("Changing username", u.getUserName());
		
	}
	
	@Test
	public void setAndGetMemesCreated() {
		String username = "username";
		User u = new User(username);
		ArrayList<Meme> uCreated = new ArrayList<Meme>();
		ArrayList<Meme> uViewed = new ArrayList<Meme>();
		u.setMemesCreated(uCreated);
		u.setMemesViewed(uViewed);
		assertEquals(uCreated, u.getMemesCreated());
		ArrayList<Meme> uCreated2 = new ArrayList<Meme>();
		assertEquals(uCreated2, u.getMemesCreated());
		
	}
	
	@Test
	public void setAndGetMemesViewed() {
		String username = "username";
		User u = new User(username);
		ArrayList<Meme> uCreated = new ArrayList<Meme>();
		ArrayList<Meme> uViewed = new ArrayList<Meme>();
		u.setMemesCreated(uCreated);
		u.setMemesViewed(uViewed);
		assertEquals(uViewed, u.getMemesViewed());
		ArrayList<Meme> uViewed2 = new ArrayList<Meme>();
		u.setMemesViewed(uViewed2);
		assertEquals(uViewed2, u.getMemesViewed());	
		
	}

}
