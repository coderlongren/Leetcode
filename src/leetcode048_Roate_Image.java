
public class leetcode048_Roate_Image {
	 public void rotate(int[][] matrix) {
		 /**1 2 3    7 8 9    7 4 1
		  * 4 5 6 -->4 5 6 -->8 5 2 
		  * 7 8 9    1 2 3    9 6 3
		  */
		 if (matrix == null || matrix.length != matrix[0].length) {
			 return;
		 }

		 for (int i = 0; i < matrix.length/2; i++) {
			 int[] temp = matrix[i];
			 matrix[i] = matrix[matrix.length - 1 - i];
			 matrix[matrix.length - 1 - i] = temp;
		 }
		 for (int i = 0; i < matrix.length; i++) {
			 for (int j = i + 1; j < matrix[i].length; j++) {
				 int temp = matrix[i][j];
				 matrix[i][j] = matrix[j][i];
				 matrix[j][i] = temp;
			 }
		 }
		 
	 }
}
