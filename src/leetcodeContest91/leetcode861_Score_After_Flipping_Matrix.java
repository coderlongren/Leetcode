package leetcodeContest91;
/**
* @author 作者 : coderlong
* @version 创建时间：2018年7月2日 下午7:50:20
* 类说明: 
*/
public class leetcode861_Score_After_Flipping_Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Integer.valueOf("11", 2));
	}
	 public int matrixScore(int[][] A) {
		 int res = 0;
		 for (int i = 0; i < A.length; i++) {
			 if (A[i][0] == 0) {
				 for (int j = 0; j < A[0].length; j++) {
					 A[i][j] = 1 - A[i][j]; // 位反转
				 }
			 }
		 }
		 for (int j = 0; j < A[0].length; j++) {
			 int count_zero = 0;
			 int count_one = 0;
			 for (int i = 0; i < A.length; i++) {
				 if (A[i][j] == 0) {
					 count_zero++;
				 }
				 else {
					 count_one++;
				 }
			 }
			 if (count_zero > count_one) {
				 for (int i = 0; i < A.length; i++) {
					 A[i][j] = 1 - A[i][j];
				 }
			 }
			 
		 }
		 for (int i = 0; i < A.length; i++) {
			 StringBuffer buffer = new StringBuffer();
			 for (int j = 0; j < A[0].length; j++) {
				 buffer.append(A[i][j] + "");
			 }
			 res += Integer.valueOf(buffer.toString(), 2);
		 }
		 
		 return res;
	 }

}
