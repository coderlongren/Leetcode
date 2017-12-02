
public class leetcode189_rotate_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {-1};
		for (int i : nums){
			System.out.print(i + " ");
		}
		rotate(nums, 5);
		for (int i : nums){
			System.out.print(i + " ");
		}
	}
	public static void rotate(int[] nums, int k) {
		int len = nums.length;
		if (k > len){
			return;
		}
		int start = 0;
		int end = len - 1;
		while (start < end){
			int temp = nums[start];
			nums[start] = nums[end];
			nums[end] = temp;
			start++;
			end--;
		}
		start = 0;
		end = k - 1;
		while (start < end){
			int temp = nums[start];
			nums[start] = nums[end];
			nums[end] = temp;
			start++;
			end--;
		}
		start = k;
		end = len - 1;
		while (start < end){
			int temp = nums[start];
			nums[start] = nums[end];
			nums[end] = temp;
			start++;
			end--;
		}
		
		
	}
}
