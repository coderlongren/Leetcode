
public class leetcode053_MaxinumSubarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	//Greedy
	  public static int maxSubArray(int[] nums) {
	        
		  int len = nums.length;
		  int result = nums[0];
		  int sum = 0;
		  for (int i = 0; i < len; i++){
			sum += nums[i];
			result = Math.max(result, sum);
			sum = Math.max(sum, 0);
		  } 
		
		  return result;
	  }
	  // DP
	  public static int maxSubArray2(int[] nums) {
//		  int res = Integer.MIN_VALUE;
		  if (nums == null || nums.length == 0) {
	           return 0;
	       }
	        int[] dp = new int[nums.length];
	        dp[0] = nums[0];
	        int max = dp[0];
	        for (int i = 1; i < nums.length; i++) {
	            dp[i] = nums[i] + (dp[i - 1] > 0 ? dp[i - 1] : 0);
	            max = Math.max(max, dp[i]);
	        }
	        return max;
	  }
	  

}
