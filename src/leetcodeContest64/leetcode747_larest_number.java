package leetcodeContest64;

import java.util.Set;
import java.util.TreeSet;

/**
* @author ���� : coderlong
* @version ����ʱ�䣺2017��12��24�� ����12:27:34
* ��˵��:  ��ȷ���ŵĽⷨ
*/
public class leetcode747_larest_number {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {5,2,6,4,8,56,2};
		dominantIndex(nums);
	}
	public static int dominantIndex(int[] nums) {
	        // base case
	        if (nums == null || nums.length < 2) {
	            return -1;
	        }
	        // find max
	        int max = Integer.MIN_VALUE;
	        int largest = -1;
	        for (int i = 0; i < nums.length; i++) {
	            if (nums[i] > max) {
	                max = nums[i];
	                largest = i;
	            }
	        }
	        // check max is more than twice as big as x
	        for (int  i = 0; i < nums.length; i++) {
	            if (nums[i]*2 > max && i != largest) {
	                return -1;
	            }
	        }
	        
	        
	        return largest;

	 }
}
