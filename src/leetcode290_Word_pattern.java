import java.util.HashMap;
import java.util.Map;

/**
* @author 作者 : coderlong
* @version 创建时间：2017年12月12日 下午8:10:08
* 类说明: 
*/
public class leetcode290_Word_pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pattern = "abba";
		String str = "dog dog dog dog";
		System.out.println(wordPattern(pattern, str));
		
		
//		String[] array = string.split(" ");
//		for (String string2 : array) {
//			System.out.println(string2);
//			System.out.println(string2.length());
//		}
	}
	 public static boolean wordPattern(String pattern, String str) {
		 String[] array = str.split(" ");
		 if (pattern.length() == 0 || pattern == null){
			 return false;
		 }
		 if (pattern.length() != array.length){
			 return false;
		 }
		 int index = 0;
		char[] patt = pattern.toCharArray();
		Map<Character, String> map = new HashMap<>();
		for (int i = 0; i < patt.length; i++){
			if (!map.containsKey(patt[i])){
				if (map.containsValue(array[i])){
					return false;
				}
				else {
					map.put(patt[i], array[i]);
				}
			}
			else {
				if (!map.get(patt[i]).equals(array[i])){
					return false;
				}
			}
		}
		return true;
	 }
}
