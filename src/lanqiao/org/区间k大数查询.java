package lanqiao.org;

import java.util.Arrays;
import java.util.Scanner;

/**
* @author ���� : coderlong
* @version ����ʱ�䣺2017��12��15�� ����12:11:06
* ��˵��: 
*/
public class ����k������ѯ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
//		System.out.println(n);
		int[] array = new int[n];
		for (int i = 0; i < n;i++){
			array[i] = scanner.nextInt();
		}
		int m = scanner.nextInt();
		
		for (int i = 0; i < m; i++){
			int q = 0;
			int l = scanner.nextInt();
			int r = scanner.nextInt();
			int K = scanner.nextInt();
			int[] temp = new int[r - l + 1];
			for (int j = l; j <= r; j++){
				temp[q++] = array[j - 1];
			}
			Arrays.sort(temp);
			System.out.println(temp[temp.length - K]);
		}
	}

}
