package ����ͷ��;

import java.util.Scanner;

/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��3��24�� ����7:19:38
* ��˵��: 
*/
public class test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int count = 0;
		String s = "a";
		String m = s;
		System.out.println(minCount(s, m, n, 1) - 1);
		
	}
	public static int minCount (String s, String m, int n, int count) {
		if (s.length() == n) {
			return count;
		}
		if (s.length() > n) {
			return Integer.MAX_VALUE;
		}
		String m1 = s;
		String s1 = s + s;
		String s2 = s + m;
		return Math.min(minCount(s1, m1, n, count + 1), minCount(s2, m, n, count + 1));
	}
//	public static int fun1 (String s, String m, int n) {
//		
//	}
//	public static int fun2 (String s, String m, int n) {
//		
//		
//	}
	

}
