import java.util.Arrays;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年5月8日 下午10:44:32
* 类说明: 
*/
public class leetcode004_Median_od_Sorted_arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1 = {1,3};
		int[] nums2 = {2};
		System.out.println(findMedianSortedArrays2(nums1, nums2));
	}
	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int[] num = new int[nums1.length + nums2.length];
		if (nums1.length == 0 && nums2.length == 0) {
			return 0;
		}
		else if (nums1.length == 0) {
			System.arraycopy(nums2, 0, num, 0, nums2.length);
		}
		else if (nums2.length == 0) {
			System.arraycopy(nums1, 0, num, 0, nums1.length);
		}
		else {
			System.arraycopy(nums1, 0, num, 0, nums1.length);
			System.arraycopy(nums2, 0, num, nums1.length, nums2.length);
		}
		Arrays.sort(num);
		if (num.length % 2 == 1) {
			return num[num.length/2];
		} 
		else {
			return (num[num.length/2 - 1] + num[num.length/2])/2.0;
		}
    }
	// O(m + n)算法， 需要 空间复杂度 X(m + n)
	public static double findMedianSortedArrays2(int[] nums1, int[] nums2) {
		int len = nums1.length + nums2.length;
		int[] num = new int[nums1.length + nums2.length];
		int i = 0;
		int j = 0;
		int k = 0;
		while (i < nums1.length || j < nums2.length) {
			if (i >= nums1.length) {
				while (j < nums2.length) {
					num[k++] = nums2[j++];
				}
			}
			else if (j >= nums2.length) {
				while (i < nums1.length) {
					num[k++] = nums1[i++];
				}
			}
			else {
				if (nums1[i] == nums2[j]) {
					num[k++] = nums1[i++];
					num[k++] = nums2[j++];
				}
				else if (nums1[i] < nums2[j]) {
					num[k++] = nums1[i++];
				}
				else {
					num[k++] = nums2[j++];
				}
			}
		}
		if (num.length % 2 == 1) {
			return num[num.length/2];
		} 
		else {
			return (num[num.length/2 - 1] + num[num.length/2])/2.0;
		}
	}

}
