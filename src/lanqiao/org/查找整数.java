package lanqiao.org;

import java.util.Scanner;

public class ²éÕÒÕûÊı {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] array = new int[n];
		for (int i = 0; i < n; i++){
			array[i] = scanner.nextInt();
		}
		int a = scanner.nextInt();
		boolean flag = false;
		for (int i = 0; i < n; i++){
			if (array[i] == a){
				flag = true;
				System.out.println(i + 1);
				break;
			}
		}
		if (!flag){
			System.out.println(-1);
		}
		
	}

}
