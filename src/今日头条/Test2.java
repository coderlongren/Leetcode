package ����ͷ��;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��3��24�� ����2:41:40
* ��˵��: 
*/
public class Test2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int k = scanner.nextInt();
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = scanner.nextInt();
		}
		Arrays.sort(array);
		int count = 0;
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < n; i++) {
			int start = array[i];
			for (int j = i; j < n; j++) {
				if ((array[j] - array[i]) > k) {
					break;
				}
				if ((array[j] - array[i]) == k) {
					map.put(array[i], array[j]);
				}
			}
			
		}
		System.out.println(map.keySet().size());
		
	}
}
