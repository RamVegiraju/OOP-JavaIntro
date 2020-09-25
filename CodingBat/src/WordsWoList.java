import java.util.ArrayList;
import java.util.List;

public class WordsWoList {
	
	public List wordsWithoutList(String[] words, int len) {
		List<String> names2 = new ArrayList<String>();
		/*
		for(String strTmp : words) {
			if (strTmp.length() != len) {
				names2.add(strTmp);
			}else
				continue;
		}*/
		
		int arrLength = words.length;
		System.out.println(arrLength);
		for(int i = 0; i < arrLength; i++) {
			if (words[i].length() != len) {
				names2.add(words[i]);
			}
		}
		return names2;
		  
	}

	public static void main(String[] args) {
		WordsWoList wordList = new WordsWoList();
		String[] sampleWords = new String[4];
		sampleWords[0] = "Ram";
		sampleWords[1] = "Nadal";
		sampleWords[2] = "Rar";
		sampleWords[3] = "Test";
		int testLen = 2;
		System.out.println(wordList.wordsWithoutList(sampleWords,testLen));


	}

}
