package ����ͷ��;

import java.util.Scanner;

/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��3��24�� ����2:21:06
* ��˵��: 
*/
public class Main {
	public static void main(String[] args) {
		// |TODO Auto-generated constructor stub
				Scanner scanner = new Scanner(System.in);
				int n = scanner.nextInt();
				int[] array = new int[n];
				for (int i = 0; i < n; i++) {
					array[i] = scanner.nextInt();
				}
				int q = scanner.nextInt();
				int[] res = new int[q];
				int index = 0;
				for (int j = 0; j < q; j++) {
					int l = scanner.nextInt();
					int r = scanner.nextInt();
					int k = scanner.nextInt();
					int count = 0;
					for (int i = (l - 1); i <= (r - 1); i++) {
						if (array[i] == k) {
							count++;
						}
					}
					res[index++] = count;
				}
				
				for (int i = 0; i < q; i++) {
					System.out.println(res[i]);
				}
	}

}
