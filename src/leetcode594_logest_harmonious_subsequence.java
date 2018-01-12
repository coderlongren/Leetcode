import java.util.Iterator;
import java.util.Map.Entry;
import java.util.TreeMap;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年1月11日 下午7:48:10
* 类说明: 
*/
public class leetcode594_logest_harmonious_subsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,3,2,2,5,2,3,7};
		findLHS(nums);
	}
	public static int findLHS(int[] nums) {
		
		TreeMap<Integer, Integer> map = new TreeMap<>();
		for(Integer i : nums){
			if (!map.keySet().contains(i)){
				map.put(i, map.getOrDefault(i, 1));
			}
			else {
				map.put(i, map.get(i) + 1);
			}
		}
		int res = 0;
		for (int i : map.keySet()) {
			if (map.containsKey(i + 1)){
				res = Math.max(map.get(i) + map.get(i + 1), res);
			}
		}
		
		
//		int res = 0;
//		Iterator iterator = map.entrySet().iterator();
//		
//		while (iterator.hasNext()){
//			Entry entry = (Entry) iterator.next();
//			Entry nextEntry = null;
//			if (iterator.hasNext()){
//				nextEntry = (Entry) iterator.next();
//				if (Math.abs((Integer)entry.getKey() - (Integer)nextEntry.getKey()) == 1){
//					
//				}
//			}
//		}
//		
		return res;
        
    }

}
