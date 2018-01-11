/**
* @author 作者 : coderlong
* @version 创建时间：2018年1月11日 下午7:37:03
* 类说明: 
*/
public class leetcode591_Shortest_unsorted_ContinuousSubarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {2, 6, 4, 8, 10, 9, 15};
		System.out.println(findUnsortedSubarray1(A));
	}
	public static int findUnsortedSubarray1(int[] A) {
	    int n = A.length, beg = -1, end = -2, min = A[n-1], max = A[0];
	    for (int i=1;i<n;i++) {
	      max = Math.max(max, A[i]);
	      min = Math.min(min, A[n-1-i]);
	      if (A[i] < max) end = i;
	      if (A[n-1-i] > min) beg = n-1-i; 
	    }
	    return end - beg + 1;
	}

}
