import java.util.HashSet;

/* 
 * @author Ram Vegiraju
 * 09/17/2020
 * BackgroundImage class
 * */

/** 
 * 
 * BackgroundImage
 * ---------------
 * - imageFileName: String 
 * - title: String
 * - description: String
 * ---------------
 * + getImageFileName(): String
 * + setImageFileName(imageFileName: String): void 
 * + getTitle(): String
 * + setTitle(title: String): void
 * + getDescription(): void
 * + setDescription(description: String): void
 * + toString(): String
 * + equals(Object): boolean*/

public class BackgroundImage {
	
	private String imageFileName;
	private String title;
	private String description;
	
	
	//default constructor
	public BackgroundImage() {
		this.imageFileName = "";
		this.title = "";
		this.description = "";
	}
	
	//constructor
	public BackgroundImage(String imageFileName, String title, String description) {
		this.imageFileName = imageFileName;
		this.title = title;
		this.description = description;
	}

	/**
	 * @return the imageFileName
	 */
	public String getImageFileName() {
		return imageFileName;
	}

	/**
	 * @param imageFileName the imageFileName to set
	 */
	public void setImageFileName(String imageFileName) {
		this.imageFileName = imageFileName;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the String with title and description of BackgroundImage
	 */
	@Override
	public String toString() {
		return title + " <" + description + ">";
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (obj instanceof BackgroundImage) {
			BackgroundImage backgroundimage = (BackgroundImage) obj;
			boolean firstVar = this.title.equals(backgroundimage.title);
			boolean secondVar = this.description.equals(backgroundimage.description);
			boolean thirdVar = this.imageFileName.equals(backgroundimage.imageFileName);
			if (firstVar == true && secondVar == true && thirdVar == true) {
				return true;
			}
		}
		return false;
	}
}