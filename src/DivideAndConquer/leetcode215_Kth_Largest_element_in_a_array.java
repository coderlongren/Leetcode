package DivideAndConquer;

import java.util.Arrays;

/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��4��9�� ����4:36:28
* ��˵��: 
*/
public class leetcode215_Kth_Largest_element_in_a_array {

	public static void main(String[] args) {
		
	}
	// ������Ц :blush:
	public int findKthLargest(int[] nums, int k) {
		Arrays.sort(nums);
		return nums[nums.length - k];
    }
	

}
