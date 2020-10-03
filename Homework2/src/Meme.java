/* 
 * @author Ram Vegiraju
 * 09/17/2020
 * Meme class
 * */

/** 
 * 
 * 
 * Meme
 * ---------------
 * - creator: User
 * - backgroundImage: BackgroundImage 
 * - ratings: ArrayList<Rating>
 * - caption: String
 * - shared: boolean
 * ----------------
 * + getCreator(): User
 * + setCreator(creator: User): void
 * + getBackgroundImage(): BackgroundImage
 * + setBackgroundImage(backgroundImage: BackgroundImage): void + getRatings(): ArrayList
 * + setRatings(ratings: ArrayList<Rating>): void
 * + getCaption(): String
 * + setCaption(caption: String): void
 * + getShared(): boolean
 * + setShared(shared: boolean): void
 * + toString(): String
 * + equals(Object): boolean*/

import java.util.ArrayList;

public class Meme {
	
	private User creator;
	private BackgroundImage backgroundImage;
	private ArrayList<Rating> ratings;
	private String caption;
	private boolean shared;
	
	//default constructor
	public Meme() {
		this.creator = new User();
		this.backgroundImage = new BackgroundImage();
		this.ratings = new ArrayList<Rating>();
		this.caption = "";
		this.shared = false;
	}
	
	//constructor that takes in BackgroundImage, caption, and User
	public Meme(BackgroundImage backgroundImage, String caption, User creator) {
		this.backgroundImage = backgroundImage;
		this.caption = caption;
		this.creator = creator;
		this.ratings = new ArrayList<Rating>();
		this.shared = false;
	}
	

	/**
	 * @return the creator
	 */
	public User getCreator() {
		return creator;
	}

	/**
	 * @param creator the creator to set
	 */
	public void setCreator(User creator) {
		this.creator = creator;
	}

	/**
	 * @return the backgroundImage
	 */
	public BackgroundImage getBackgroundImage() {
		return backgroundImage;
	}

	/**
	 * @param backgroundImage the backgroundImage to set
	 */
	public void setBackgroundImage(BackgroundImage backgroundImage) {
		this.backgroundImage = backgroundImage;
	}

	/**
	 * @return the ratings
	 */
	public ArrayList<Rating> getRatings() {
		return ratings;
	}

	/**
	 * @param ratings the ratings to set
	 */
	public void setRatings(ArrayList<Rating> ratings) {
		this.ratings = ratings;
	}

	/**
	 * @return the caption
	 */
	public String getCaption() {
		return caption;
	}

	/**
	 * @param caption the caption to set
	 */
	public void setCaption(String caption) {
		this.caption = caption;
	}

	/**
	 * @return the shared
	 */
	public boolean getShared() {
		return shared;
	}

	/**
	 * @param shared the shared to set
	 */
	public void setShared(boolean shared) {
		this.shared = shared;
	}

	/**
	 * @return count of positive votes
	 * */
	public int positiveVoteCounter() {
		int plusOneCount = 0;
		for(int i = 0; i < ratings.size(); i++) {
			if(ratings.get(i).getScore() == 1) {
				plusOneCount++;
			}
		}
		return plusOneCount;
	}
	
	/**
	 * @return count of negative votes
	 * */
	public int negativeVoteCounter() {
		int negativeOneCount = 0;
		for(int i = 0; i < ratings.size(); i++) {
			if(ratings.get(i).getScore() == -1) {
				negativeOneCount++;
			}
		}
		return negativeOneCount;
	}
	
	/**
	 * @return the String with backgroundImage,caption.creator, reputation, rating, positive votes and negative votes
	 */
	@Override
	public String toString() {
		return backgroundImage.toString() + " '" + caption.toString() + "' " + creator.getUserName().toString() + " (" +
	this.creator.calculateReputation() + ") " + this.calculateRating() + 
	" [(" + this.positiveVoteCounter() + ") +1 (" + this.negativeVoteCounter() + ") -1]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (obj instanceof Meme) {
			Meme meme = (Meme) obj;
			boolean firstVar = this.creator.equals(meme.creator);
			boolean secondVar = this.caption.equals(meme.caption);
			boolean thirdVar = this.backgroundImage.equals(meme.backgroundImage);
			if (firstVar == true && secondVar == true && thirdVar == true) {
				return true;
			}
		}
		return false;

	}
	
	/**
	 * @return sum
	 * */
	public double calculateRating() {
		boolean empt = ratings.isEmpty();
		double sum = 0.0;
		if (empt == true) {
			return 0.0;
		}else
			for (Rating rate: ratings) {
				double var = rate.getScore();
				sum += var;
			}
		return sum;
			
	}
	
}
