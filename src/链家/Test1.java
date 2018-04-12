package 链家;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年4月8日 下午6:57:46
* 类说明: 
*/
public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner  = new Scanner(System.in);
		int n =scanner.nextInt();
		Set<Integer> set = new HashSet<>();
		for (int i = 0; i < n; i++) {
			int k = scanner.nextInt();
			for (int j = 0; j < k; j++) {
				int temp = scanner.nextInt();
				set.add(temp);
			}
		}
		System.out.println(set.size());
	}

}
