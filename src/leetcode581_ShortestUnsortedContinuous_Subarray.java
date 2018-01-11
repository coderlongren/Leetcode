import java.util.Arrays;

import javax.swing.text.AbstractDocument.BranchElement;

/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��1��11�� ����5:24:45
* ��˵��:  solution1 �ȽϷ�
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
