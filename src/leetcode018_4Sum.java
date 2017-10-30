import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class leetcode018_4Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static List<List<Integer>> fourSum(int[] nums, int target) {
		if (nums == null || nums.length < 4){
			return new ArrayList<List<Integer>>();
		}
		//将原数组 排序
		Arrays.sort(nums);
		Set<List<Integer>> set = new HashSet<List<Integer>>();
		
		for (int i = 0; i < nums.length - 3; i++){
//			int j =  i + 1;
			int Sum3 = target - nums[i];
			
			for (int j = i + 1; j < nums.length - 2; j++){
				int left = j + 1;
				int right = nums.length - 1;
				while (left < right) {
					int sum = nums[j] + nums[left] + nums[right];
					//得到了一组数值
					if (sum == Sum3){
						List<Integer> list_new = new ArrayList<Integer>();
						list_new.add(nums[j]);
						list_new.add(nums[left]);
						list_new.add(nums[right]);
						list_new.add(nums[i]);
						//这里的set集合石haahSet  基本保证了去重复
						set.add(list_new);
						left++;
						right--;
						//去重复
						while (left < right && nums[left] == nums[left - 1]){
							left++;
						}
						while (left < right && nums[right] == nums[right + 1]){
							right--;
						}
					}
					else if (sum < Sum3){
						left++;
					}
					else {
						right--;
					}
					
				}
			}
		}
		return new ArrayList<List<Integer>>(set);
    }

}
