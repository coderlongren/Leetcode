package 今日头条;

import java.util.Scanner;

import 位运算.abs;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年8月12日 上午9:54:09
* 类说明: 
*/
public class gg {
	public static boolean[][] flag;
	public static int[][] dir = {{0,1},{1,0},{0,-1},{-1,0},{-1,-1},{-1,1},{1,-1},{1,1}};
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String in = scanner.nextLine();
		String[] input = in.split(",");
		int M = Integer.valueOf(input[0]);
		int N = Integer.valueOf(input[1]);
		int[][] m = new int[M][N];
		for (int i = 0; i < M; i++) {
			String line = scanner.nextLine();
			String[] temp = line.split(",");
			for (int j = 0; j < N; j++) {
				m[i][j] = Integer.valueOf(temp[j]);
			}
		}
		flag = new boolean[M][N];
		int count = 0;
		int max = 0;
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				if (m[i][j] == 1 && flag[i][j] == false) {
					count++;
					max = Math.max(max, dfs(m, i, j, 0));
				}
			}
		}
		System.out.println(count + "," + max);
		
	}
	public static int dfs(int[][] matrix, int i, int j, int count) {
		int M = matrix.length;
		int N = matrix[0].length;
		flag[i][j] = true;
		count++;
		for (int[] d : dir) {
			int x = i + d[0];
			int y = j + d[1];
			if (x >= 0 && x < M && y >= 0 && y < N) {
				if (matrix[x][y] == 1 && flag[x][y] == false) {
					count += dfs(matrix, x, y, 0);
				}
			}
		}
		return count;
	}
}
