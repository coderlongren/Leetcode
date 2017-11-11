package lanqiao.org;

import java.util.Scanner;

public class 最小公倍数 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int a1 = a;
		int b = scanner.nextInt();
		int b1 = b;
		if(a < 65536 && b < 65536){
			// 先求 最大公约数 最后用 a*b/最大公约数 即 最小公倍数
			int temp = 0;
			if (a < b){
				temp = a;
				a = b;
				b = temp;
			}
			temp = a%b;
			while (temp != 0){
				a = b;
				b = temp;
				temp = a%b;
			}
			System.out.println(a1*b1/b);
			
		}
		else{
			
		}
	}

}
