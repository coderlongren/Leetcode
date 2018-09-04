package EasyCode;

import java.util.Scanner;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年9月3日 下午7:44:08
* 类说明: 
*/
public class jibite2 {
	public static void main(String[] args) {
		System.out.println("2018".contains("0"));
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int count = 0;
		for (int i = 2018; i <= n; i++) {
			if (isSave(i + "")) {
				count++;
			}
		}
		System.out.println(count);
	}
	public static boolean isSave(String n) {
		if (n.contains("2") && n.contains("0") && n.contains("1") && n.contains("8")) {
			int n2 = Integer.MAX_VALUE;
			int n0 = Integer.MAX_VALUE;
			int n1 = Integer.MAX_VALUE;
			int n8 = Integer.MAX_VALUE;
			int n22 = 0;
			int n00 = 0;
			int n11 = 0;
			int n88 = 0;
			
			for (int i = 0; i < n.length(); i++) {
				if (n.charAt(i) == '2') {
					n2 = Math.min(n2, i);
					n22 = Math.max(n22, i);
				} else if (n.charAt(i) == '0') {
					n0 = Math.min(n0, i);
					n00 = Math.max(n00, i);
				} else if(n.charAt(i) == '1') {
					n1 = Math.min(n1, i);
					n11 = Math.max(n11, i);
				} else if (n.charAt(i) == '8') {
					n8 = Math.min(n8, i);
					n88 = Math.max(n88, i);
				}
			}
			if (n2 < n00 && n0 < n11 && n1 < n88) {
				return true;
			}
			
		}
		return false;
	}
}
