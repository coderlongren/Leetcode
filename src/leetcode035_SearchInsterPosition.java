
public class leetcode035_SearchInsterPosition {
/***Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You may assume no duplicates in the array.

Here are few examples.
[1,3,5,6], 5 ¡ú 2
[1,3,5,6], 2 ¡ú 1
[1,3,5,6], 7 ¡ú 4
[1,3,5,6], 0 ¡ú 0 
 * 
 * @param args
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
    public static int searchInsert(int[] nums, int target) {
    	if (target <= nums[0]){
    		return 0;
    	}
    	int i;
    	for (i= 0; i < nums.length - 1; i++){
    		if (target == nums[i]){
    			return i;
    		}
    		else if(target < nums[i + 1]){
				return i+1;
			}
    	}
    	if (target == nums[i]){
    		return i;
    	}
    	else {
			return i + 1;
		}

        
    }
}
