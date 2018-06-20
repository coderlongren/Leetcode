/**
* @author 作者 : coderlong
* @version 创建时间：2018年5月24日 下午1:05:19
* 类说明: 
*/
public class leetcode238_Product_of_Array_Exceld_self {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,3,4};
		System.out.println(productExceptSelf2(nums));
	}
	 public int[] productExceptSelf(int[] nums) {
		 int mul = 1;
		 int zeroCount = 0;
		 for (int i = 0; i < nums.length; i++) {
			 if (nums[i] == 0) {
				 zeroCount++;
			 }
			 if (nums[i] != 0) {
				 mul *= nums[i];
			 }
		 }
		 if (zeroCount == 0) { // 没有0 的时候， 每个数都用 mul/self就行了
			 for (int i = 0; i < nums.length; i++) {
				 nums[i] = mul/nums[i];
			 }
		 }
		 else if (zeroCount == 1) {
			 for (int i = 0; i < nums.length; i++) {
				 if (nums[i] != 0) {
					 nums[i] = 0;
				 }
				 else {
					 nums[i] = mul;
				 }
			 }
		 }
		 else {
			 for (int i = 0; i < nums.length; i++) {
				 nums[i] = 0;
			 }
		 }

		 return nums;
	 }
	 public static int[] productExceptSelf2(int[] nums) {
		 int[] left = new int[nums.length];
		 left[0] = 1;
		 int[] right = new int[nums.length];
		 right[nums.length - 1] = 1;
		 for (int i = 1; i < nums.length; i++) {
			 left[i] = nums[i - 1]*left[i - 1];
		 }
		 for (int i = nums.length - 2; i >= 0; i--) {
			 right[i] = nums[i + 1]*right[i + 1];
		 }
		 int[] res = new int[nums.length];
		 for (int i = 0; i < nums.length; i++) {
			 if (i == 0) {
				 res[i] = right[i];
			 }
			 else if (i == nums.length - 1) {
				 res[i] = left[i];
			 }
			 else {
				 res[i] = left[i]*right[i];
			 }
		 }
		 return res;
		 
	 }

}
