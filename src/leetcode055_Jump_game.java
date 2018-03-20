/**
* @author 作者 : coderlong
* @version 创建时间：2018年3月16日 下午12:56:08
* 类说明:  愚蠢的解法， 还是要  贪心算法
*/
public class leetcode055_Jump_game {
	public static boolean canJump2(int[] nums) {
		if (nums == null || nums.length == 0) {
        	return false;
        }
		int end = nums.length - 1;
		int max = 0; // 贪心距离
		for (int i = 0; i < nums.length - 1; i++) {
			max = Math.max(max, nums[i] + i);
			
			// 计算到达每个点， 能够跳出的最大距离， 如果到达当前点时，不能往后跳，返回fasle
			if (max < (i + 1)) {
				return false;
			}
			if (max >= end) {
				return true;
			}
		}
		
		return max >= end ? true: false;
	}
	public static boolean canJump(int[] nums) {
        if (nums == null || nums.length == 0) {
        	return false;
        }
        int start = 0;
        int end = nums.length - 1;
        return canReachEnd(nums, start, end);
    }
	public static boolean canReachEnd(int[] nums, int start, int end) {
		if (start >= end) {
			return true;
		}
		// 这一步 能跳到吗？ 
		for (int i = 1; i <= nums[start]; i++) {
			if (canReachEnd(nums, start + i, end)) {
				return true;
			}
		}
		return false;
		
	}
	public static void main(String[] args) {
		int[] A = {2,3,1,1,4};
		int[] B = {3,2,1,0,4};
		int[] C = {1,0,1,0};
		System.out.println(canJump2(C));
	}
	
}
