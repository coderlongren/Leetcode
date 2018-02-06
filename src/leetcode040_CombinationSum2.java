import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;import javax.print.attribute.standard.NumberUpSupported;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年2月5日 下午4:29:33
* 类说明: 其实这道题，和之前的那道combinationSum是一样的，只不过现在需要考虑重复的问题
*/
public class leetcode040_CombinationSum2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] candidates = {10, 1, 2, 7, 6, 1, 5};
		System.out.println(combinationSum2(candidates, 8));
	}
	 public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
	     List<List<Integer>> list = new ArrayList<>();
	     Arrays.sort(candidates);
	     backtrack(list, new ArrayList<>(), candidates, target, 0);   
	     return list;
	 }
	 public static void backtrack(List<List<Integer>> list, List<Integer> templist, int[] candidates, int remain,int start) {
		 if (remain < 0) {
			 return ;
		 }
		 if (remain == 0) {
			 list.add(new ArrayList<>(templist));
			 return;
		 }
		 for (int i = start; i < candidates.length; i++) {
			 if (i > start && candidates[i] == candidates[i - 1]) {
					continue; // 忽略重复的元素
				}
			 templist.add(candidates[i]);
			 backtrack(list, templist, candidates, remain - candidates[i], i + 1);
			 templist.remove(templist.size() - 1);
		 }
	}

}
