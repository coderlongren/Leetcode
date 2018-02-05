import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
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
		int[] nums = {2,3,6,7};
//		System.out.println(subsets(nums));
		System.out.println(combinationSum2(nums, 7));
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
	
	
	// 组合数和  
	public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack1(list, new ArrayList<>(), candidates,0,target);
        return list;
        
    }
	public static void backtrack1(List<List<Integer>> list, List<Integer> templist, int[] nums, int start,int target) {
		if (getSum(templist) > target) {
			return ;
		}
		
		
		if (getSum(templist) == target) {
			list.add(new ArrayList<>(templist));
		}
		else {
			for (int i = 0; i < nums.length; i++) {
//				if (templist.contains(nums[i])) {
//					continue;
//				}
				templist.add(nums[i]);
				backtrack1(list, templist, nums, i + 1, target);
				templist.remove(templist.size() - 1);
			}
		}
	}
	private static int getSum(List<Integer> templist) {
		// TODO Auto-generated method stub
		int sum = 0;
		Iterator<Integer> iterator = templist.iterator();
		while (iterator.hasNext()) {
			sum += iterator.next();
		}
		return sum;
	}
	// 这个是正解///////////////////////////////////////////////////////////////////////////////////////////////
	public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
		List<List<Integer>> list = new ArrayList<>();
		Arrays.sort(candidates);
		backtrack3(list, new ArrayList<>(),candidates, target,0);
		return list;
		
	}
	public static void backtrack3(List<List<Integer>> list, List<Integer> templist,int[] candidates, int remain,int start) {
		// 因为所有元素都是positive, 所以不能再加入任何元素
		if (remain < 0) {
			return ;
		}
		// 找到了符合要求的数列
		if (remain == 0) {
			list.add(new ArrayList<>(templist));
			return;
		}
		
		for (int i = start; i < candidates.length; i++) {
			
			templist.add(candidates[i]);
			backtrack3(list, templist, candidates, remain - candidates[i],i);
			templist.remove(templist.size() - 1);
		}
		
	}
	///////////////////////////////////////////////////////////////////////////////////////////////////////////

}
