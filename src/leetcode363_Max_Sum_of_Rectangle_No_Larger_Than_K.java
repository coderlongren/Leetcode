/**
* @author 作者 : coderlong
* @version 创建时间：2018年2月7日 下午8:24:01
* 类说明: 
*/
public class leetcode363_Max_Sum_of_Rectangle_No_Larger_Than_K {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = {{5,-4,-3,4},
						  {-3,-4,4,5},
						  {5,1,5,-4}};
		System.out.println(maxSumSubmatrix(matrix, 10));
//		int a = 2;
//		for (int i = a; i < 3; i++) {
//			System.out.println("sfsdf");
//		}
		
	}
	public static int maxSumSubmatrix(int[][] matrix, int k) {
		if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
			return -1;
		}
		// DP数组保存的是右下角和左上角之间区域的和
        int[][] dp = new int[matrix.length + 1][matrix[0].length + 1];
//        dp[0][0] = matrix[0][0];
        for (int i = 1; i <= matrix.length; i++) {
        	for (int j = 1; j <= matrix[0].length; j++) {
        		dp[i][j] = dp[i - 1][j] + dp[i][j - 1] - dp[i - 1][j - 1] + matrix[i - 1][j - 1];
        	}
        }
        int res = Integer.MIN_VALUE;
        // 这里O(n^4)应该是可以改善的，，，，，，，,暂时还没注意。
        for (int i = 1; i <= matrix.length; i++) {
        	for (int j = 1; j <= matrix[0].length; j++) {
        		for (int h = i; h <= matrix.length; h++) {
        			for (int s = j; s <= matrix[0].length; s++) {
        				if (sumRegion(i, j, h, s, dp) == k) {
        					return k;
        				}
        				if (sumRegion(i, j, h, s, dp) < k) {
        					res = Math.max(res, sumRegion(i, j, h, s, dp));
        				}
        			}
        		}
        	}
        }
        // 没有得到小于k的res
        if (res == Integer.MIN_VALUE) {
        	return -1;
        }
        return res;
 }
 // 求区域和的函数
 public static int sumRegion(int row1, int col1, int row2, int col2, int[][] dp) {
    	
		return dp[row2][col2] - dp[row2][col1 - 1] - dp[row1 - 1][col2] + dp[row1 - 1][col1 - 1];
        
 }
}
