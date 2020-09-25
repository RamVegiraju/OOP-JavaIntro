import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;

public class FileExpt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// /Users/ramvegiraju/Desktop/Undergrad/Fall2020/CS2110/Data
		
		String filename = "/Users/ramvegiraju/Desktop/Undergrad/Fall2020/CS2110/Data/data.txt";
		File file = new File(filename);
		
		if (file.exists()) {
			System.out.println("File exists");
		}else
			System.out.println("File does not exist");

		
		try {
			//InputStream input = new FileInputStream(filename);
			FileReader fr = new FileReader(filename);
			BufferedReader br = new BufferedReader(fr);
			String line = "";
			
			while((line = br.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
