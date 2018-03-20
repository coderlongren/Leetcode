package leetcodeContest76;

import java.util.Arrays;

/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��3��18�� ����12:49:46
* ��˵��: 
*/
public class twoArray {
	public static void process(int[] a, int [] b, int n) {
		int[] temp = new int[2*n];
		int i;
		// ���������鸴�Ƶ�һ��������ȥ
		for (int index = 0; index < n; index++) {
			temp[index] = a[index];
			temp[index + n] = b[index];
		}
		 // ��С���� ����
		Arrays.sort(temp);
		// �����������飬���Ӵ�С˳�����a��b�����У��������ȷ�a���ٷ�b��
		//ֱ��b�е�Ԫ���ܺʹ��ڵ���a���ٷ�a�У��Դ�����
		int curA = 0; 
		int curB = 0;
		int sumA = 0; 
		int sumB = 0;
		// ���Ԫ�� �ȷ���a��
		a[curA++] = sumA = temp[2*n - 1];
		
		for (i = 2*n - 2; i >= 0; i--) {
			// �ڶ���ķŽ�b����
			if (sumA > sumB && curB < n) {
				b[curB] = temp[i];
				sumB += b[curB++];
			}
			else if (curA < n) {
				a[curA] = temp[i];
				sumA += a[curA++];
			}
		}
			
		
	}
	public static void main(String[] args) {
		int[] a = {1,3,5,7,8};
		int[] b = {2,3,5,4,10};
		process(a, b, a.length);
		for (int i : a) {
			System.out.print(i + " ");
		}
		System.out.println();
		for (int i : b) {
			System.out.print(i + " ");
		}
	}
}	
