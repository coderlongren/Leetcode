import java.util.Arrays;

import javax.swing.text.AbstractDocument.BranchElement;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年1月11日 下午5:24:45
* 类说明:  solution1 比较法
*/
public class leetcode581_ShortestUnsortedContinuous_Subarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {2, 6, 4, 8, 10, 9, 15};
		System.out.println(findUnsortedSubarray(nums));
	}
	public static int findUnsortedSubarray(int[] nums) {
        int[] nums2 = new int[nums.length];
        System.arraycopy(nums, 0, nums2, 0, nums.length);
        Arrays.sort(nums2);
        int pre = 0;
        int next = 0;
        for (int i = 0; i < nums.length; i++){
        	if (nums[i] != nums2[i]){
        		pre = i;
        		break;
        	}
        }
        for (int i = nums.length - 1; i >= 0; i--){
        	if (nums[i] != nums2[i]){
        		next = i;
        		break;
        	}
        }
        if (pre == next){
        	return 0;
        }
        return next - pre + 1;
    }

}
