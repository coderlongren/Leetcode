import java.util.Arrays;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年4月30日 下午10:09:13
* 类说明:  这是 01 矩阵的搜索问题
*/
public class leetcode542_Matrix01 {
	public static int[][] dics = {{0,-1},{0,1},{1,0},{-1,0}};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = {{1, 0, 1, 1, 0, 0, 1, 0, 0, 1}, 
						  {0, 1, 1, 0, 1, 0, 1, 0, 1, 1},
						  {0, 0, 1, 0, 1, 0, 0, 1, 0, 0}, 
						  {1, 0, 1, 0, 1, 1, 1, 1, 1, 1}, 
						  {0, 1, 0, 1, 1, 0, 0, 0, 0, 1}, 
						  {0, 0, 1, 0, 1, 1, 1, 0, 1, 0}, 
						  {0, 1, 0, 1, 0, 1, 0, 0, 1, 1}, 
						  {1, 0, 0, 0, 1, 1, 1, 1, 0, 1}, 
						  {1, 1, 1, 1, 1, 1, 1, 0, 1, 0}, 
						  {1, 1, 1, 1, 0, 1, 0, 0, 1, 1}};
		updateMatrix(matrix);
		
	}
	public static int[][] updateMatrix(int[][] matrix) {
		if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
			return  new int[][]{};
		}
		int rows = matrix.length;
		int cols = matrix[0].length;
		int[][] res = new int[rows][cols];
		boolean[][] visited = new boolean[rows][cols];
		for (int[] temp : res) {
			Arrays.fill(temp, Integer.MIN_VALUE);
		}
		
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if(matrix[i][j] == 0) {
					res[i][j] = 0;
				}
			}
		}
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				dfs(matrix, i, j, res,visited);
			}
		}
		return res;
		
	}
	public static int dfs(int[][] matrix, int x ,int y, int[][] res, boolean[][] visit) {
		int rows = matrix.length;
		int cols = matrix[0].length;
			if (matrix[x][y] == 0) {
				return res[x][y];
			}
			else { /// matrix[x][y] == 1 的情况
				if (visit[x][y] && res[x][y] == Integer.MIN_VALUE) {
					return Integer.MAX_VALUE;
				}
				visit[x][y] = true;
				int min = Integer.MAX_VALUE;
				for (int[] dic : dics) {
					int x1 = x + dic[0];
					int y1 = y + dic[1];
					if (x1 >= 0 && x1 < rows && y1 >= 0 && y1 < cols) {
						min = Math.min(min, dfs(matrix, x1, y1, res, visit));
					}
				}
				res[x][y] = 1 + min;
				return res[x][y];
			}
			
		}
	}
