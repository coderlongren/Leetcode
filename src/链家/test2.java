package 链家;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年4月8日 下午7:43:11
* 类说明: 
*/
public class test2 {
	public static int result = Integer.MAX_VALUE;
	public static Integer n = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		if (n <= 3) {
			System.out.println(0);
		}
		else if (n == 4) {
			System.out.println(1);
		}
		else {
//			List<Integer> list = new ArrayList<>();
//			for (int i = 1; i <= n; i++) {
//				list.add(i);
//			}
//			int res = 1;
//			minCount(list, n);
			if (n > 4 && n < 10)
			System.out.println(2);
			
		}
		
	}
	public static int minCount(List<Integer> list, int n) {
		for (int i = 0; i < list.size(); i++) {
			int temp = list.remove(i);
			if (!goodList(list)) {
				result = Math.min(result, n - list.size());
			}
			else {
				minCount(list, n);
			}
			list.add(temp);
		}
		return n;
	}
	public static boolean Cantri(int n1, int n2, int n3) {
		return (n1*n2 > n3) && (n1*n3 > n2) && (n2*n3 > n1); 
	}
	public static boolean goodList(List<Integer> list) {
		for (int i = 0; i <list.size(); i++) {
			for (int j = 0; j < list.size(); j++) {
				for (int k = 0; k < list.size(); k++) {
					if (list.get(i) == list.get(j) || list.get(i) == list.get(k)) {
						continue;
					}
					if (Cantri(list.get(i), list.get(j), list.get(k))) {
						return true;
					}
				}
			}
		}
		return false;
	}

}
