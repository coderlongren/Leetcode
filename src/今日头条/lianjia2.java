package 今日头条;

import java.util.Arrays;
import java.util.Scanner;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年8月18日 下午7:51:03
* 类说明: 
*/
public class lianjia2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String xString = scanner.nextLine();
		int n = Integer.valueOf(xString);
		String xx = scanner.nextLine();
		String[] xxx = xx.split(" ");
		int[] arr = new int[xxx.length];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.valueOf(xxx[i]);
		}
		Arrays.sort(arr);
		int sum = 0;
		for (int i = 1; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println(sum);
	}
}
