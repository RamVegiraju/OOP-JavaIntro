/* 
 * @author Ram Vegiraju
 * 09/17/2020
 * Feed class
 * */


/** 
 * 
 * 
 * Feed
 * ---------------
 * - memes: ArrayList<Meme>
 * ---------------
 * + getMeme(): ArrayList<Meme>
 * + setMeme(ArrayList<Meme>): void 
 * + getNewMeme(User): null
 * + toString(): String*/

import java.util.ArrayList;

public class Feed {
	
	private ArrayList<Meme> memes;
	
	//default constructor
	public Feed() {
		this.memes = null;
	}
	
	//constructor
	public Feed(ArrayList<Meme> memes) {
		this.memes = memes;
	}

	/**
	 * @return the memes
	 */
	public ArrayList<Meme> getMemes() {
		return memes;
	}

	/**
	 * @param memes the memes to set
	 */
	public void setMemes(ArrayList<Meme> memes) {
		this.memes = memes;
	}
	
	//getNewMeme method
	public Meme getNewMeme(User expt) {
		return null;
	}
	
	//toString method
	@Override
	public String toString() {
		return "";
	}

}
