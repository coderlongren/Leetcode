import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.IntPredicate;

/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��2��4�� ����10:40:56
* ��˵��: 
*/
public class leetcode047_Permutations2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {3,3,0,3};
		System.out.println(permuteUnique(nums));
	}
	
	public static List<List<Integer>> permuteUnique(int[] nums) {
		List<List<Integer>> list = new ArrayList<>();
		Arrays.sort(nums);
		boolean[] flags = new boolean[nums.length]; // Ĭ�϶��� false
		backtrack(list, new ArrayList<>(), nums, flags);
		return list;
    }
	public static void backtrack(List<List<Integer>> list, List<Integer> templist, int[] nums, boolean[] flags) {
		if (templist.size() == nums.length) {
			list.add(new ArrayList<>(templist));
		}
		
		else {
			for (int i = 0; i < nums.length; i++) {
				if (flags[i]) {
					continue; // ������Ԫ��ʹ�ù��ˣ��Ͳ��ټ����ȥ
				}
				if (i > 0 && nums[i] == nums[i - 1] && !flags[i - 1]){
					continue; //
				}
				flags[i] = true;
				templist.add(nums[i]);
				backtrack(list, templist, nums, flags);
				templist.remove(templist.size() - 1);
				flags[i] = false;
			}
		}
		
		
	}

}
