/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��3��16�� ����12:56:08
* ��˵��:  �޴��Ľⷨ�� ����Ҫ  ̰���㷨
*/
public class leetcode055_Jump_game {
	public static boolean canJump2(int[] nums) {
		if (nums == null || nums.length == 0) {
        	return false;
        }
		int end = nums.length - 1;
		int max = 0; // ̰�ľ���
		for (int i = 0; i < nums.length - 1; i++) {
			max = Math.max(max, nums[i] + i);
			
			// ���㵽��ÿ���㣬 �ܹ������������룬 ������ﵱǰ��ʱ������������������fasle
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
		// ��һ�� �������� 
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
