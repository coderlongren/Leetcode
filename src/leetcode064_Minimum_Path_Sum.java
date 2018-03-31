/**
* @author 作者 : coderlong
* @version 创建时间：2018年3月30日 下午8:47:25
* 类说明: 
*/
public class leetcode064_Minimum_Path_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] grid = {{1,3,1}, {1,5,1}, {4,2,1}};
		System.out.println(minPathSum2(grid));
	}
	public static int minPathSum(int[][] grid) {
		if (grid == null || grid.length == 0) {
			return 0;
		}
		return  minPath(grid, grid.length - 1, grid[0].length - 1);
	}
	// 栈溢出， 需要另辟蹊径
	public static int minPath (int[][] grid, int x, int y) {
		if ((x - 1) >= 0 && (y - 1) >= 0) {
			return grid[x][y] + Math.min(minPath(grid, x - 1, y), minPath(grid, x, y - 1));
		}
		else if ((x - 1) >= 0) {
			return grid[x][y] + minPath(grid, x - 1, y);
		}
		else if ((y - 1) >= 0){
			return grid[x][y] + minPath(grid, x, y - 1);
		}
		else {
			return grid[x][y];
		}
	}
	// 这种使用一个数组来保存结果 已经可以AC了,但是事情并没有这么简单
	public static int minPathSum2(int[][] grid) {
		if (grid == null || grid.length == 0) {
			return 0;
		}
		int m = grid.length;
		int n = grid[0].length;
		int[][] dp = new int[m][n];
		dp[0][0] = grid[0][0];
		// 第一列DP赋值
		for (int i = 1; i < m; i++) {
			dp[i][0] = dp[i - 1][0] + grid[i][0];
		}
		// 第一行DP赋值
		for (int i = 1; i < n; i++) {
			dp[0][i] = dp[0][i - 1] + grid[0][i];
		}
		for (int i = 1; i < m; i++) {
			for (int j = 1; j < n; j++) {
				dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - 1]) + grid[i][j];
			}
		}
		return dp[m - 1][n - 1];
		
	}

}
