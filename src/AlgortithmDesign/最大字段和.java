package AlgortithmDesign;
/**
* @author 作者 : coderlong
* @version 创建时间：2017年12月17日 下午2:30:13
* 类说明:   时间复杂度o(2)的解法  不使用 动态规划
*/
public class 最大字段和 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,1,-5,100,2,5,5,-100111};
		System.out.println(maxSum(nums));
	}
	public  static int maxSum(int[] nums){
		int sum = 0;
		for (int i = 0; i < nums.length; i++){
			int thissum = 0;
			for (int j = i; j < nums.length;j++){
				thissum += nums[j];
				sum = Math.max(sum, thissum);
			}
		}
		return sum;
	}
	
	

}
