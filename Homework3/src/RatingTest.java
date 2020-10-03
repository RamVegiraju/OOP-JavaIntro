/* 
 * @author Ram Vegiraju
 * 10/02/2020
 * Rating class test
 * */

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class RatingTest {

	@Test
	public void testRating() {
		Rating r = new Rating();
		String username = "Ram";
		ArrayList<Meme> uCreated = new ArrayList<Meme>();
		ArrayList<Meme> uViewed = new ArrayList<Meme>();
		User u = new User(username);
	}
	
	@Test
	public void toStringTest() {
		String username = "Ram";
		ArrayList<Meme> uCreated = new ArrayList<Meme>();
		ArrayList<Meme> uViewed = new ArrayList<Meme>();
		User u = new User(username);
		u.setMemesCreated(uCreated);
		u.setMemesViewed(uViewed);
		Rating r = new Rating(u,4);
		String useName = u.getUserName();
		String result = useName + " rates" + r.getScore();
		assertEquals(r.toString(),result);		
	}
	
	@Test
	public void equalsTest() {
		String username = "Ram";
		ArrayList<Meme> uCreated = new ArrayList<Meme>();
		ArrayList<Meme> uViewed = new ArrayList<Meme>();
		User u = new User(username);
		u.setMemesCreated(uCreated);
		u.setMemesViewed(uViewed);
		Rating r = new Rating(u,4);
		Rating r2 = r;
		assertTrue("Objects should be equals", r.equals(r2));
		Rating r3 = null;
		assertFalse("Null object should return false", r.equals(r3));
		
	}
	
	@Test
	public void setAndGetScore() {
		String username = "Ram";
		ArrayList<Meme> uCreated = new ArrayList<Meme>();
		ArrayList<Meme> uViewed = new ArrayList<Meme>();
		User u = new User(username);
		u.setMemesCreated(uCreated);
		u.setMemesViewed(uViewed);
		Rating r = new Rating(u,4);
		assertEquals(4,r.getScore());
		r.setScore(5);
		assertEquals(5,r.getScore());
	}
	
	@Test
	public void setAndGetUser() {
		String username = "Ram";
		ArrayList<Meme> uCreated = new ArrayList<Meme>();
		ArrayList<Meme> uViewed = new ArrayList<Meme>();
		User u = new User(username);
		u.setMemesCreated(uCreated);
		u.setMemesViewed(uViewed);
		Rating r = new Rating(u, 4);
		assertEquals(u, r.getUser());
		String username2 = "RamChanged";
		User u2 = new User(username2);
		u2.setMemesCreated(uCreated);
		u2.setMemesViewed(uViewed);
		r.setUser(u2);
		assertEquals(u2, r.getUser());
		
	}

}
