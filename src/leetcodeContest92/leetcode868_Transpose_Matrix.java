package leetcodeContest92;
/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��7��8�� ����11:45:53
* ��˵��: 
*/
public class leetcode868_Transpose_Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] A = {{1, 2, 3}, {4, 5, 6}};
		transpose(A);
	}
	public static int[][] transpose(int[][] A) {
        if (A == null || A.length == 0) {
        	return A;
        }
        int[][] B = new int[A[0].length][A.length];
        for (int i = 0; i < A.length; i++) {
        	for (int j = 0; j < A[0].length; j++) {
        		B[j][i] = A[i][j];
        	}
        }
        return B;
    }

}
