import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年3月15日 下午6:38:19
* 类说明: 
*/
public class leetcode049_group_Anagrams {
	 public List<List<String>> groupAnagrams(String[] strs) {
	     if (strs == null || strs.length == 0) {
	    	 return null;
	     }
	     
	     Map<String, ArrayList<String>> map = new HashMap<>();
	     for (String s : strs) {
	    	 char[] temp = s.toCharArray();
	    	 Arrays.sort(temp);
	    	 if (!map.containsKey(String.valueOf(temp))) {
	    		 ArrayList<String> list = new ArrayList<>();
	    		 list.add(s);
	    		 map.put(String.valueOf(temp), list);
	    	 }
	    	 else {
	    		 ArrayList<String> list2 = map.get(String.valueOf(temp));
	    		 list2.add(s);
	    		 map.put(String.valueOf(temp), list2);
	    	 }
	     }
	     
	     return new ArrayList<>(map.values());
	 }
}
