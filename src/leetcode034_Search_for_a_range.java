import java.util.Arrays;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年1月31日 下午2:16:37
* 类说明: 类似二分查找，但等于目标值时需要向左向右对其相邻元素进行判断。
*/
public class leetcode034_Search_for_a_range {

	public static void main(String[] args) {
		// TODO A	uto-generated method stub
		int[] nums = {5};
		searchRange(nums, 5);
	}
	 public static int[] searchRange(int[] nums, int target) {
		 int index = binaaySearch(nums, target);
		 if (index != -1) {
			 int left = index;
			 int right = index;
			 while ( left - 1 >= 0 && nums[left - 1] == target) {
					 left--;
			 }
			 while (right + 1 < nums.length && nums[right + 1] == target) {
					 right++;
			 }
			 return new int[] {left,right};
		 }
		 else {
			 return new int[] {-1, -1};
		 }
	        
	 }
	 public static int binaaySearch(int[] nums, int target) {
		 int left = 0;
		 int right = nums.length - 1;
		 int index = -1;
		 while (left <= right) {
			 int mid = (left + right)/2;
			 if (nums[mid] == target) {
				 index = mid;
				 break;
			 }
			 else if (nums[mid] < target) {
				 left = mid + 1;
			 }
			 else {
				 right = mid - 1;
			 }
		 }
		 return index;
	 }
	 

}
