package leetcodeContest64;

import java.util.Set;
import java.util.TreeSet;

/**
* @author ���� : coderlong
* @version ����ʱ�䣺2017��12��24�� ����12:16:22
* ��˵��:   �����  ��д��
*/
public class leetcode747_Largest_numer_greater_than_twice_of_others {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public static int dominantIndex(int[] nums) {
		 
		 if (nums == null){
			 return -1;
		 }
		 
		 if (nums.length == 1){
			 return nums[0];
		 }
		 int max = Integer.MIN_VALUE;
		 for (int i : nums) {
			max = Math.max(i, max);
		 }
		 Set<Integer> set = new TreeSet<>();
		for (int i : nums) {
			if (i != max){
				set.add(i);
			}
		}
		int max2 = 0;
		if (set.size() != 0){
			
		}
		else {
			
		}
		return max2;
		
		 
	 }

}
