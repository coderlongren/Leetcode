package ţ��coder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��3��7�� ����11:22:17
* ��˵��: 
*/
public class �󽻼� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		List<Integer> list1 = new ArrayList<>();
		for (int i = 0; i < a; i++) {
			list1.add(scanner.nextInt());
		}
		List<Integer> list2 = new ArrayList<>();
		for (int i = 0; i < b; i++) {
			list2.add(scanner.nextInt());
		}
		
		List<Integer> res = new ArrayList<>();
		for (Integer integer : list1) {
			if (list2.contains(integer)) {
				res.add(integer);
			}
		}
		if (res.size() == 0) {
			System.out.println("empty");
		}
		Integer[] integers = res.toArray(new Integer[1]);
		Arrays.sort(integers);
		for (int i = 0; i < integers.length; i++) {
			System.out.print(integers[i]);
		}
	}

}
