/**
* @author 作者 : coderlong
* @version 创建时间：2017年12月30日 下午8:21:08
* 类说明:  似曾相识的感觉，和最大字段和是不是差不多啊  DP
*/
public class leetcode485_Max_Consecutive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Integer.valueOf("111",2));
		int[] nums = {1,1,0,1,1,1};
		System.out.println(findMaxConsecutiveOnes(nums));
		
	}
	 public static int findMaxConsecutiveOnes(int[] nums) {
		 if (nums == null || nums.length == 0){
			 return 0;
		 }
		 int left = 0;
		 int right = 0;
		 int result = 0;
		 int count = 0;
		 for (int i = 0; i < nums.length; i++){
			 if (nums[i] == 1){
				 count++;
			 }
			 else {
				 count = 0;
			 }
			 result = Math.max(result, count);
			 
		 }
		return result;
		 
	 }

}
