package lanqiao.org;

import java.util.Scanner;

public class 周期串 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String string = scanner.next();
		char[] ch = string.toCharArray();
		int i,j;
		int len = string.length();
		boolean flag = true;
		for (i = 1;i <= len ;i++) {
			// 字符串的长度一定是可以被整除的
			if (len%i == 0){
				flag = true;
				// 检测 字符串是否具有周期性
				for (j = i; j < len; j++){
					if (ch[j] != ch[j%i]){
						flag = false;
						break;
					}
				}
				// 找到周期就跳出循环 当然第一次就跳出 那么找到的就是最小的周期
				if (flag){
					break;
				}
			}
		}
		System.out.println(i);

	}
	
	
}
