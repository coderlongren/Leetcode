import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年5月8日 下午1:24:25
* 类说明: 
*/
public class leetcode721_Accounts_merge {
	public static void main(String[] args) {
		 
	}
	 public List<List<String>> accountsMerge(List<List<String>> accounts) {
		 List<List<String>> res = new ArrayList<>();
	      if (accounts == null) {
	    	  return res;
	      }
	      HashMap<String, Set<Set<String>>> map = new LinkedHashMap<>();
	      
	      for (List<String> l : accounts) {
	    	  if (l.size() < 2) {
	    		  continue;
	    	  }
	    	  Set<String> set = new LinkedHashSet<>();
	    	  if (!map.containsKey(l.get(0))) {
	    		 map.put((String)l.get(0), new LinkedHashSet<>());
	    	  }
	    	  Set<String> megSet = new LinkedHashSet<>(l);
	    	  megSet.remove(l.get(0)); // 去掉name
	    	  for (int i = 1; i < l.size(); i++) {
	    		  if (map.get(l.get(0)).size() != 0) { // 这个名字对应的有 Set
	    			  String s = l.get(i);
	    			  Set<Set<String>> sets = map.get(l.get(0));
	    			  Iterator<Set<String>> iterator = sets.iterator();
	    			  while (iterator.hasNext()) {
	    				  Set<String> s1 = iterator.next();
	    				  if (s1.contains(s)) {
	    					  megSet.addAll(s1);
	    					  iterator.remove();
	    				  }
	    			  }
	    		  }
	    	  }
	    	  map.get(l.get(0)).add(megSet);
	    	  
	      }
	      for (String name : map.keySet()) {
	    	  for (Set<String> set : map.get(name)) {
	    		  List<String> list = new ArrayList<>(set);
	    		  Collections.sort(list);
	    		  list.add(0, name);
	    		  res.add(list);
	    	  }
	      }
		return res;
	      
	 }
}
