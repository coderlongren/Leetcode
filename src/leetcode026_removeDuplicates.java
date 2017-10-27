import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;


public class leetcode026_removeDuplicates {

	public static void main(String[] args) {
		int[] nums = {1,2,2,5,6,8};// expect result is 4
		System.out.println(removeDuplicates(nums));
	}
    public static int removeDuplicates(int[] nums) {
    	/* 这种方法 太过扯淡 直接用set的特性了  当然 没有AC
    	Set<Integer> Set = new TreeSet<Integer>();
    	for (int i = 0; i < nums.length; i++){
    		Set.add(nums[i]);
    	}
        return Set.size();
        */
    	if (nums.length == 0){
    		return 0;
    	}
    	if (nums.length == 1){
    		return 1;
    	}
    	int i = 0;
    	for (int j = 1; j < nums.length; j++){
    		if (nums[j] != nums[i]){
    			i++;
    			nums[i] = nums[j];
    		}
    	}
    	return i + 1;
    }

}
