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
		int[] numss = {0,0,0,1,0};
		System.out.println(search2(numss, 3));
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
	// 就是寻找扰乱部分
public static int search2(int[] nums, int target) {
    int low = 0, high = nums.length - 1;
    while (low <= high) {
        int mid = low + (high - low) / 2;
        if (nums[mid] == target) {
            return mid;
        }
        // 后半部分是有序的
        if (nums[mid] < nums[high]) {
        	// target 在这个有序范围之内
            if (nums[mid] < target && target <= nums[high]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
            
        }
        // 前半部分不是有序的
        else {
        	// target 在前半部分 （里面的） 有序范围之后， 因为前半部分的前半部分是有序的
            if (nums[low] <= target && target < nums[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
    }
    return -1;
}
// 处理duplicate元素
public static boolean search3(int[] nums, int target) {
    int low = 0, high = nums.length - 1;
    while (low <= high) {
        int mid = low + (high - low) / 2;
        if (nums[mid] == target) {
            return true;
        }
        if (nums[mid] < nums[high]) { // 后半部分是有序的
            if (nums[mid] < target && target <= nums[high]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        } 
        else if (nums[mid] > nums[high]) {// First half may be sorted eg.[0,1,4,5,0] or all the same eg.[4,4,4,5,0]
            if (nums[low] <= target && target < nums[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        // 华丽的 地方，
        else {   // A[mid] = A[high] and A[mid]<>target, so it's safe to shrink from high bound
            high--;
        }
    }
    return false;
}
}
