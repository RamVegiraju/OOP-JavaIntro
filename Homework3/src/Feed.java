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
		this.memes = new ArrayList<Meme>();
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
		for (Meme meme: memes) {
			if (!expt.getMemesViewed().contains(meme) && !(meme.getCreator().equals(expt))) {
				return meme;
			}
		}
		return null;
	}
	
	/**
	 * @return the memes with a meme on each line
	 */
	@Override
	public String toString() {
		String res = "";
		for (Meme meme: this.memes) {
			res += meme.toString() + "\n";
		}
		return res;
	}


}