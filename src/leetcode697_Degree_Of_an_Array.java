import java.util.HashMap;
import java.util.Map;

public class leetcode697_Degree_Of_an_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static int findShortestSubArray(int[] nums) {
	 
		int degree = 0, n = nums.length, minSize = n;
	    Map<Integer, Integer> map = new HashMap<Integer, Integer>();
	    Map<Integer, Integer[]> map2 = new HashMap<Integer, Integer[]>();
	    
	    for (int i=0;i<n;i++) {
	        map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
	        degree = Math.max(degree, map.get(nums[i]));

	        if (map2.get(nums[i]) == null) map2.put(nums[i], new Integer[2]);
	        Integer[] numRange = map2.get(nums[i]);
	        if (numRange[0] == null) numRange[0] = i;
	        numRange[1] = i;
	    }
		
		return 0;
	}

}
