package 一八年校招题目;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年8月25日 下午5:30:45
* 类说明: 
*/
public class zhihu1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		String[] ii = input.split(" ");
		int m = Integer.valueOf(ii[0]);
		int n = Integer.valueOf(ii[1]);
		String line1 = scanner.nextLine();
		String line2 = scanner.nextLine();
		String[] ll1 = line1.split(" ");
		String[] ll2 = line2.split(" ");
		Set<Integer> set = new HashSet<Integer>();
		List<Integer> list = new ArrayList<>();
		for (String item : ll1) {
			set.add(Integer.valueOf(item));
		}
		for (String item : ll2) {
			set.add(Integer.valueOf(item));
		}
		for (Integer item : set) {
			list.add(item);
		}
		list.sort(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o1 - o2;
			}
		});
		for (int i = 0; i < list.size(); i++) {
			if (i != list.size() - 1) {
				System.out.print(list.get(i) + " -> ");
			}
			else {
				System.out.print(list.get(i));
			}
		}
		
	}
}
