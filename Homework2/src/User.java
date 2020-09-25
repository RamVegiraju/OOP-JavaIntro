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
		this.userName = "ram";
		this.memesCreated = new ArrayList<Meme>();
		this.memesViewed = new ArrayList<Meme>();
	}
	
	//test constructor with just a username
	public User(String userName) {
		this.userName = userName;
		this.memesCreated = new ArrayList<Meme>();
		this.memesViewed = new ArrayList<Meme>();
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
	
	/**
	 * @param BackgroundImage, caption
	 * @return meme
	 * */
	public Meme createMeme(BackgroundImage bi, String caption) {
		
		Meme meme = new Meme(bi, caption, this);
		memesCreated.add(meme);
		return meme;
	}
	
	/**
	 * @param meme
	 * @return boolean
	 * */
	public boolean deleteMeme(Meme del) {
		if(memesCreated == null) {
			return false;
		}
		for(int i = 0; i < this.memesCreated.size(); i++) {
			if(this.memesCreated.get(i).equals(del)) {
				if(this.memesCreated.get(i).getShared() == true) {
					return false;
				}
				this.memesCreated.remove(del);
				break;
			}
		}
		return true;
	}
	
	/**
	 * @param meme, feed
	 * */
	public void shareMeme(Meme sh, Feed fd) {
		if (sh.getShared() == false) {
			sh.setShared(true);
			fd.getMemes().add(sh);
		}
	}
	
	/**
	 * @param meme, feed
	 * */
	public void rateNextMeme(Feed rnm, int rs) {
		/* STUB/TODO */
	}
	
	/**
	 * @return sum
	 * */
	public double calculateReputation() {
		double sum = 0.0;
		if (memesCreated.size() == 0) {
			return sum;
		}
		for (Meme meme: memesCreated) {
			sum += meme.calculateRating();
		}
		return sum;
	}

	/**
	 * @return the String with userName, memesViewed, and reputation
	 */
	@Override
	public String toString() {
		return this.getUserName() + " has rated (" + memesViewed.size() + ") memes, (" + this.calculateReputation() + ")";
	}
	
	//equals method
	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (obj instanceof User) {
			User user = (User) obj;
			boolean a = this.userName.equals(user.userName);
			if (a == true) {
				return true;
			}
		}
		return false;
	}
	
}

