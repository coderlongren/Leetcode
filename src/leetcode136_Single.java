
public class leetcode136_Single {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(1^1);
		System.out.println(0^1);
	}
	// use bitwise XOR to solve this problem 
	 public int singleNumber(int[] nums) {
		 int ans = 0;
		 for (int i = 0; i < nums.length; i++){
			 ans ^= nums[i];
		 }
		 
		return ans;
		 
	 }
	
	
}
