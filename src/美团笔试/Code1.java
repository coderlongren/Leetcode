package ���ű���;

import java.util.Scanner;

/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��6��2�� ����7:53:18
* ��˵��: 
*/
public class Code1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int M = scanner.nextInt();
		int N = scanner.nextInt();
		int[][] graph = new int[M][N];
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				graph[i][j] = scanner.nextInt();
			}
		}
		boolean res = true;
		for (int num = 1; num <= 9; num++) {
			int left, right;
			int row = 0;
			boolean flag = true;
			for (int i = 0; i < M; i++) {
				boolean ff = true;
				for (int j = 0; j < N; j++) {
					if (graph[i][j] == num && flag) {
						left = j;
						for (int temp = j; temp < N; temp++) {
							if ((temp + 1) >= N || graph[i][temp + 1] != graph[i][temp]) {
								right = temp;
								row = i;
								flag = false;
								break;
							}
						}
					}
					if (graph[i][j] == num && row != i) {
						if (graph[i - 1][j] != num) {
							res = false;
							ff = false;
							break;
						}
					}
				}
				if (!ff) {
					break;
				}
			}
		}
		
		System.out.println(res);
	}

}
