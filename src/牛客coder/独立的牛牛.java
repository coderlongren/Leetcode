package ţ��coder;

import java.util.Scanner;

/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��5��23�� ����7:23:30
* ��˵��: 
*/
public class ������ţţ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		int f = scanner.nextInt();
		int d = scanner.nextInt();
		int p = scanner.nextInt();
		int day = 0;
		if (d < x*f) {
			System.out.println(day);
		}
		else {
			day = f;
			while (d >= x*f) {
				d -= p;
				f++;
				if (d >= x*f) {
					day++;
				}
			}
			System.out.println(day);
		}
		
	}

}
