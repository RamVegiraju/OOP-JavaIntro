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
		this.creator = null;
		this.backgroundImage = null;
		this.ratings = null;
		this.caption = null;
		this.shared = false;
	}
	
	//constructor
	public Meme(User creator, BackgroundImage backgroundImage, ArrayList<Rating> ratings, String caption, boolean shared) {
		this.creator = creator;
		this.backgroundImage = backgroundImage;
		this.ratings = ratings;
		this.caption = caption;
		this.shared = shared;
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

	
	//to string Method
	@Override
	public String toString() {
		return "";
	}
	
	//equals method
	//@Override
	public boolean equals(Object obj) {
		return true;
	}
	
	

}
