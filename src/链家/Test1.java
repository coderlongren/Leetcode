package ����;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��4��8�� ����6:57:46
* ��˵��: 
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
