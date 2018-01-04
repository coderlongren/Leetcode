import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年1月4日 下午10:03:07
* 类说明:  这一种比上一种使用 lambda表达式会更加简洁
*/
public class leetcode506_relative_ranks2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {-8, 4, 3, 2, 1};
		findRelativeRanks(nums);
	}
	public static String[] findRelativeRanks(int[] nums) {
	    if(nums == null || nums.length == 0) return new String[0];
	    int n = nums.length;
	    String[] result = new String[n];
	    Map<Integer, Integer> map = new HashMap<Integer, Integer>();
	    
	    for(int i = 0; i < n; ++i){
	        map.put(nums[i], i);
	    }
	    Arrays.sort(nums);
	    for( int i = 0; i < n/2; ++i ) { 
	        int temp = nums[i]; 
	        nums[i] = nums[n - i - 1]; 
	        nums[n - i - 1] = temp; 
	    }
	    
	    result[map.get(nums[0])] = "Gold Medal";
	    if(1 < n) result[map.get(nums[1])] = "Silver Medal";
	    if(2 < n) result[map.get(nums[2])] = "Bronze Medal";
	    for(int j = 3; j < n; ++j){
	        result[map.get(nums[j])] = String.valueOf(j + 1);
	    }
	    return result;
	}

}
