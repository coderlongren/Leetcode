package ���������㷨;

import java.util.TreeSet;

/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��1��2�� ����10:33:25
* ��˵��: 
*/
public class �Ż���ð������ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {4,2,1,3,5,-1,100};
		for (int i : a) {
			System.out.print(i  + " ");
		}
		sort(a);
		System.out.println();
		for (int i : a) {
			System.out.print(i  + " ");
		}
	}

	private static void sort(int[] a) {
		for (int i = 0; i < a.length - 1; i++){
			boolean flag = false; // ���flag = true ��֤����һ��Ҳû�н������Ѿ��ź����� ֱ��break
			for (int j = 0; j < a.length - 1 - i; j++){
				if (a[j] > a[j + 1]){
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
					flag = true;
				}
			}
			if (!flag){
				break;
			}
		}
	}

}
