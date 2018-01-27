/**
* @author 作者 : coderlong
* @version 创建时间：2018年1月27日 下午9:58:43
* 类说明:  什么都没有考虑，其实是可以通过二分法来实现的
*/
public class leetcode033_Search_in_Rotated_sorted_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int search(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
        	if (nums[i] == target) {
        		return i;
        	}
        }
        return -1;
    }

}
