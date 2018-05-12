import java.util.Arrays;

import javax.xml.transform.Templates;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年5月8日 上午9:04:14
* 类说明: 
*/
public class leetcode576_Out_of_Boundry_paths {
	public static int[][] dics = {{0,1}, {0,-1}, {1,0}, {-1,0}};
	public static int mod = (int)Math.pow(10, 9) + 7;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(findPaths(1, 3, 3, 0, 1));
	}
	public static int findPaths(int m, int n, int N, int i, int j) {
		int start = 0;
		int[][][] memory = new int[m][n][N + 1];
		for (int[][] mem : memory) {
			for (int[] mem2 : mem) {
				Arrays.fill(mem2, -1);
			}
		}

		return dfs(m, n,N, i, j,memory) % mod;
	}
	public static int dfs(int m, int n, int N, int i, int j, int[][][] memory) {
		if ((i < 0 || i >= m || j < 0 || j >= n)) {
			return 1;
		}
		if (N == 0) {
			return 0;
		}
		if (memory[i][j][N] != -1) {
			return memory[i][j][N];
		}
		memory[i][j][N] = 0;
		for (int[] dic : dics) {
			int x = i + dic[0];
			int y = j + dic[1];
			int temp = dfs(m, n, N - 1, x, y,memory) % mod;
			memory[i][j][N] = (memory[i][j][N] + temp)%mod;
		}
		return memory[i][j][N];
	}

}
