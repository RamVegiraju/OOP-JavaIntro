/* 
 * @author Ram Vegiraju
 * 09/17/2020
 * Rating class
 * */

/** 
 * 
 * 
 * Rating
 * -----------
 * - score: int
 * - user: User
 * -----------
 * + getScore(): int
 * + setScore(score: int): void 
 * + getUser(): user
 * + setUser(user: User): void 
 * + toString(): String
 * + equals(Object): boolean
 * 
 * */

public class Rating {
	
	private int score;
	private User user;
	
	//default constructor
	public Rating() {
		this.score = 0;
		this.user = null;
	}
	
	//constructor
	public Rating(User user, int score) {
		this.user = user;
		this.score = score;
	}

	/**
	 * @return the score
	 */
	public int getScore() {
		return score;
	}

	/**
	 * @param score the score to set
	 */
	public void setScore(int score) {
		this.score = score;
	}

	/**
	 * @return the user
	 */
	public User getUser() {
		return user;
	}

	/**
	 * @param user the user to set
	 */
	public void setUser(User user) {
		this.user = user;
	}

	
	//toString method
	@Override
	public String toString() {
		String useName = user.getUserName();
		return useName + " rates " + score;
	}
	
	
	//equals method
	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (obj instanceof Rating) {
			Rating rating = (Rating) obj;
			boolean secondVar = false;
			if(this.score == rating.score) {
				secondVar = true;
			}
			boolean firstVar = this.user.equals(rating.user);
			if (firstVar == true && secondVar == true) {
				return true;
			}
		}
		return false;
	}
	
	/**
	 * @param integer of rating
	 */
	public void setRating(int vote) {
		if (vote > 0) {
			vote = 1;
		}else if (vote < 0) {
			vote = -1;
		}else
			vote = 0;
	}
	

}