package EasyCode;

import java.util.Scanner;

/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��9��3�� ����6:59:15
* ��˵��: 
*/
public class jibite1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		int n = Integer.valueOf(input);
		String input2 = scanner.nextLine();
		String[] arr2 = input2.split(" ");
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.valueOf(arr2[i]);
		}
		int[] dp = new int[n + 1];
		dp[0] = arr[0];
		int min = dp[0];
		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				int temp = 0;
				for (int k = i; k <= j; k++) {
					temp += arr[k];
				}
				min = Math.min(min, temp);
			}
		}
		System.out.println(min);
		
		
	}

}
