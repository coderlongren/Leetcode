
public class  leetcode027_Remove_Element{

	public static void main(String[] args) {
		int[] nums = {1,2,2,2,3,3,2};
		System.out.println(removeElement(nums, 2));
	}
	
    public static int removeElement(int[] nums, int val) {
    	
    	if (nums == null){
    		return 0;
    	}
    	int i = 0;
    	for (int j = 0; j< nums.length; j++){
    		if (nums[j] != val){
    			nums[i] = nums[j];
    			i++;
    		}
    	}
        return i;
    }

}
