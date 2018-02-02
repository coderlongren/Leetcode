import java.util.ArrayList;
import java.util.List;

/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��2��2�� ����11:05:22
* ��˵��: 
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
			list.add(new ArrayList<>(templist));// ���������ļ����ȥ
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
