package 剑指offer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年8月11日 下午5:39:04
* 类说明: 
*/
public class 网易字符串排列 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		long k = scanner.nextLong();
		String string = "";
		for (int i = 0; i < n; i++) {
			string += "a";
		}
		for (int i = 0; i < m; i++) {
			string += "z";
		}
		char[] arr = string.toCharArray();
		List<List<Character>> list = new ArrayList<>();
		boolean[] flag = new boolean[arr.length];
		backtrack(list, new ArrayList<>(), arr, flag);
//		for (List<Character> item : list) {
//			for (char c : item) {
//				System.out.print(c);
//			}
//			System.out.print(" ");
//		}
		for (char c : list.get((int) (k - 1))) {
			System.out.print(c);
		}
		
		
	}
	public static void backtrack(List<List<Character>> list, List<Character> temp, char[] arr, boolean[] flag) {
		if (temp.size() >= arr.length) {
			list.add(new ArrayList<>(temp));
			return;
		}
		for (int i = 0; i < arr.length; i++) {
			if (flag[i]) { // 已被访问过
				continue;
			}
			if (i > 0 && arr[i] == arr[i - 1] && !flag[i - 1]) {
				continue;
			}
			flag[i] = true;
			temp.add(arr[i]);
			backtrack(list, temp, arr, flag);
			flag[i] = false;
			temp.remove(temp.size() - 1);
		}
	}

}
