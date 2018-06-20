/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��6��4�� ����1:56:17
* ��˵��: 
*/
public class leetcode059_spiral_matrix2 {
	public static int num = 1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		generateMatrix(3);
	}
	public static int[][] generateMatrix(int n) {
		int[][] res = new int[n][n];
		if (n < 1) {
			return res;
		}
		int left = 0;
		int right = n - 1;
		int top = 0;
		int bottom = n - 1;
		while (true) {
			for (int i = left; i <= right; i++) {
				res[top][i] = num++;
			}
			top++;
			if (left > right || top > bottom) {
				break;
			}
			for (int i = top; i <= bottom; i++) {
				res[i][right] = num++;
			}
			right--;
			if (left > right || top > bottom) {
				break;
			}
			for (int i = right; i >= left; i--) {
				res[bottom][i] = num++;
			}
			bottom--;
			if (left > right || top > bottom) {
				break;
			}
			for (int i = bottom; i >= top; i--) {
				res[i][left] = num++;
			}
			left++;
			if (left > right || top > bottom) {
				break;
			}
		}
		return res;
	}

}
