package 牛客coder;

import java.util.Scanner;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年3月17日 下午1:07:20
* 类说明: 
*/
public class 幸运数字3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt(); // d的长度
		int k  = scanner.nextInt(); // 操作次数
		String d = scanner.nextLine();
		String dd = scanner.nextLine();
		char[] chars = dd.toCharArray();
		int start = 0;
		boolean flag = false;
		for (int i = 0; i < k; i++) {
			int newStart = (start > 0) ? start : 0; 
			for (int j = newStart; j < chars.length - 1; j++) {
				if (chars[j] == '4' && chars[j + 1] == '7') {
					if ((j + 1)%2 == 0) {
						chars[j] = '7';
						start = j - 1;
					}
					else {
						chars[j + 1] = '4';
						start = j + 1;
					}
					flag = true;
					break;
				}
			}
			if (!flag) {
				break;
			}
			flag = false;
		}
		
		String res = String.valueOf(chars);
		System.out.println(res);
//		main2();
	}
	public static void main2() {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt(); // d的长度
		int k  = scanner.nextInt(); // 操作次数
		String d = scanner.nextLine();
		String dd = scanner.nextLine();
		char[] chars = dd.toCharArray();
	}
}
