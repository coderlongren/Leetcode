package class3;

public class leetcode048_Roate_Image {
	 public void rotate(int[][] matrix) {
		 // 旋转两次，分为逆时针，或者顺时针
		 // 本题目是 顺时针 90度
		 // 第一次
		 /**1 2 3    7 8 9    7 4 1
		  * 4 5 6 -->4 5 6 -->8 5 2 
		  * 7 8 9    1 2 3    9 6 3
		  */
		 if (matrix == null || matrix.length != matrix[0].length) {
			 return;
		 }
		 // 第一轮交换
		 for (int i = 0; i < matrix.length/2; i++) {
			 int[] temp = matrix[i];
			 matrix[i] = matrix[matrix.length - 1 - i];
			 matrix[matrix.length - 1 - i] = temp;
		 }
		 // 第二轮交换
		 for (int i = 0; i < matrix.length; i++) {
			 for (int j = i + 1; j < matrix[i].length; j++) {
				 int temp = matrix[i][j];
				 matrix[i][j] = matrix[j][i];
				 matrix[j][i] = temp;
			 }
		 }
		 
	 }
}
