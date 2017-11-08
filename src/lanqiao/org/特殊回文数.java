package lanqiao.org;

import java.util.Scanner;

public class 特殊回文数 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		for (int i = 10000; i < 999999;i++){
			// 五位数
			if (i <= 99999){
				
				int a = i % 10;
				int b = (i/10)%10;
				int c = (i/100)%10;
				int d = (i/1000)%10;
				int e = i/10000;
				
				if (a == e && b == d && a + b + c + e + d == x){
					System.out.println(i);
				}
			}
			//六位数的情况
			else{
				int a = i % 10;
				int b = (i/10)%10;
				int c = (i/100)%10;
				int d = (i/1000)%10;
				int e = (i/10000)%10;
				int f = i/100000;
				if (a == f && b == e && c == d && a + b + c + d +e + f == x){
					System.out.println(i);
				}
			}
		}
		
		
		
	}

}
