import java.util.HashMap;
import java.util.Map;

public class leetcode205_isomorphic_strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = "fo";
		String t = "aa";
		System.out.println(isIsomorphic(string, t));
	}
	public static boolean isIsomorphic(String s, String t) {
        
		Map<Character, Character> map = new HashMap<Character, Character>();
		if (s.length() != t.length()){
			return false;
		}
		boolean flag = true;
		for (int i = 0; i < s.length(); i++){
			if (map.containsKey(s.charAt(i))){
				if (map.get(s.charAt(i)).equals(t.charAt(i))){
					;
				}
				else {
					return false;
				}
			}
			else {
				if (!map.containsValue(t.charAt(i))){
					map.put(s.charAt(i), t.charAt(i));
				}
				else {
					return false;
				}
			}

		}
		
		return flag;
    }

}
