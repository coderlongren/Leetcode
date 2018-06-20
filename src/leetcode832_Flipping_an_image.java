/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��5��13�� ����10:04:58
* ��˵��: 
*/
public class leetcode832_Flipping_an_image {
	 public int[][] flipAndInvertImage(int[][] A) {
	        if (A == null || A.length == 0 || A[0].length == 0) {
	            return A;
	        }
	        for (int i = 0; i < A.length; i++) {
	            for (int j = 0; j < A[i].length/2; j++) {
	                int temp = A[i][j];
	                A[i][j] = A[i][A[i].length - j - 1];
	                A[i][A[i].length - j - 1] = temp;
	            }
	            for (int j = 0; j < A[i].length; j++) {
	                A[i][j] = (A[i][j] == 0 ? 1 : 0);
	            }
	        }
	        return A;
	    }
}
