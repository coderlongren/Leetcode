/**
* @author 作者 : coderlong
* @version 创建时间：2017年12月12日 下午8:02:39
* 类说明: 
*/
public class leetcode283_Move_zeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {0,1,0,3,12};
		moveZeroes(nums);
		for (int i : nums) {
			System.out.print(i + " ");
		}
	}
	 public static void moveZeroes(int[] nums) {
		 if (nums.length > 0){

			 int index = 0;
			 for (int i = 0; i < nums.length; i++){
				 if (nums[i] != 0){
					 nums[index++] = nums[i];
				 }
			 }
			 while (index < nums.length){
				 nums[index++] = 0;
				 
			 }
			 
		 }
	 }

}
