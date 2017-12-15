import java.util.HashMap;
import java.util.Map;

/**
* @author 作者 : coderlong
* @version 创建时间：2017年12月15日 下午8:50:58
* 类说明: 
*/
public class leetcode003_longest_Substring {

	public static void main(String[] args){

		String string = "dvdfdcghj";
		System.out.println(lengthOfLongestSubstring(string));

	}
	public static int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int begin = 0, end = 0, counter = 0, d = 0;

        while (end < s.length()) {
            // > 0 means repeating character
            //if(map[s.charAt(end++)]-- > 0) counter++;
            char c = s.charAt(end);
            map.put(c, map.getOrDefault(c, 0) + 1);
            if(map.get(c) > 1) {
            	counter++;
            }
            end++;
            
            while (counter > 0) {
                //if (map[s.charAt(begin++)]-- > 1) counter--;
                char charTemp = s.charAt(begin);
                if (map.get(charTemp) > 1){
                	counter--;
                }
                map.put(charTemp, map.get(charTemp)-1);
                
                begin++;
            }
            d = Math.max(d, end - begin);
        }
        return d;
    }
}
