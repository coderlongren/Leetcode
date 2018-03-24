package 今日头条;

import java.awt.datatransfer.StringSelection;
import java.util.Scanner;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年3月24日 下午8:12:57
* 类说明: 
*/
public class test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		for (int i = 0; i < n; i++) {
			String string = scanner.nextLine();
			int res = 0;
			string.replaceAll("6*6", "66");
			int add = 0;
			int sub = 0;
			for (char c : string.toCharArray()) {
				if (c == '+') {
					add++;
				}
				else if (c == '-') {
					sub++;
				}
			}
			if (add == sub) {
				res = 0;
			}
			else if (add - sub > 0) {
				
			}
			else {
				
			}
			
		}
		
	}
	public static void hua(int n, int hang) {
		String s = n + "";
		char[] chars = s.toCharArray();
		if (hang == 0) {
			for (int i = 0; i < chars.length; i++) {
				if (chars[i] == '0') {
					System.out.print("66666.");
				}
				else if (chars[i] == '1') {
					System.out.print(".....6");
				}
				else if (chars[i] == '2') {
					System.out.print(".66666");
				}
				else if (chars[i] == '3') {
					System.out.print(".66666");
				}
				else if (chars[i] == '4') {
					System.out.print(".6...6");
				}
				else if (chars[i] == '5') {
					System.out.print(".66666");
				}
				else if (chars[i] == '6') {
					System.out.print(".66666");
				}
				else if (chars[i] == '7') {
					System.out.print(".66666");
				}
				else if (chars[i] == '8') {
					System.out.print(".66666");
				}
				else if (chars[i] == '9') {
					System.out.print(".66666");
				}
				System.out.print(".");
			}
		}
		else if (hang == 1) {
			for (int i = 0; i < chars.length; i++) {
				if (chars[i] == '0') {
					System.out.print("6...6.");
				}
				else if (chars[i] == '1') {
					System.out.print(".....6");
				}
				else if (chars[i] == '2') {
					System.out.print(".....6");
				}
				else if (chars[i] == '3') {
					System.out.print(".....6");
				}
				else if (chars[i] == '4') {
					System.out.print(".6...6");
				}
				else if (chars[i] == '5') {
					System.out.print("6.....");
				}
				else if (chars[i] == '6') {
					System.out.print("6.....");
				}
				else if (chars[i] == '7') {
					System.out.print(".....6");
				}
				else if (chars[i] == '8') {
					System.out.print("6...6");
				}
				else if (chars[i] == '9') {
					System.out.print("6...6");
				}
				System.out.print(".");
			}
		}
		else if (hang == 2) {
			for (int i = 0; i < chars.length; i++) {
				if (chars[i] == '0') {
					System.out.print("6...6.");
				}
				else if (chars[i] == '1') {
					System.out.print(".....6");
				}
				else if (chars[i] == '2') {
					System.out.print(".66666");
				}
				else if (chars[i] == '3') {
					System.out.print(".66666");
				}
				else if (chars[i] == '4') {
					System.out.print(".66666");
				}
				else if (chars[i] == '5') {
					System.out.print(".66666");
				}
				else if (chars[i] == '6') {
					System.out.print(".66666");
				}
				else if (chars[i] == '7') {
					System.out.print(".....6");
				}
				else if (chars[i] == '8') {
					System.out.print(".66666");
				}
				else if (chars[i] == '9') {
					System.out.print(".66666");
				}
				System.out.print(".");
			}
		}
		else if (hang == 3) {
			for (int i = 0; i < chars.length; i++) {
				if (chars[i] == '0') {
					System.out.print("6...6.");
				}
				else if (chars[i] == '1') {
					System.out.print(".....6");
				}
				else if (chars[i] == '2') {
					System.out.print("6.....");
				}
				else if (chars[i] == '3') {
					System.out.print("......6");
				}
				else if (chars[i] == '4') {
					System.out.print(".....6");
				}
				else if (chars[i] == '5') {
					System.out.print(".....6");
				}
				else if (chars[i] == '6') {
					System.out.print(".6...6");
				}
				else if (chars[i] == '7') {
					System.out.print(".....6");
				}
				else if (chars[i] == '8') {
					System.out.print(".6...6");
				}
				else if (chars[i] == '9') {
					System.out.print(".....6");
				}
				System.out.print(".");
			}
		}
		else if (hang == 4) {
			for (int i = 0; i < chars.length; i++) {
				if (chars[i] == '0') {
					System.out.print("66666.");
				}
				else if (chars[i] == '1') {
					System.out.print(".....6");
				}
				else if (chars[i] == '2') {
					System.out.print(".66666");
				}
				else if (chars[i] == '3') {
					System.out.print(".66666");
				}
				else if (chars[i] == '4') {
					System.out.print("......6");
				}
				else if (chars[i] == '5') {
					System.out.print(".66666");
				}
				else if (chars[i] == '6') {
					System.out.print(".66666");
				}
				else if (chars[i] == '7') {
					System.out.print(".....6");
				}
				else if (chars[i] == '8') {
					System.out.print(".66666");
				}
				else if (chars[i] == '9') {
					System.out.print(".66666");
				}
				System.out.print(".");
			}
		}
		
	}

}
