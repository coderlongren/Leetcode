import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年2月3日 下午2:40:57
* 类说明:  SubSet1  里面都是没有重复的元素，如果有相同元素，又该怎么办呢？ 
*/
public class leetcode090_Subsets2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,3};
		System.out.println(subsetsWithDup(nums));
	}
	public static List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(list, new ArrayList<>(), nums, 0);
        return list;
        
    }
	public static void backtrack(List<List<Integer>> list, List<Integer> tempList, int[] nums,int start) {
		list.add(new ArrayList<>(tempList));
		
		for (int i = start; i < nums.length; i++) {
			if (i > start && nums[i] == nums[i - 1]) {
				continue;
			}
			tempList.add(nums[i]);
			backtrack(list, tempList, nums, i + 1);
			tempList.remove(tempList.size() - 1);
		}
	}

}
