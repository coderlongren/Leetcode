package LeetcodeContest57;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class leetcode720Two {

	public static void main(String[] args) {
		String[] words = {"yo","ew","fc","zrc","yodn","fcm","qm","qmo","fcmz","z","ewq","yod","ewqz","y"};
		System.out.println(longestWord(words));
	}
 public  static String longestWord(String[] words) {
		 if (words == null){
			 return "";
		 }
		 List<String> result = new ArrayList<String>();
		 Map<String, Integer> map = new HashMap<String, Integer>();
		 for (int i = 0; i < words.length; i++){
			 String temp = "";
			 String test = words[i];
			 for (int j = i + 1; j < words.length;j++){
				 if (words[j].startsWith(test)){
					 result.add(words[j]);
				 }
			 }
		 }
		 for (int i = 0; i < words.length; i++){
			 map.put(words[i], 0);
		 }
		 for (int i = 0; i < words.length; i++){
			 for (int j = 0; j <words.length; j++){
				 if (words[i].startsWith(words[j])){
					 
					map.put(words[i], map.get(words[i]) + 1);
				 }
			 }
		 }
		 System.out.println(map);
		 String string = result.get(0);
		 for (int i = 0; i < result.size(); i++){
			 if (result.get(i).length() >= string.length()){
				 if (result.get(i).length() == string.length()){
					 if (map.get(words[i]) > map.get(string)){
						 string = result.get(i);
					 }
					 else {
						 if (result.get(i).compareTo(string) < 0){
							 string = result.get(i);
						 }
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
