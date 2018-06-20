import java.util.HashMap;
import java.util.Map;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年5月19日 下午9:39:17
* 类说明: 
*/
public class leetcode713_Subaray_Product_Less_Than_K {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {10,5,2,6};
		System.out.println(numSubarrayProductLessThanK(nums, 100));
	}
	// wrong answer ,
	public static int numSubarrayProductLessThanK(int[] nums, int k) {
	    Map<Integer, Integer> map = new HashMap<>();
	    map.put(1, 1);
	    int res = 0;
	    int sum = 1;
	    for (int i = 0; i < nums.length; i++) {
	    	sum *= nums[i];
	    	for (int key : map.keySet()) {
	    		if (k == 0) {
	    			if (key == 0) {
	    				res += map.get(key);
	    			}
	    		}
	    		else {
	    			if (sum / k < key) {
	    				res += map.get(key);
	    			}
	    		}
	    	}
	    	if (map.containsKey(sum)) {
	    		map.put(sum, map.get(sum) + 1);
	    	}
	    	else {
	    		map.put(sum, 1);
	    	}
	    }
	    return res;
	}

}
