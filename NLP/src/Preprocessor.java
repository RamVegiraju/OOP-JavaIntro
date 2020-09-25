import java.util.ArrayList;
import java.util.List;

public class Preprocessor {
	
	private String text;
	
	Preprocessor() {
		text = "Unknown";
	}
	
	Preprocessor(String text) {
		this.text = text;
	}
	
	/**
	 * @return the text
	 */
	public String getText() {
		return text;
	}

	/**
	 * @param text the text to set
	 */
	public void setText(String text) {
		this.text = text;
	}
	
	public String convertLowerCase() {
		if (text == "") {
			return "You need to input some text";
		}
		text = text.toLowerCase();
		return text;
	}
	
	private static String stripPunctuation(String s) {
		return s.replaceAll("\\p{Punct}", "");
	}
	
	public ArrayList<String> tokenizer() {
		ArrayList<String> tokens = new ArrayList<String>();
		text = stripPunctuation(text);
		String [] textString = text.split(" ");
		for(String word: textString) {
			tokens.add(word);
		}
		return tokens;
	}

	public static void main(String[] args) {
		Preprocessor test = new Preprocessor("This is a test. We will try again.");
		System.out.println(test.tokenizer());
		

	}

}
