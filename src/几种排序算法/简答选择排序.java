package ���������㷨;
/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��1��2�� ����10:26:13
* ��˵��: 
*/
public class ���ѡ������ {

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
		// TODO Auto-generated method stub
		for (int i = 0; i < a.length - 1; i++){
			int min = i;
			for (int j = i + 1; j < a.length; j++){
				if (a[j] < a[min]){
					min = j;
				}
			}
			// �Ѿ��õ���һ����СԪ�� 
			// �ٴ��Ż� ��� min != i �ڽ���
			if (min != i){
				int temp = a[min];
				a[min] = a[i];
				a[i] = temp; 
			}
		}
	}

}
