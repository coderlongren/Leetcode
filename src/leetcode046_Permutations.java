import java.util.ArrayList;
import java.util.List;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年2月2日 下午11:05:22
* 类说明: 
*/
public class leetcode046_Permutations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public List<List<Integer>> permute(int[] nums) {
		List<List<Integer>> list = new ArrayList<>();
		backtrack(list, new ArrayList<>(), nums);
		return list;
    }
	public void backtrack(List<List<Integer>> list, List<Integer> templist, int[] nums){
		if (templist.size() == nums.length) {
			list.add(new ArrayList<>(templist));// 符合条件的加入进去
		}
		else {
			for (int i = 0; i < nums.length; i++) {
				if (templist.contains(nums[i])){
					continue;
				}
				templist.add(nums[i]);
				backtrack(list, templist, nums);
				templist.remove(templist.size() - 1);
			}
		}
	}

}
