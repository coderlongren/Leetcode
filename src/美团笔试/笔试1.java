package ���ű���;

import java.util.Scanner;

/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��3��22�� ����6:47:46
* ��˵��: 
*/
public class ����1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String S = scanner.nextLine();
		String T = scanner.nextLine();
		char[] charT = T.toCharArray();
		char[] charS = S.toCharArray();
		int lenS = S.length();
		int lenT = T.length();
		int res = 0;
		for (int i = 0; i <= S.length() - lenT; i++) {
			int count = 0;
			int k = i;
			for (int j = 0; j < T.length(); j++) {
				if (charS[k++] != charT[j]) {
					count++;
				}
			}
			res += count;
		}
		System.out.println(res);
		
	}

}
