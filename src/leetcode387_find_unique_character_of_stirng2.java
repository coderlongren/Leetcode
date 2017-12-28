import java.util.HashMap;
import java.util.Map;

import javax.print.attribute.HashAttributeSet;

/**
* @author ���� : coderlong
* @version ����ʱ�䣺2017��12��28�� ����12:37:47
* ��˵��: 
*/
public class leetcode387_find_unique_character_of_stirng2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = "loveleetcode";
		System.out.println(firstUniqChar(string));
	}
	 public static int firstUniqChar(String s) {
		 if (s == null || s.length() == 0){
	    	 return -1;
	     }
		 Map<Character, Integer> map = new HashMap<>();
		 for (int i = 0; i < s.length(); i++){
			 if (!map.keySet().contains(s.charAt(i))){
				 map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 1));
			 }
			 else {
				 map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
			 }
		 }
		 for (int i = 0; i < s.length(); i++){
			 if (map.get(s.charAt(i)) == 1){
				 return i;
			 }
		 }
		 return -1;
		 
	 }
}
