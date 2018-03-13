package lanqiao.org;

import java.math.BigInteger;
import java.util.Scanner;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年3月10日 下午7:54:07
* 类说明: 
*/
public class fib {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int p = scanner.nextInt();
		
		int fm = fib(m);
		System.out.println(fm);
		int count = 0;
		for (int i = 1; i <= n; i++) {
			count +=fib(i);
		}
		System.out.println(count%fib(m)%p);
		System.out.println(count);
	}
	// 递归 一定会超市的
	public static int fib(int n) {
		int a = 1;
		int b = 1;
		if (n == 1 || n == 2) {
			return 1;
		}
		int fb = 0;
		for (int i = 3; i <= n; i++) {
			fb = a + b;
			a = b;
			b = fb;
		}
		return fb;
	}
}
