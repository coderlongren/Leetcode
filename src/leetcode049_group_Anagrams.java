import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��3��15�� ����6:38:19
* ��˵��: 
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
