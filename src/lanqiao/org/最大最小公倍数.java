package lanqiao.org;

import java.util.Scanner;
/**
* @author 作者 : coderlong
* @version 创建时间：2017年12月15日 下午12:27:57
* 类说明: 
*/
public class 最大最小公倍数 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int n = 12;// 11 10 9 8 7 6 5 4 3 2 1
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		if (n <= 2){
			System.out.println(n);
		}
		else {
			// 奇偶奇
			if (n%2 == 1){
				System.out.println(n*(n - 1)*(n - 2));
			}
			// 偶奇偶
			else {
				if (n%3 == 0){
					System.out.println((n - 1)*(n - 2)*(n - 3));
				}
				else {
					System.out.println(n*(n - 1*(n - 3)));
				}
			}
		}
	}

}
