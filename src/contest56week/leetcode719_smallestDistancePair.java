package contest56week;

import java.util.Arrays;

public class leetcode719_smallestDistancePair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,3,1};
		int k = 2;
		System.out.println(smallestDistancePair(nums, k));
	}
	
	public static int smallestDistancePair(int[] nums, int k) {
        
		int n = nums.length;
		Arrays.sort(nums);
		
		//最小的绝对距离 
		int low = nums[1] - nums[0];
		for (int i = 1; i <nums.length - 1;i++){
			low = Math.min(low, nums[i + 1] - nums[i]);
		}
		//最大的绝对距离 
		int high = nums[nums.length - 1] - nums[0];
		for (int i = 1; i < nums.length - 1; i++){
			high = Math.max(high, nums[i + 1] - nums[i]);
		}
		//二分搜索 第k个 绝对距离
		while (low < high) {
			int mid = (low + high)/2 + low;
			
			// 绝对距离 <mid 的距离数 < k 在mid + 1 ~ max之间查找  否则在min ~ mid之间查找
			if (countPairs(nums, mid)  < k){
				low = mid + 1;
			}
			else {
				high = mid;
			}
		}
		return 0;
    }
	//返回 距离小于等于 mid的   对数
	public static int countPairs(int[] a, int mid){
		
		int result = 0;
		for (int i = 0; i < a.length; i++){
			int j = i;
			while (j < a.length && a[j] - a[i] <= mid){
				j++;
			}
			result = result + j - i - 1;
		}
		
		return result;
	}

}
