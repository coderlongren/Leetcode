package ����ͷ��;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��3��24�� ����7:38:26
* ��˵��: 
*/
public class test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		Set<Integer> a = new HashSet<>();
		Set<Integer> b = new HashSet<>();
		int avgA = avg(a);
		int avgB = avg(b);
		
		int count = 0;
		for (Integer integer : b) {
			if (!a.contains(integer) && integer < avgB) {
				count++;
			}
		}
		System.out.println(count);
		
	}
	public static int avg (Set<Integer> set) {
		int sum = 0;
		for (Integer integer : set) {
			sum += integer;
		}
		int size = set.size();
		int avg = sum/size;
		return avg;
	}
//	public static int addAvg (Set<Integer> set, int a) {
//		
//		int sum = 0;
//		for (Integer integer : set) {
//			sum += integer;
//		}
//		int size = set.size();
//		int avg = sum/size;
//		return avg;
//	}

}
