import java.util.ArrayList;
import java.util.List;

public class SubstringSandwhich {
	
	public String getSandwich(String str) {
		//one occurrence return empty string
		if(str.indexOf("bread")==str.lastIndexOf("bread")) {
			return ""; 
		}else
			return(str.substring(str.indexOf("bread")+5,str.lastIndexOf("bread")));	  
	}




	public static void main(String[] args) {
		//System.out.println(getSandwich("yummybreadyummybread"));

	}

}
