package lanqiao.org;

import java.util.Scanner;

/**
* @author ���� : coderlong
* @version ����ʱ�䣺2017��12��15�� ����1:06:37
* ��˵��: 
*/
public class K���� {

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
			dp[1][i] = 1; // 0Ϊ��λ�� ҲҪ�� 
		}
		for (int i = 2;i <= l; i++){ // ��0Ϊ��λ��ҲҪ�����ȥ��
			for (int j = 0; i < k; i++){
				for (int x = 0; x < k; x++){
					
				}
			}
		}
		
	}

}
