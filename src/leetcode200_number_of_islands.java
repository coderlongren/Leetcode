/**
* @author 作者 : coderlong
* @version 创建时间：2018年4月18日 下午5:00:54
* 类说明:  一次AC的题目
*/
public class leetcode200_number_of_islands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int numIslands(char[][] grid) {
		int count = 0;
		int rows = grid.length; 
		if (rows == 0) {
			return count;
		}
		int cols = grid[0].length;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if (grid[i][j] == '1') {
					dfs(grid, i, j, rows, cols);
					count++;
				}
			}
		}
		return count;
	}
	public static void dfs(char[][] grid, int x, int y, int rows, int cols) {
		if (x < 0 || y < 0 || x >= rows || y >= cols) {
			return;
		}
		if (grid[x][y] == '0') {
			return;
		}
		grid[x][y] = '0';
		dfs(grid, x + 1, y, rows, cols);
		dfs(grid, x - 1, y, rows, cols);
		dfs(grid, x, y + 1, rows, cols);
		dfs(grid, x, y - 1, rows, cols);
		
	}

}
