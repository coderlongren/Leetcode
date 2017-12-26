import java.util.HashMap;
import java.util.Map;

/**
* @author 作者 : coderlong
* @version 创建时间：2017年12月26日 下午12:23:38
* 类说明: 
*/
public class leetcode383_Ranson_Note {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ransomNote = "aabbcd";
		String mag = "abbbccddfff";
		System.out.println(canConstruct(ransomNote, mag));
	}
	public static boolean canConstruct(String ransomNote, String magazine) {
		if (magazine.length() == 0 && ransomNote.length() == 0){
			return true;
		}
		if (magazine == null || magazine.length() == 0){
			return false;
		}
		Map<Character, Integer> ran_map = new HashMap<>();
		for (int i = 0; i < ransomNote.length(); i++){
			if (!ran_map.keySet().contains(ransomNote.charAt(i))){
				ran_map.put(ransomNote.charAt(i), ran_map.getOrDefault(ransomNote.charAt(i), 1));
			}
			else {
				ran_map.put(ransomNote.charAt(i), ran_map.get(ransomNote.charAt(i)) + 1);
			}
		}
		Map<Character, Integer> ma_map = new HashMap<>();
		
		for (int i = 0; i < magazine.length(); i++){
			if (!ma_map.keySet().contains(magazine.charAt(i))){
				ma_map.put(magazine.charAt(i), ma_map.getOrDefault(magazine.charAt(i),1));
			}
			else {
				ma_map.put(magazine.charAt(i), ma_map.get(magazine.charAt(i)) + 1);
			}
		}
		for (Character c : ran_map.keySet()) {
			if (!ma_map.keySet().contains(c)){
				return false;
			}
			else {
				if (ran_map.get(c) > ma_map.get(c)){
					return false;
				}
			}
		}
		return true;
	}
}
