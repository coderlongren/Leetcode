/**
* @author 作者 : coderlong
* @version 创建时间：2017年12月12日 下午8:37:05
* 使用动态规划先建立起  一个 sum[] 以后再求 sumRange(i, j) 就很方便了
* 类说明:  DP num[i]保存的就是 0-i之间的和，当然初始化num[i]是需要使用DP的，这样在计算 i -j之间的和就非常方便了， 直接num[j] - num[i]
*/
public class leetcode303_range_sum_Query_immutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	int[] nums;

	public leetcode303_range_sum_Query_immutable(int[] nums) {
		// 这是一个 DP过程
	    for(int i = 1; i < nums.length; i++) {
	    	nums[i] += nums[i - 1];
	    }
	    
	    this.nums = nums;
	}

	public int sumRange(int i, int j) {
	    if(i == 0)
	        return nums[j];
	    
	    return nums[j] - nums[i - 1];
	}

}
