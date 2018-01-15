import java.util.Arrays;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年1月14日 下午10:14:10
* 类说明: 
*/
public class leetcode628_Maximum_Product_of_three_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 // 如何生产一个 最大的数
	public int maximumProduct(int[] nums) {
        // 是不是应该先判断一下 最大的元素 是正数 还是负数
		int max = Integer.MIN_VALUE;
		
		for (int i : nums) {
			max = Math.max(max, i);
		}
		
		Arrays.sort(nums);
		int len = nums.length;
		// 下面一波的比较 足够完美了， 自己来做的时候，代码简直不忍目睹啊！！！
		int sum = nums[len - 1]*nums[len - 2]*nums[len - 3];
		sum = Math.max(sum, nums[0]*nums[1]*nums[2]);
		sum = Math.max(sum, nums[0]*nums[1]*nums[len - 1]);
		sum = Math.max(sum, nums[0]*nums[len - 1]*nums[len - 2]);
		return sum;
    }

}
