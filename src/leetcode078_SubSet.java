import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ThreadPoolExecutor;
/***
 * Given a set of distinct integers, nums, return all possible subsets (the power set).

Note: The solution set must not contain duplicate subsets.

For example,
If nums = [1,2,3], a solution is:

[
  [3],
  [1],
  [2],
  [1,2,3],
  [1,3],
  [2,3],
  [1,2],
  []
]

 * @author Administrator
 *
 */
public class leetcode078_SubSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,3};
		System.out.println(subsets(nums));
//		ThreadPoolExecutor
	}
	 public static List<List<Integer>> subsets(int[] nums) {
	     // 排序之后循环 题目关键之处在于 distinct integers 意味着 数字不会重复，降低了难度
		 List<List<Integer>> answer = new ArrayList<List<Integer>>();
		 
		 answer.add(new ArrayList<Integer>());
		 for (int i = 0;i < nums.length;i++){
			 List<List<Integer>> temp = new ArrayList<List<Integer>>();
			 for (List<Integer> x:answer){
				 List<Integer> y = new ArrayList<Integer>(x);
				 y.add(nums[i]);
				 temp.add(y);
			 }
			 answer.addAll(temp);
		 }
		 return answer;
		 
	  }

}
