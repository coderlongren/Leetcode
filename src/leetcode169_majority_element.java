import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class leetcode169_majority_element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {3,2,3};
		System.out.println(majorityElement(array));
	}
	public static int majorityElement(int[] nums) {
        int len = nums.length;
        int sum = 0;
        Map<Integer, Integer>  map = new HashMap<Integer, Integer>();
        for (int i = 0; i < len;i++){
        	if (!map.containsKey(nums[i])){
        		map.put(nums[i], 1);
        	}
        	else {
        		map.put(nums[i], map.get(nums[i]) + 1);
        	}
        }
        Iterator iterator = map.keySet().iterator();
        while (iterator.hasNext()){
        	int s = (Integer)iterator.next();
        	int temp = map.get(s);
        	if (temp > len/2){
        		sum += s;
        	}
        }
        return sum;
		
    }

}
