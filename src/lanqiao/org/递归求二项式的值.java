package lanqiao.org;

import java.util.Scanner;

public class 递归求二项式的值 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		System.out.println(digui(a, b));
	}
	public static int digui(int k,int n){
		if (k == 0 || k == n){
			return 1;
		}
		return digui(k, n - 1) + digui(k - 1, n - 1);
	}

}
