import java.math.BigInteger;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年4月20日 下午10:09:53
* 类说明: 
*/
public class leetcode376_Wiggle_Subsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BigInteger bigInteger = new BigInteger("2123423423");
		System.out.println(bigInteger.multiply(new BigInteger("3445645645645756756756756756757")));
		System.out.println(2123423423*344564564);
		int[] nums = {2,1,6,3,2};
		System.out.println(wiggleMaxLength(nums));
	}
	// 下面的这个是O(n)时间复杂度的 解法， 一般我们可能想不到这个，
	public static int wiggleMaxLength(int[] nums) {
		if (nums == null || nums.length == 0) {
			return 0;
		}
		
		int k = 0;
		while (k < nums.length - 1 && nums[k] == nums[k + 1]) {
			k++;
		}
		if (k == nums.length - 1) {
			// 说明 数组的元素全部一样
			return 1;
		}
		// 至少 有两个元素
		int result = 2;
		// true 第一个关系是small ; false 第一个关系是 big
		boolean small = nums[k] < nums[k + 1];
		for (int i = k + 1; i < nums.length - 1; i++) {
			// 第一个关系是 small 第二个关系是 big的话
			if (small && nums[i] > nums[i + 1]) {
				// 变换关系， result++
				nums[result] = nums[i + 1];
				result++;
				small = !small;
			}
			else {
				if (!small && nums[i] < nums[i + 1]) {
					nums[result] = nums[i + 1];
					result++;
					small = !small;
				}
				
			}
		}
		return result;
	}
	// 上面是O（n）的解法，这个是动态规划的标准解法
	public static int wiggleMaxLength2(int[] nums) {
		if (nums == null || nums.length == 0) {
			return 0;
		}
		// 我们可以用两个数组 up[], down[] 来表示 i 处应该往上跳，还是往下跳
		int[] up = new int[nums.length];
		int[] down = new int[nums.length];
		up[0] = 1;
		down[0] = 1; // 只有一个元素的时候，往下，往上跳都可以
		for (int i = 1; i < nums.length; i++) {
			if (nums[i - 1] > nums[i]) {
				up[i] = down[i - 1] + 1;
				down[i] = down[i - 1];
			}
			else if (nums[i - 1] < nums[i]) {
				up[i] = up[i - 1];
				down[i] = up[i - 1 + 1];
			}
			else {
				up[i] = up[i - 1];
				down[i] = down[i - 1];
			}
		}
		return Math.max(up[nums.length - 1], down[nums.length - 1]);
	}
}
