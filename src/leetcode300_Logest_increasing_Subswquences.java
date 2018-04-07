import java.util.Arrays;
/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��4��4�� ����10:21:41
* ��˵��: 
*/
public class leetcode300_Logest_increasing_Subswquences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {10, 9, 2, 5, 3, 7, 101, 18};
		
		System.out.println(lengthOfLIS3(nums));
	}
	// ���ֻ�ǣ��������ĵ��������У������DP�������Ϳ������
	public static int lengthOfLIS(int[] nums) {
		if (nums == null || nums.length == 0) {
			return 0;
		}
		if (nums.length == 1) {
			return 1;
		}
		int[] dp = new int[nums.length  + 1];
		dp[0] = 1;
		int res = Integer.MIN_VALUE;
		for (int i = 1; i < nums.length; i++) {
			dp[i] = nums[i] > nums[i - 1] ? dp[i - 1] + 1 : 1;
			res = Math.max(res, dp[i]);
		}
		return res;
	 }
	// �������ĵ���������
	public static int lengthOfLIS2(int[] nums) {
		if (nums == null || nums.length == 0) {
			return 0;
		}
		if (nums.length == 1) {
			return 1;
		}
		int[] dp = new int[nums.length  + 1];
		dp[0] = 1;
		int res = Integer.MIN_VALUE;
		for (int i = 1; i < nums.length; i++) {
			int temp = Integer.MIN_VALUE;
			for (int j = 0; j < i; j++) {
				if (nums[i] > nums[j]) {
					temp = Math.max(temp, dp[j]);
				}
			}
			dp[i] = temp == Integer.MIN_VALUE ? 1 : temp + 1;
			res = Math.max(res, dp[i]);
		}
		return res;
    }
	// Binary Search  O(nlogn) time 
	public static int lengthOfLIS3(int[] nums) {
		int[] dp = new int[nums.length];
		int size = 0;
		dp[0] = nums[0];
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] < dp[0]) {
				dp[0] = nums[i];
			}
			else if (nums[i] >= dp[size]) {
				size++;
				dp[size] = nums[i];
			}
			// ���м�Ļ�����ʹ�ö�������
			else {
				dp[binarySearch(dp, 0, size, nums[i])] = nums[i];
			}
		}
		return size;
	}
	 public static int binarySearch(int[] tails, int min, int max, int target){
	        while(min <= max){
	            int mid = min + (max - min) / 2;
	            if(tails[mid] == target){
	                return mid;
	            }
	            if(tails[mid] < target){
	                min = mid + 1;
	            }
	            if(tails[mid] > target){
	                max = mid - 1;
	            }
	        }
	        return min;
	    }

}
