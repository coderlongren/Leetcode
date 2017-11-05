package LeetcodeContest57;

import java.util.ArrayList;
import java.util.List;

public class leetcode_720LongestWordInDictionary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] words = {"yo","ew","fc","zrc","yodn","fcm","qm","qmo","fcmz","z","ewq","yod","ewqz","y"};
		System.out.println(longestWord(words));
	}
	 public  static String longestWord(String[] words) {
	      
		 
		 if (words == null){
			 return "";
		 }
		 List<String> result = new ArrayList<String>();
		 
		 for (int i = 0; i < words.length; i++){
			 String temp = "";
			 String test = words[i];
			 for (int j = i + 1; j < words.length;j++){
				 if (words[j].startsWith(test)){
					 result.add(words[j]);
				 }
			 }
		 }
		 System.out.println(result);
		 String string = result.get(0);
		 for (int i = 0; i < result.size(); i++){
			 if (result.get(i).length() >= string.length()){
				 if (result.get(i).length() == string.length()){
					 if (result.get(i).compareTo(string) < 0){
						 string = result.get(i);
					 }
				 }
				 else {
					 string = result.get(i); 
				}
			 }
		 }
		 
		 return string;
		 
	  }
}
