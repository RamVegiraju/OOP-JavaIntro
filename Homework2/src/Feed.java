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
	
	//testing
	public static void main(String[] args) {
		ArrayList<Meme> testing = new ArrayList<Meme>();
		Feed sharedFeed = new Feed(testing);
		User user1 = new User("Ram");
		User user2 = new User("RamVeg");
		User user3 = new User("RamVegiraju");
		BackgroundImage img1 = new BackgroundImage("demo1", "Dog", "A picture of my dog");
		BackgroundImage img2 = new BackgroundImage("demo2", "Cat", "A picture of my cat");
		BackgroundImage img3 = new BackgroundImage("demo3", "Turtle", "A picture of my turtle");
		BackgroundImage img4 = new BackgroundImage("demo4", "Snake", "A picture of my snake");
		BackgroundImage img5 = new BackgroundImage("demo5", "Elephant", "A picture of my elephant");
		BackgroundImage img6 = new BackgroundImage("demo6", "Rat", "A picture of my rat");
		BackgroundImage img7 = new BackgroundImage("demo7", "Puppy", "A picture of my puppy");
		BackgroundImage img8 = new BackgroundImage("demo8", "Spider", "A picture of my spider");
		BackgroundImage img9 = new BackgroundImage("demo9", "Mouse", "A picture of my mouse");
		user1.createMeme(img1, "This is a test meme creation of image one");
		user1.createMeme(img2, "This is a test meme creation of image two");
		user1.createMeme(img3, "This is a test meme creation of image three");
		user2.createMeme(img4, "This is a test meme creation of image four");
		user2.createMeme(img5, "This is a test meme creation of image five");
		user2.createMeme(img6, "This is a test meme creation of image six");
		user3.createMeme(img7, "This is a test meme creation of image seven");
		user3.createMeme(img8, "This is a test meme creation of image eight");
		user3.createMeme(img9, "This is a test meme creation of image nine");
		System.out.println(user1.toString());
		System.out.println(user2.toString());
		System.out.println(user3.toString());
		
		
	}

}