package DivideAndConquer;

import java.util.Arrays;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年4月9日 下午4:36:28
* 类说明: 
*/
public class leetcode215_Kth_Largest_element_in_a_array {

	public static void main(String[] args) {
		
	}
	// 开个玩笑 :blush:
	public int findKthLargest(int[] nums, int k) {
		Arrays.sort(nums);
		return nums[nums.length - k];
    }
	

}
