import java.util.HashMap;
import java.util.Map;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年5月11日 下午3:40:54
* 类说明: 
*/
public class leetcode819_Most_common_word {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String paragraph = "Bob";
		System.out.println(mostCommonWord(paragraph, new String[] {}));
	}
	public static String mostCommonWord(String paragraph, String[] banned) {
        String res = "";
        paragraph = paragraph.toLowerCase();
        if (banned != null) {
        	for (String string : banned) {
        		string = string.toLowerCase();
        		paragraph = paragraph.replaceAll(string, "");
        	}
        }
        Map<String, Integer> map = new HashMap<>();
        StringBuilder temp = new StringBuilder();
        int i = 0;
        paragraph += ".";
        while (i < paragraph.length()) {
        	while (paragraph.charAt(i) <= 'z' && paragraph.charAt(i) >= 'a') {
        		temp.append(paragraph.charAt(i));
        		i++;
        	}
        	if (temp.length() > 0) {
        		if (map.containsKey(temp.toString())) {
        			map.put(temp.toString(), map.get(temp.toString()) + 1);
        		}
        		else {
        			map.put(temp.toString(), 1);
        		}
        		temp.delete(0, temp.length());
        	}
        	i++;
        }
        int max = Integer.MIN_VALUE;
        for (String key : map.keySet()) {
        	max = Math.max(max, map.get(key));
        }
        for (String key : map.keySet()) {
        	if (map.get(key) == max) {
        		return key;
        	}
        }
		return res;
    }

}
