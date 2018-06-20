import java.util.HashMap;
import java.util.Map;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年5月19日 下午6:34:17
* 类说明: 
*/
public class leetcode523_Continuous_Subarrat_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {0,0};
		System.out.println(checkSubarraySum(nums, 0));
	}
	public static boolean checkSubarraySum(int[] nums, int k) {
		
        if (nums == null || nums.length <= 0) {
        	return false;
        } 
        int[] dp = new int[nums.length + 1];
        dp[0] = 0; 

        for (int i = 1; i <= nums.length; i++) {
        	dp[i] = dp[i - 1] + nums[i - 1];
        }
        for (int i = nums.length; i >= 1; i--) {
        	for (int j = i - 2; j >= 0; j--) {
        		if (k == 0) {
        			if (dp[j] - dp[i] == 0) {
        				return true;
        			}
        		}
        		else {
        			if (k != 0 && (dp[j] - dp[i]) % k == 0) {
        				return true;
        			}
        		}
        	}
        }
		return false;
        
    }
	public static boolean checkSubarraySum2(int[] nums, int k) {
	    Map<Integer, Integer> map = new HashMap<Integer, Integer>();
	    map.put(0, -1);
	    int runningSum = 0;
	    for (int i=0;i<nums.length;i++) {
	        runningSum += nums[i];
	        if (k != 0) runningSum %= k; 
	        Integer prev = map.get(runningSum);
	        if (prev != null) {
	            if (i - prev > 1) return true;
	        }
	        else map.put(runningSum, i);
	    }
	    return false;
	}
}
