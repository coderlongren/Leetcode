package lanqiao.org;

import java.util.Scanner;

public class ��ĸͼ�� {

	public static void main(String[] args) {
//		System.out.println((char)('A' + 0));
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		for (int i = 0; i < n;i++){
			// �ҵ�����һ�� ����� ���� 
			for (int j = 0; j < m; j++){
				System.out.print((char)(Math.abs(i - j) + 'A'));
			}
			System.out.println();
		}
	}
}
