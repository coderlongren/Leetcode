import java.util.Arrays;

/**
* @author 作者 : coderlong
* @version 创建时间：2017年12月11日 下午10:05:02
* 类说明: 
*/
public class leetcode268_find_the_missing_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public int missingNumber(int[] nums) {
		 if (nums == null || nums.length == 0 ){
			 return 0;
		 }
		 if (nums.length == 1){
			 if (nums[0] == 0){
				 return nums[0]  + 1;
			 }
			 else {
				 return nums[0] - 1;
			 }
		 }
		 Arrays.sort(nums);
		 int min = nums[0];
		 for (int i = 1; i < nums.length; i++){
			 if (nums[i] != min + 1){
				 return nums[i] - 1;
			 }
			 min = nums[i];
		 }
		 return 0;
	 }

}
