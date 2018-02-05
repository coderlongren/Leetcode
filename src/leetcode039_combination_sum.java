import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import javax.security.auth.Subject;

/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��2��2�� ����10:28:44
* ��˵��: A general approach to backtracking questions in Java 
* (Subsets, Permutations, Combination Sum, Palindrome Partitioning)
*  ������ �Ӽ��ϣ�������ϣ�ʹ�û��ݷ���
*/
public class leetcode039_combination_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {2,3,6,7};
//		System.out.println(subsets(nums));
		System.out.println(combinationSum2(nums, 7));
	}
	// 1 �Ӽ�������Ľⷨ��
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
	
	
	// �������  
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
	// ���������///////////////////////////////////////////////////////////////////////////////////////////////
	public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
		List<List<Integer>> list = new ArrayList<>();
		Arrays.sort(candidates);
		backtrack3(list, new ArrayList<>(),candidates, target,0);
		return list;
		
	}
	public static void backtrack3(List<List<Integer>> list, List<Integer> templist,int[] candidates, int remain,int start) {
		// ��Ϊ����Ԫ�ض���positive, ���Բ����ټ����κ�Ԫ��
		if (remain < 0) {
			return ;
		}
		// �ҵ��˷���Ҫ�������
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
