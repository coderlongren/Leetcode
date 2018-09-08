package 一八年校招题目;

import java.util.Scanner;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年9月8日 下午7:32:52
* 类说明: 
*/
public class yixin1 {
	public static long flag = 100003;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		String[] arr = input.split(" ");
		long n = Long.valueOf(arr[0]);
		long m = Long.valueOf(arr[1]);
		long res = min(n, m) - n * min(n - 1, m - 1);
		while (res < 0) {
			res += flag;
		}
		System.out.println(res);
		
		
	}
	public static long min(long a, long b) {
		long an = 1;
		a %= flag;
		while (b > 0) {
			long temp = b&1;
			if (temp > 0) {
				an = (an * a) % flag;
			}
			b >>= 1;
			a = (a*a) % flag;
		}
		return an % flag;
	}

}
