import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年8月28日 下午7:33:23
* 类说明: 
*/
public class hao2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		String[] ar = line.split(" ");
		int[] arr = new int[ar.length];
		for (int i = 0; i < ar.length; i++) {
			arr[i] = Integer.valueOf(ar[i]);
		}
		int max = 0;
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			dfs(arr, i, 0, list);
		}
		for (int item : list) {
			max = Math.max(max, item);
		}
		System.out.println(max);
	}
	public static void dfs(int[] arr, int start, int sum, List<Integer> list) {
		if (start == arr.length) {
			list.add(sum);
			return;
		}
		sum += arr[start];
		for (int i = start + 1; i <= arr.length; i++) {
			if (i == arr.length || arr[i] > arr[start]) {
				dfs(arr, i, sum, list);
			}
		}
	}
}
