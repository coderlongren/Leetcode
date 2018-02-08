import 位运算.max;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年2月7日 上午11:24:55
* 类说明: 
*/
public class NumMatrix {
	private int[][] dp;
	public NumMatrix(int[][] matrix) {
		if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
			return ;
		}
        int rows = matrix.length;
        int cols = matrix[0].length;
        dp = new int[rows + 1][cols + 1];
        dp[0][0] = matrix[0][0];
//        for (int i = 1; i < rows; i++) {
//        	dp[i][0] = matrix[i][0] + dp[i - 1][0];
//        }
//        for (int i = 1; i < cols; i++) {
//        	dp[0][i] = matrix[0][i] + dp[0][i - 1];
//        }
        
        for (int i = 1; i <= rows; i++) {
        	for (int j = 1; j <= cols; j++) {
        		dp[i][j] = dp[i - 1][j] + dp[i][j - 1] - dp[i - 1][j - 1] + matrix[i - 1][j - 1];
        	}
        }
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
    	
		return dp[row2 + 1][col2 + 1] - dp[row2 + 1][col1] - dp[row1][col2 + 1] + dp[row1][col1];
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = {
		                {3, 0, 1, 4, 2},
		                {5, 6, 3, 2, 1},
		                {1, 2, 0, 1, 5},
		                {4, 1, 0, 1, 7},
		                {1, 0, 3, 0, 5}
		};
		NumMatrix matrix2 = new NumMatrix(matrix);
		System.out.println(matrix2.sumRegion(1,2,2,4));
	}

}
