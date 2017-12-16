import java.util.ArrayList;
import java.util.List;

/**
* @author 作者 : coderlong
* @version 创建时间：2017年12月16日 下午11:13:35
* 类说明: 
*/
public class leetcode448_find_allNumder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {4,3,2,7,8,2,3,1};
		System.out.println(findDisappearedNumbers(nums));
	}
	public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ret = new ArrayList<Integer>();
        
        for(int i = 0; i < nums.length; i++) {
            int val = Math.abs(nums[i]) - 1;
            if(nums[val] > 0) {
                nums[val] = -nums[val];
            }
        }
        
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > 0) {
                ret.add(i+1);
            }
        }
        return ret;
    }
	public static List<Integer> findDisappearedNumbers2(int[] nums) {
		 List<Integer> res = new ArrayList<>();
	        int n = nums.length;
	        for (int i = 0; i < nums.length; i ++) nums[(nums[i]-1) % n] += n;
	        for (int i = 0; i < nums.length; i ++) if (nums[i] <= n) res.add(i+1);
	        return res;
	}

}
