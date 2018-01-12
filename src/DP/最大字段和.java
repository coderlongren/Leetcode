package DP;
/**
* @author 作者 : coderlong
* @version 创建时间：2018年1月12日 上午10:23:29
* 类说明: 
*/
public class 最大字段和 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {-1,-2,5,6,-20,100};
		System.out.println(maxSum(nums));
	}
	public static int maxSum(int[] nums){
		int sum = 0;
		int b = 0;
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

}
