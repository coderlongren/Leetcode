import java.util.ArrayList;
import java.util.Arrays;
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
		int[] nums = {1,2,3};
		System.out.println(subsets(nums));
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
	

}
