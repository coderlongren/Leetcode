 package Mock_Interview_One;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年2月8日 下午12:51:09
* 类说明: 
*/
public class Interview2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,1,1};
		System.out.println(smallestDistancePair(nums, 2));
	}
	public static int smallestDistancePair(int[] nums, int k) {
		Set<Integer> set = new HashSet<>();
       for (int i = 0; i < nums.length - 1; i++) {
    	   for (int j = i + 1; j < nums.length; j++) {
    		   set.add(Math.abs(nums[i] - nums[j]));
    	   }
       }
       Integer[] res = set.toArray(new Integer[1]);
       Arrays.sort(res);
       if (k > res.length) {
    	   return res[res.length - 1];
       }
       return res[k - 1];
    }

}
