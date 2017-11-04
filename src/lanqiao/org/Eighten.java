package lanqiao.org;

import java.util.Scanner;

public class Eighten {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		String[] arr = new String[n];
		int[] result = new int[n];
		for (int i = 0; i < n; i++){
			arr[i] = scanner.next();
			arr[i] = Integer.toOctalString(Integer.valueOf(arr[i],16));
			
		}
//		Integer.toOctalString(Integer.valueOf("FFFF",16));
//		for (int i = 0; i < n; i++){
//			arr[i] = Integer.toBinaryString(result[i]);
//			result[i] = Integer.parseInt(arr[i]);
//			arr[i] = Integer.toHexString(result[i]);
//		}
//		
		for (int i = 0; i < n; i++){
			System.out.println(arr[i]);
		}
		
	}

}
