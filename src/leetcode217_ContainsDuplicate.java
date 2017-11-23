import java.util.HashMap;
import java.util.Map;

public class leetcode217_ContainsDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {3,3};
		System.out.println(containsDuplicate(nums));
	}
	public static boolean containsDuplicate(int[] nums) {
        if (nums == null || nums.length == 0 || nums.length == 1){
        	return false;
        }
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++){
        	if (!map.containsKey(nums[i])){
        		map.put(nums[i], 1);
        	}
        	else {
        		map.put(nums[i], map.get(nums[i]) + 1);
        	}
        }
        for (int i:map.values()){
        	if (i > 1){
        		return true;
        	}
        }
        return false;
        
    }

}
