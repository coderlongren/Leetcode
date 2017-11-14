
public class leetcode724_Find_Pivod_Index {

	public static void main(String[] args) {
		
		
	}
	public static int pivotIndex(int[] nums) {
        int len = nums.length;
        for (int i = 0; i < len; i++){
        	if (i == 0){
        		int sum = 0;
        		for (int j = i + 1; j < len; j++){
        			sum += nums[j];
        		}
        		if (sum == 0){
        			return i;
        		}
        	}
        	if (i == len - 1){
        		int sum = 0;
        		for (int j = 0; j < i;j++){
        			sum += nums[j];
        		}
        		if (sum == 0){
        			return i;
        		}
        	}
        	int left = 0;
        	int right = 0;
        	for (int j = 0; j < i;j++){
        		left += nums[j];
        	}
        	for (int j = i + 1; j < len;j++){
        		right += nums[j];
        	}
        	if (left == right){
        		return i;
        	}
        }
        return -1;
    }

}
