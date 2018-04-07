
public class leetcode198_house_Robber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	// using DP 
	public static int rob(int[] nums) {
		if (nums.length == 0 || nums == null){
			return 0;
		}
		int[] f = new int[nums.length];
		// 前两种情况是显而易见的
		// 1.
		if (nums.length == 1){
			f[0] = nums[0];
			return f[0];
		}
		// 2.
		if (nums.length == 2){
			f[1] = Math.max(nums[0], nums[1]);
			return f[1];
		}
		
		// 一般情况
		f[0] = nums[0];
		f[1] = Math.max(nums[0], nums[1]);
		for (int i = 2; i < nums.length; i++){
			f[i] = Math.max(f[i - 2] +nums[i], f[i - 1]);
		}
		int sum = Integer.MIN_VALUE;
		for (int i : f) {
			sum = Math.max(sum, i);
		}
		return sum;       
    }
	
	
}
