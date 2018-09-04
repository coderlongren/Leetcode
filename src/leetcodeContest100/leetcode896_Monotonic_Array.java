package leetcodeContest100;
/**
* @author 作者 : coderlong
* @version 创建时间：2018年9月2日 上午9:31:56
* 类说明: 
*/
public class leetcode896_Monotonic_Array {
	public static void main(String[] args) {
		int[] A = {1,3,2};
		System.out.println(isMonotonic(A));
	}
	 public static boolean isMonotonic(int[] A) {
		 boolean decrea = true;
		 boolean increa = true; 
         for (int i = 0; i < A.length - 1; i++) {
             if (A[i] > A[i + 1]) {
            	 increa = false;
             }
             if (A[i] < A[i + 1]) {
            	 decrea = false;
             }
         }
         return decrea || increa;
	 }
}
