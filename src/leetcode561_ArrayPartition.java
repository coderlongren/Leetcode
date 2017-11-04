import java.util.Arrays;


public class leetcode561_ArrayPartition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]  nums = {1,3,2,4,6,5};
		System.out.println(arrayPairSum(nums));
	}
	public static int arrayPairSum(int[] nums) {
		//Êı×éÉıĞòÅÅÁĞ
		Arrays.sort(nums);
		int sum = 0;
		for (int i = 0; i < nums.length; i = i+2){
			sum += nums[i];
		}
		
		return sum;
		
	 }
	

}
