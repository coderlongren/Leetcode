package leetcodeContest100;
/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��9��2�� ����9:31:56
* ��˵��: 
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
