import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;


public class leetcode003_lengthOfLongestSubstring {

	// Longest Substring Without Repeating Characters 
	public static void main(String[] args) {
		
		String string = "dvdfdcghj";
		System.out.println(lengthOfLongestSubstring(string));
//		for (int i = 1;i < 1; i++){
//			System.out.println("a");
//		}
//		
		
	}
	//////s.toCharArray()[i])  为何不用s.charAt()  超时的原因就在于此啊 
	public static int lengthOfLongestSubstring(String s) {
		if (s.length() == 0 || s == null){
			return 0;
		}
		int ans = 0;
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0, j = 0; i < s.length(); i++){
			if (map.containsKey(s.toCharArray()[i])){
				j = Math.max(j, (map.get(s.charAt(i)) + 1));
			}
			map.put(s.charAt(i), i);
			ans = Math.max(ans, i - j + 1);
		}
		return ans;
    }
	
	
	/*
	public static int lengthOfLongestSubstring(String string){
		
		int length = string.length();
		int ans = 0;
		for (int i = 0; i < length; i++){
			for (int j = i + 1; j <= length; j++){
				if (allUnique(string, i, j)){
					ans = Math.max(ans, j - i);
				}
			}
		}
		return ans;
	}
	public static boolean allUnique(String string,int start,int end){
		
		Set<Character> set =new HashSet<Character>();
		for (int i = start; i < end; i++){
			if (set.contains(string.toCharArray()[i])){
				return false;
			}
			set.add(string.toCharArray()[i]);
		}
		return true;
	}
*/
	
	
}
