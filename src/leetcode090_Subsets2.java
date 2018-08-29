import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��2��3�� ����2:40:57
* ��˵��:  SubSet1  ���涼��û���ظ���Ԫ�أ��������ͬԪ�أ��ָ���ô���أ� 
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
