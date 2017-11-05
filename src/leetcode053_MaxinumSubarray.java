
public class leetcode053_MaxinumSubarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	//using DP alogrithm
	
	  public static int maxSubArray(int[] nums) {
	        
		  int len = nums.length;
		  int[] dp = new int[len];
		  dp[0] = nums[0];
		  int max = nums[0];
		  for (int i = 1; i < len; i++){
			  if (nums[i] + dp[i - 1] > 0){
				dp[i] = nums[i] + dp[i - 1];  
			  }
			  else {
				dp[i] = 0;
			  }
			  max = Math.max(max, dp[i]);
		  } 
		
		  return max;
	  }

}
