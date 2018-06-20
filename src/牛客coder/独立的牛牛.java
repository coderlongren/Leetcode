package 牛客coder;

import java.util.Scanner;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年5月23日 下午7:23:30
* 类说明: 
*/
public class 独立的牛牛 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		int f = scanner.nextInt();
		int d = scanner.nextInt();
		int p = scanner.nextInt();
		int day = 0;
		if (d < x*f) {
			System.out.println(day);
		}
		else {
			day = f;
			while (d >= x*f) {
				d -= p;
				f++;
				if (d >= x*f) {
					day++;
				}
			}
			System.out.println(day);
		}
		
	}

}
