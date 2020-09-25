/* 
 * @author Ram Vegiraju
 * 09/17/2020
 * User class
 * */

/** 
 *
 *
 *
 *User
 *---------------
 * - userName: String
 * - memesCreated: ArrayList<Meme> 
 * - memesViewed: ArrayList<Meme>
 * ----------------
 * + getUserName(): String
 * + setUserName(userName: String): void
 * + getMemesCreated(): ArrayList<Meme>
 * + setMemesCreated(memesCreated: ArrayList<Meme>): void 
 * + getMemesViewed(): ArrayList<Meme>
 * + setMemesViewed(memesViewed: ArrayList<Meme>): void 
 * + rateMeme (Meme, rating: int): void
 * + createMeme(BackgroundImage, caption: String): null
 * + deleteMeme(Meme): boolean
 * + shareMeme(Meme, Feed): void
 * + rateNextMeme(Feed, ratingScore: int): void
 * + calculateReputation(): double
 * + toString(): String
 * + equals(Object): boolean
 * 
 * */


import java.util.ArrayList;

public class User {
	
	private String userName;
	private ArrayList<Meme> memesCreated;
	private ArrayList<Meme> memesViewed;
	
	//default constructor
	public User() {
		this.userName = "";
		this.memesCreated = null;
		this.memesViewed = null;
	}
	
	//constructor
	public User(String userName, ArrayList<Meme> memesCreated, ArrayList<Meme> memesViewed) {
		this.userName = userName;
		this.memesCreated = memesCreated;
		this.memesViewed = memesViewed;
	}

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return the memesCreated
	 */
	public ArrayList<Meme> getMemesCreated() {
		return memesCreated;
	}

	/**
	 * @param memesCreated the memesCreated to set
	 */
	public void setMemesCreated(ArrayList<Meme> memesCreated) {
		this.memesCreated = memesCreated;
	}

	/**
	 * @return the memesViewed
	 */
	public ArrayList<Meme> getMemesViewed() {
		return memesViewed;
	}

	/**
	 * @param memesViewed the memesViewed to set
	 */
	public void setMemesViewed(ArrayList<Meme> memesViewed) {
		this.memesViewed = memesViewed;
	}
	
	//rateMeme method
	public void rateMeme(Meme tst, int rating) {
		/* STUB/TODO */
	}
	
	//createMeme method
	public Object createMeme(BackgroundImage bi, String caption) {
		return null;
		/* STUB/TODO */
	}
	
	//deleteMeme method
	public boolean deleteMeme(Meme del) {
		/* STUB/TODO Accepts a meme and returns a boolean*/
		return false;
	}
	
	//shareMeme method
	public void shareMeme(Meme sh, Feed fd) {
		/* STUB/TODO */
	}
	
	//rateNextMeme method
	public void rateNextMeme(Feed rnm, int rs) {
		/* STUB/TODO */
	}
	
	//calculateReputation method
	public double calculateReputation() {
		/* STUB/TODO Returns a double*/
		return 0.0;
	}

	//generate toString method
	@Override
	public String toString() {
		return "";
	}
	
	//equals method
	//@Override
	public boolean equals(Object obj) {
		/* STUB/TODO Returns a boolean*/
		return true;
	}
	
}
