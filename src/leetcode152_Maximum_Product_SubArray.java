/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��3��31�� ����10:00:36
* ��˵��: 
*/
public class leetcode152_Maximum_Product_SubArray {

	public static void main(String[] args) {
		
		int[] nums = {2,3,-2,4};
		System.out.println(maxProduct(nums));
		
	}
	public static int maxProduct(int[] nums) {
		
		int[] max = new int[nums.length];
		int[] min = new int[nums.length];
		max[0] = nums[0];
		min[0] = nums[0];
		int res = nums[0];
		
		for (int i = 1; i < nums.length; i++) {
			
			max[i] = Math.max(Math.max(max[i - 1]*nums[i], min[i - 1]*nums[i]), nums[i]);
			min[i] = Math.min(Math.min(max[i - 1]*nums[i], min[i - 1]*nums[i]), nums[i]);
			res = Math.max(res, max[i]);
			
		}
		
		return res;
	}

}
