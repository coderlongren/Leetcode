package ���������㷨;
/**
* @author ���� : coderlong
* @version ����ʱ�䣺2017��12��17�� ����2:52:10
* ��˵��:  �͵����� ����Ҫ����Ŀռ�
*/
public class �������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {4,2,1,3,5};
		for (int i : a) {
			System.out.print(i  + " ");
		}
		InsertSort(a);
		System.out.println();
		for (int i : a) {
			System.out.print(i  + " ");
		}
	}
	public static void InsertSort(int[] a){
		for (int j = 1;j < a.length; j++){
			// �Ӵ�����������ȡ����һ��Ԫ��
			int key = a[j];
			// i - 1 Ϊ�����������һ��Ԫ�أ�
			int i = j - 1;
			
			// ��һ������Ϊ�߽����ƣ��ڶ���Ϊ�����ж�����
			while (i >= 0 && a[i] > key){
				a[i + 1] = a[i];// �����Ǻ���λ�ã�������������ƶ�
				i--;
			}
			
			a[i + 1] = key; // �ҵ�����λ�ã���Ԫ�ز���
		}
	}

}
