package leetcodeContest72;
/**
* @author 作者 : coderlong
* @version 创建时间：2018年6月3日 上午9:44:54
* 类说明: 
*/
public class leetcode845_Longest_Mountain_in_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {0,1,0};
		System.out.println(longestMountain(A));
	}
	public static int longestMountain(int[] A) {
		int max = 0;
		if (A == null || A.length < 3) {
			return max;
		}
		for (int i = 0; i < A.length; i++) {
			int left = 0;
			int right = 0;
			int tempMax = 0;
			for (int l = i - 1; l >=0; l--) {
				if (A[l] < A[l + 1]) {
					left++;
				}
				else {
					break;
				}
			}
			for (int r = i + 1; r < A.length; r++) {
				if (A[r] < A[r - 1]) {
					right++;
				}
				else {
					break;
				}
			}
			if (left != 0 && right != 0) {
				tempMax = left + right + 1;
				max = Math.max(max, tempMax);
			}
		}
		return max;
    }

}
