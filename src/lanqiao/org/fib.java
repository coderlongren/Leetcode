package lanqiao.org;

import java.math.BigInteger;
import java.util.Scanner;

/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��3��10�� ����7:54:07
* ��˵��: 
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
	// �ݹ� һ���ᳬ�е�
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
