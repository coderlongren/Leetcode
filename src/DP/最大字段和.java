package DP;
/**
* @author 作者 : coderlong
* @version 创建时间：2018年1月12日 上午10:23:29
* 类说明:  搞错了， 这是贪心的 最大字段和问题， Dp方法 不是这样子写得
*/
public class 最大字段和 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {-1,-2,5,6,-20,100};
		System.out.println(maxSum2(nums));
	}
	// Greedy
	public static int maxSum(int[] nums){
		int sum = 0;
		int b = Integer.MIN_VALUE;
		for (int i = 0; i < nums.length; i++){
			if (b > 0){
				b += nums[i];
			}
			else {
				b = nums[i];
			}
			if (b > sum){
				sum  = b;
			}
		}
		return sum;
	}
	// Dp 
	public static int maxSum2(int[] nums){
		int n = nums.length;
		int[] DP = new int[n];
		DP[0] = nums[0];
		int max = nums[0];
		
		for (int i = 1; i < n; i++) {
			DP[i] = nums[i]  + (DP[i - 1] > 0 ? DP[i - 1] : 0);
			max = Math.max(max, DP[i]);
		}
		return max;
	}

}
