package ţ��coder;

import java.util.Scanner;

import org.hamcrest.core.IsInstanceOf;

/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��3��17�� ����10:19:05
* ��˵��: 
*/
public class �������ְ����� {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		int[] res = new int[10];
		for (char c : s.toCharArray()) {
			res[Integer.valueOf(c) - 48]++;
		}
		if (res[4] == 0 && res[7] == 0) {
			System.out.println(-1);
		}
		else if (res[4] >= res[7] ) {
			System.out.println(4);
		}
		else {
			System.out.println(7);
		}
	}

}
