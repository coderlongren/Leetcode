package DP;
/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��1��12�� ����10:23:29
* ��˵��: 
*/
public class ����ֶκ� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {-1,-2,5,6,-20,100};
		System.out.println(maxSum(nums));
	}
	public static int maxSum(int[] nums){
		int sum = 0;
		int b = 0;
		for (int i = 0; i < nums.length; i++){
			if (b > 0){
				b += nums[i];
			}
			else {
				b = nums[i];
			}
			if (b > sum){
				sum  = b;
			}
		}
		return sum;
	}

}
