package lanqiao.org;

import java.util.Scanner;

/**
* @author 作者 : coderlong
* @version 创建时间：2017年12月15日 下午1:06:37
* 类说明: 
*/
public class K好数 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		long mod = 1000000007 ;
		long[][] dp = new long[105][105];
		int k = scanner.nextInt();
		int l = scanner.nextInt();
		if (k == 1){
			System.out.println(0);
			System.exit(0);
		}
		for (int i = 0; i < k;i++){
			dp[1][i] = 1; // 0为首位的 也要算 
		}
		for (int i = 2;i <= l; i++){ // 以0为首位的也要计算进去，
			for (int j = 0; i < k; i++){
				for (int x = 0; x < k; x++){
					
				}
			}
		}
		
	}

}
