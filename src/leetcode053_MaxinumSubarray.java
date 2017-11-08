
public class leetcode053_MaxinumSubarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	//using DP alogrithm
	
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

}
