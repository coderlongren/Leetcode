package ţ��coder;

import java.util.Arrays;
import java.util.Scanner;

/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��3��17�� ����10:31:11
* ��˵��: 
*/
public class ��������2 {
	static long[] a = new long[(int) (1e5 + 5)];
	static long k = 0;
	public static void main(String[] args) {
		dfs(4);
		dfs(7);
		Arrays.sort(a);
		Scanner scanner = new Scanner(System.in);
		long l = scanner.nextLong();
		long r = scanner.nextLong();
		long res = 0;
		long sum = 0;
		long i = l;
		while (i <= r) {
			while (a[(int) res] < i) {
				res++;
			}
			sum += a[(int) res];
			i++;
		}
		System.out.println(sum);
		
	}
	private static void dfs(long n) {
		if (n > 2e10) {
			return;
		}
		a[(int) k++] = n;
		dfs(n*10 + 4);
		dfs(n*10 + 7);
	}

	private static int next(int i) {
		while (true) {
			if (isLucky(i)) {
				return i;
			}
			i++;
		}
	}
	private static boolean isLucky(int i) {
		String lucky = String.valueOf(i);
		
		for (char c : lucky.toCharArray()){
			if (c != '4' && c != '7') {
				return false;
			}
		}
		return true;
		
	}

}
