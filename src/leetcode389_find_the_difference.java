import java.util.HashMap;
import java.util.Map;

/**
* @author 作者 : coderlong
* @version 创建时间：2017年12月28日 下午12:44:29
* 类说明: 
*/
public class leetcode389_find_the_difference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abcd";
		String t = "abcde";
		System.out.println(findTheDifference(s, t));

	}
	 public static char findTheDifference(String s, String t) {
		 if (s == null || t == null){
			 return ' ';
		 }
		 Map<Character, Integer> map_s = new HashMap<>();
		 Map<Character, Integer> map_t = new HashMap<>();
		 for (int i = 0; i < s.length(); i++){
			 if (!map_s.keySet().contains(s.charAt(i))){
				 map_s.put(s.charAt(i), map_s.getOrDefault(s.charAt(i), 1));
			 }
			 else {
				 map_s.put(s.charAt(i), map_s.get(s.charAt(i)) + 1);
			 }
		 }
		 for (int i = 0; i < t.length(); i++){
			 if (!map_t.keySet().contains(t.charAt(i))){
				 map_t.put(t.charAt(i), map_t.getOrDefault(t.charAt(i), 1));
			 }
			 else {
				 map_t.put(t.charAt(i), map_t.get(t.charAt(i)) + 1);
			 }
		 }
		 for (Character character : map_t.keySet()) {
			if (!map_s.keySet().contains(character) || map_s.get(character) != map_t.get(character)){
				return character;
			}
		}
		 
		return ' ';
	 }

}
