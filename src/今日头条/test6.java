package 今日头条;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年3月25日 上午11:01:47
* 类说明: 
*/
public class test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String string = scanner.nextLine();
		
		Set<String> set = new HashSet<>();
		char[] chars = string.toCharArray();
		int l = 0;
		int r = 0;
		for (int i = 0; i < string.length(); i++) {
			while (chars[r] < '0' || chars[r] > '9') {
				l++;
				r++;
			}
			StringBuilder stringBuilder = new StringBuilder();
			while (chars[r] >= '0' && chars[r] <= '9') {
				stringBuilder.append(chars[r++]);
				if (r >= string.length()) {
					break;
				}
			}
			set.add(stringBuilder.toString());
			i = r - 1;
		}
		int res = Integer.MIN_VALUE;
		for (String s : set) {
			res = Math.max(res, Integer.valueOf(s));
		}
		System.out.println(res);
	}

}
