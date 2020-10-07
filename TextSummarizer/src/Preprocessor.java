
public class Preprocessor {
	
	private String s;
	
	Preprocessor() {
		this.s = "";
	}
	
	Preprocessor(String s) {
		this.s = s;
	}
	
	public String lowerString() {
		this.s = s.toLowerCase();
		return this.s;
	}
	
	public String stripPunctuation() {
		this.s.replaceAll("\\p{Punct}", "");
		return this.s;
	}
	

	public static void main(String[] args) {
		String test = "THis is Ram Vegiraju I can't stop coding.";
		Preprocessor txt = new Preprocessor(test);
		test = txt.lowerString();
		test = txt.stripPunctuation();
		System.out.println(test);
		

	}

}
