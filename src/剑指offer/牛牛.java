package ��ָoffer;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��8��11�� ����4:06:18
* ��˵��: 
*/
public class ţţ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = scanner.nextInt();
		}
		int m = scanner.nextInt();
		int[] q = new int[m];
		for (int i = 0; i < m; i++) {
			q[i] = scanner.nextInt();
		}
		int[] pre = new int[n];
		pre[0] = a[0];
		for (int i = 1; i < n; i++) {
			pre[i] = pre[i - 1] + a[i];
		}
		for (int i = 0; i < m; i++) {
			int res = q[i];
			for (int j = 0; j < n; j++) {
				if (res <= pre[j]) {
					System.out.println(j + 1);
					break;
				}
			}
		}
	}

}
