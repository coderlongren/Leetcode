import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年4月27日 下午7:24:10
* 类说明: 
*/
public class leetcode416_partitionEqualSubSetSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {2,3,4,5};
		System.out.println(canPartition2(nums));
	}
	// 好像没有考虑错了， Wrong Answer
	 public static boolean canPartition(int[] nums) {
		 if (nums == null || nums.length < 2) {
			 return false;
		 }
		 int size = nums.length;
		 Arrays.sort(nums);
		 int[] before = new int[size];
		 int[] back = new int[size];
		 before[0] = nums[0];
		 for (int i = 1; i < size; i++) {
			 before[i] = nums[i] + before[i - 1];
		 }
		 back[size - 1] = nums[size - 1];
		 for (int i = size - 1 - 1; i >= 0; i--) {
			 back[i] = nums[i] + back[i + 1]; 
		 }
		 for (int i = 0; i < size - 1; i++) {
			 if (before[i] == back[i + 1]) {
				 return true;
			 }
		 }
		 return false;
	 }
	 // 这道题体现出了 DFS的思想， 给定数组Sum/2  看是否能够对数组中
	 // 每一个元素 都能找到一条 通往Dp[0]的路径
	 public static boolean canPartition2(int[] nums) {
		 if (nums == null || nums.length < 2) {
			 return false;
		 }
		 int sum = 0;
		 for (int i : nums) {
			 sum += i;
		 }
		 if (sum%2 == 1) {
			 return false;
		 }
		 int target = sum/2;
		 boolean[] dp = new boolean[target + 1];
		 dp[0] = true;
		 for (int i = 0; i < nums.length; i++) {
			 for (int j = target; j >= nums[i]; j--) {
				 dp[j] = dp[j]?dp[j]:dp[j - nums[i]]; 
			 }
		 }
		 return dp[target];
	 }

}
