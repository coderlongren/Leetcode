import java.util.HashMap;
import java.util.Map;

public class leetcode697_Degree_Of_an_Array {

	public static void main(String[] args) {
		int[] nums = {1, 2, 2, 3, 1};
		System.out.println(findShortestSubArray(nums));
	}
	public static int findShortestSubArray(int[] nums) {
	 
		if (nums == null || nums.length == 0){
			return 0;
		}
		Map<Integer, Integer> count = new HashMap<Integer, Integer>();
		Map<Integer, Integer> start = new HashMap<Integer, Integer>();
		Map<Integer, Integer> end = new HashMap<Integer, Integer>();
		int maxCount = 1;
		int len = nums.length;
		for (int i = 0; i < nums.length; i++){
			// 如果count map 不包含num[i]的话  加入count map
			if (!count.containsKey(nums[i])){
				count.put(nums[i], 1);
				start.put(nums[i], i);
			}
			count.put(nums[i], count.get(nums[i]) + 1);
			end.put(nums[i], i);
			maxCount = Math.max(maxCount, count.get(nums[i]));
		}
		int result = 1000000000;
		for(int i : count.keySet()){
			if (maxCount == count.get(i)){
				result = Math.min(result, end.get(i) - start.get(i) + 1);
			}
		}
		return result;
	}

}
