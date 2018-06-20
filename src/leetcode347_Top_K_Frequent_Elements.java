import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年5月23日 下午1:25:48
* 类说明: 
*/
public class leetcode347_Top_K_Frequent_Elements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1};
		System.out.println(topKFrequent(nums, 1));
	}
	public static List<Integer> topKFrequent(int[] nums, int k) {
		 List<Integer> res = new ArrayList<>();
		if (nums.length == 1) {
			res.add(nums[0]);
			return res;
		}
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
        	map.put(num, map.getOrDefault(num, 0) + 1);
        }
        Set<Integer> set = new HashSet<>();
        for (int value : map.values()) {
        	set.add(value);
        }
        Integer[] values = set.toArray(new Integer[2]);
        Arrays.sort(values, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o2 - o1;
			}
		});
       
        List<Integer> temp = new ArrayList<>();
        for (int i = 0; i < k; i++) {
        	temp.add(values[i]);
        }
        for (int key : map.keySet()) {
        	if (temp.contains(map.get(key))) {
        		res.add(key);
        	}
        }
		return res;
    }
	 // 为何想不到用 TreeMap呢
	public static List<Integer> topKFrequent2(int[] nums, int k) {
		List<Integer> res = new ArrayList<>();
		if (nums.length == 1) {
			res.add(nums[0]);
			return res;
		}
		Map<Integer, Integer> map = new HashMap<>();
		for (int num : nums) {
			map.put(num, map.getOrDefault(num, 0) + 1);
		}
		TreeMap<Integer, ArrayList<Integer>> treeMap = new TreeMap<>();
		for (int num : map.keySet()) {
			int freq = map.get(num);
			if (!treeMap.containsKey(freq)) {
				treeMap.put(freq, new ArrayList<>());
			}
			treeMap.get(freq).add(num);
		}
		
		while (res.size() < k) {
			Map.Entry<Integer, ArrayList<Integer>> entry = treeMap.pollLastEntry();
			for (int temp : entry.getValue()) {
				res.add(temp);
			}
		}
		return res;
		
	}
}
