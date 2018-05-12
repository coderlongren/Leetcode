import java.util.Arrays;
import java.util.Comparator;

/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��4��27�� ����11:09:43
* ��˵��: 
*/
public class leetcode473_Matchsticks_to_Square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Integer[] nums = {2,5,4,6,3,1};
//		Arrays.sort(nums, new Comparator<Integer>() {
//
//			@Override
//			public int compare(Integer o1, Integer o2) {
//				// TODO Auto-generated method stub
//				if (o1 > o2) {
//					return -1;
//				}
//				else if(o1 == o2){
//					return 0;
//				}
//				else {
//					return 1;
//				}
//			}
//			
//		});
//		for (int i : nums) {
//			System.out.println(i);
//		}
		int[] nums  = {2,2,4,4,4};
		System.out.println(makesquare(nums));
		
	}
	public static boolean makesquare(int[] nums) {
		if(nums == null || nums.length < 4) {
			return false;
		}
		int sum = 0;
		for (int i : nums) {
			sum += i;
		}
		if (sum%4 != 0) {
			return false;
		}
		int target = sum/4;
		int[] sums = new int[4];
		return dfs(nums, 0, sums, target);
		
	}
	public static boolean dfs(int[] nums, int pos, int[] sums, int target) {
		// ��������ĩβ, ����ܹ���������Σ� ��sums[] ��¼�������ߵĳ������
		if (pos >= nums.length) {
			return sums[0] == target && sums[1] == target && sums[2] == target && sums[3] == target;
		}
		
		for (int i = 0; i < 4; i++) {
			if (sums[i] + nums[pos] > target) {
				continue;
			}
			sums[i] += nums[pos];
			if (dfs(nums, pos + 1, sums, target)) {
				return true;
			}
			sums[i]  = sums[i] - nums[pos];
		}
		return false;
	}

}
