import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年1月5日 下午8:37:43
* 类说明: 
*/
public class leetcode532_K_diff_Pairs_in_an_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1, 3, 3, 1, 5};
		int k = 0;
		System.out.println(findPairs(nums, k));
	}
	public static int findPairs(int[] nums, int k) {
		Arrays.sort(nums);
		Map<Integer, Integer> map = new HashMap<>();
		int sum = 0;
		for (int i = 0; i < nums.length - 1; i++){
			for (int j = i + 1; j < nums.length; j++){
				if (Math.abs(nums[i] - nums[j]) == k){
					map.put(nums[i], nums[j]);
				}
			}
		}
		return map.keySet().size();
    }

}
