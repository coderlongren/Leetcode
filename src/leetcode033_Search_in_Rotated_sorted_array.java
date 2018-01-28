import org.w3c.dom.css.ElementCSSInlineStyle;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年1月27日 下午9:58:43
* 类说明:  什么都没有考虑，其实是可以通过二分法来实现的
*/
public class leetcode033_Search_in_Rotated_sorted_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {3,4,5,6,7,0,1,2};
		System.out.println(search1(nums, 2));
	}
	// it is a joke
	public int search(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
        	if (nums[i] == target) {
        		return i;
        	}
        }
        return -1;
    }
	// example : 0 1 2 3 4 5 6 7
	// 3 4 5 6 7 0 1 2
	public  static int search1(int[] nums, int target) {
		// 可以先用二叉搜索 找到最小的元素
		int low = 0;
		int high = nums.length - 1;
		
		while (low < high) {
			int mid = (low + high)/2;
			if (nums[mid] > nums[high]) {
				// 在前面半个 序列
				low = mid + 1;
			}
			else {
				high = mid;
			}
		}
//		return nums[low];?
		int rot = low;
		low = 0;
		high = nums.length - 1;
		
		while (low <= high) {
			int mid = (low + high)/2;
			int realMid = (mid + rot)%nums.length; // 得到了真正的二分点
			if (target < nums[realMid]) {
				high = mid - 1;
			}
			else if (target > nums[realMid]){
				low = mid + 1;
			}
			else {
				return realMid;
			}
		}
		return -1;
	}
//	public static boolean binarySearch(int[] nums, int low, int high, int target) {
//		while (low < high) {
//			int mid = low + (high - low)/2;
//			if (nums[mid] < target) {
//				
//			}
//		}
//	}

}
