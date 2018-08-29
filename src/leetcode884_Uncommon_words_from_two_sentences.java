import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年8月20日 下午3:52:14
* 类说明: 
*/
public class leetcode884_Uncommon_words_from_two_sentences {
	public static void main(String[] args) {
		String string = "fd kss fd";
		String B = "fd fd kss";
		System.out.println(uncommonFromSentences(string, B));
	}
	 public static String[] uncommonFromSentences(String A, String B) {
		 String[] a = A.split(" ");
		 String[] b = B.split(" ");
		 Map<String, Integer> map = new HashMap<>();
		 
		 for (String string : a) {
			 if (map.containsKey(string)) {
				 map.put(string, map.get(string) + 1);
			 }
			 else {
				 map.put(string, 1);
			 }
		 }
		 for (String string : b) {
			 if (map.containsKey(string)) {
				 map.put(string, map.get(string) + 1);
			 }
			 else {
				 map.put(string, 1);
			 }
		 }
		 
		 List<String> res = new ArrayList<>();
		 
		 for (String key : map.keySet()) {
		 	 if (map.get(key) == 1) {
				 res.add(key);
			 }
		 }
		 if (res.size() > 0) {
			 String[] arr = res.toArray(new String[1]);
			 return arr;
		 } else {
			 String[] aa = {};
			 return aa;
		 }
	 }
}
