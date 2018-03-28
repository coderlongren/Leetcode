package 今日头条;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import AlgortithmDesign.nQueue;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年3月24日 下午2:41:40
* 类说明:   差值为K的 数组
*/
public class Test2 {
	public static void main(String[] args) {
		System.out.println(fun2(new int[2]));
		
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
	// 双指针 也可以解决
	public static int fun2 (int[] a) {
		a = new int[] {1,1,2,2,2,2,2,3,3,3,3,4};
		int k = 1;
		Set<Integer> set = new HashSet<>();
		for (int i : a) {
			set.add(i);
		}
		Integer[] aa = set.toArray(new Integer[1]);
		int n = aa.length;
		int r = 0;
		int res = 0;
		for (int l = 0; l < n; l++) {
			while (r < n && aa[r] - aa[l] < k) {
				r++; // 
			}
			if (r >= n) {
				break;
			}
			if (aa[r] - aa[l] == k) {
				res++;
			}
			
		}
		return res;
	}
}
