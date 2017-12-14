import java.net.Inet4Address;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
* @author 作者 : coderlong
* @version 创建时间：2017年12月13日 下午2:58:23
* 类说明: 2个数组的 交叉元素 使用二叉搜索
*/
public class leetcode349_intersection_of_two_array3 {

	public static void main(String[] args) {
		int[] nums = {1,2,3,4,5};
		System.out.println(binarySearch(nums, 6));
	}
	public static int[] intersection(int[] num1,int[] num2){
		Set<Integer> set = new HashSet<>();
		Arrays.sort(num1);
		Arrays.sort(num2);
		for(int i : num1){
			if (binarySearch(num2, i)){
				set.add(i);
			}
		}
		int[] result = new int[set.size()];
		int i = 0;
		Iterator<Integer> iterator = set.iterator();
		while (iterator.hasNext()){
			result[i++] = iterator.next();
		}
		return result;
		
	}
	public static boolean binarySearch(int[] nums,int target){
		int left = 0;
		int right = nums.length - 1;
		int mid = (left + right)/2; 
		while (left <= right){
			if (nums[mid] == target){
				return true;
			}
			else if (nums[mid] < target) {
				left = mid + 1;
			}else{
				right = mid - 1; 
			}
			mid = (left + right)/2;
		}
		return false;
	}

}
