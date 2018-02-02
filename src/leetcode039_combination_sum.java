import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.security.auth.Subject;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年2月2日 下午10:28:44
* 类说明: A general approach to backtracking questions in Java 
* (Subsets, Permutations, Combination Sum, Palindrome Partitioning)
*  包括了 子集合，排列组合，使用回溯法，
*/
public class leetcode039_combination_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,3};
		System.out.println(subsets(nums));
	}
	// 1 子集合问题的解法，
	public static List<List<Integer>> subsets(int[] nums) {
		List<List<Integer>> list = new ArrayList<>();
		Arrays.sort(nums);
		backtrack(list,new ArrayList<>(), nums, 0);
		return list;
	}
	private static void backtrack(List<List<Integer>> list, List<Integer> templist, int[] nums, int start) {
		list.add(new ArrayList<>(templist));
		for (int i = start; i < nums.length; i++) {
			templist.add(nums[i]);
			backtrack(list, templist, nums, i + 1);
			templist.remove(templist.size() - 1);
		}
	}
	

}
