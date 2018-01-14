/**
* @author 作者 : coderlong
* @version 创建时间：2018年1月13日 下午9:45:06
* 类说明: 
*/
public class leetcode643_Maximun_average_subarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,12,-5,-6,50,3};
		int k = 4;
		System.out.println(findMaxAverage(nums, k));
	}
	public static double findMaxAverage(int[] nums, int k) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i <= nums.length - k; i++){
        	int sum = 0;
        	for (int j = i; j < i + k; j++){
        		sum += nums[j];
        	}
        	max = Math.max(max, sum);
        }
        return (double)max/(k + 0.0);
    }

}
