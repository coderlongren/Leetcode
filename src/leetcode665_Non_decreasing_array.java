/**
* @author 作者 : coderlong
* @version 创建时间：2018年1月16日 下午6:26:26
* 类说明: 
*/
public class leetcode665_Non_decreasing_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {3,4,2,5};
		System.out.println(checkPossibility(nums));
	}
	// 这看起来很像是 具有贪心性质的  可以分析两种局面得到答案
	public static boolean checkPossibility(int[] nums) {
	    // 1 2 3 4 5 '2' 6
		// 1 2 3 4 5 6
		int count = 0;
		for (int i = 0; i < nums.length - 1 && count <= 1; i++){
			if (nums[i] > nums[i + 1]){
				count++;
				//分两种情况
				if ((i == 0 || nums[i - 1] < nums[i + 1])){
					nums[i] = nums[i + 1];
				}
				else {
					nums[i + 1] = nums[i];
				}
			}
		}
		return count <= 1;
	 }

}
