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
	public Rating(int score, User user) {
		this.score = score;
		this.user = user;
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
		return "";
	}
	
	
	//equals method
	@Override
	public boolean equals(Object expt) {
		return true;
	}
	
	

}
