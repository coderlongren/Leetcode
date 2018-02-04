import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.IntPredicate;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年2月4日 下午10:40:56
* 类说明: 
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
		boolean[] flags = new boolean[nums.length]; // 默认都是 false
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
					continue; // 如果这个元素使用过了，就不再加入进去
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
