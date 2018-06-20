package 牛客coder;

import java.util.Scanner;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年5月23日 下午7:42:11
* 类说明: 
*/
public class 牛牛吃蛋糕 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int T = scanner.nextInt();
		while (T > 0) {
			int N = scanner.nextInt();
			int A = scanner.nextInt();
			int B = scanner.nextInt();
			int C = scanner.nextInt();
			if (A + B*2 + C*3 < N*6) {
				System.out.println("No");
			}
			else {
				if (C >= 2) {
					N -= C/2;
					C %= 2; 
				}
				if (B >= 3) {
					N -= B/3;
					B %= 3;
				}
				if (A >= 6) {
					N-= A/6;
					A %= 6;
				}
				if (N <= 0) {
					System.out.println("Yes");
				}
				else {
					while (A > 0 && B > 0 && C > 0) {
						A -= 1;
						B -= 1;
						C -= 1;
						N -= 1;
					}
					if (N <= 0) {
						System.out.println("Yes");
					}
					else {
						System.out.println("No");
					}
				}
				System.out.println("Yes");
			}
			T--;
		}
	}

}
