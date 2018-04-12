package ���������㷨;
/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��1��3�� ����10:41:58
* ��˵��: ������� �鲢����һ������ʱ�临�Ӷ�Ϊ nlog(n)��ͬ���ֺͲ�������һ������ �͵�����
*  ����Ҫ����Ŀռ�
*/
public class ������ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {20,50,10,40,70,10,80,30,60};
		System.out.println("������֮ǰ");
		for (int i : arr) {
			System.out.print(i + " ");
		}
		heapSort(arr);
		System.out.println("\n ������֮��");
		for (int i : arr) {
			System.out.print(i + " ");
		}
		
	}
	// �������㷨�� ����
	public static void heapSort(int[] arr) {
		int len = arr.length - 1;
		// ģ��ѵĹ���
		for (int i = len/2 - 1; i >= 0; i--) {
			headAdjust(arr, i, len);
		}
		
		while (len >= 0) {
			swap(arr, 0, len); // �Ѷ�Ԫ�أ���β�ڵ㽻��֮�󣬳��ȼ�һ�����Ԫ���Ѿ����˶ѵ����
			len--; // �ѳ��ȼ�һ
			headAdjust(arr, 0, len); // �ٴζԶѽ��е��� 
		}
	}
	
	// �ѵĵ����㷨�� ������Ĺؼ�֮��
	public static void headAdjust(int[] arr, int i, int len) {
		// i Ϊ��Ҷ�ӽڵ������
		int left;
		int right;
		int j;
		while ((left = 2*i + 1) <= len) { // �жϵ�ǰ�ڵ����� ��ڵ㣬leftΪ��ڵ�
			right = left + 1; // �ҽڵ�
			j = left; // j ---> left
			if (j < len) { // ���������ҽڵ���ڵĻ�
				if (arr[left] < arr[right]) {
					j++; // j---> right ָ���ҽڵ�
				}
			}
			if (arr[i] < arr[j]) {
				swap(arr, i, j);
			}
			else {
				break; // ���ڵ㣬�����Һ��ӽڵ㶼�󣬲���Ҫ�Ƚ���
			}
			
			// ��� i = j�� ��ѭ��������
			i = j;
		}
	}
	
	// ���������������ڵ��ֵ, ��ʵ����ÿ�ε�����֮�󣬰ѶѶ������Ԫ�طŵ�β�����ͺñȽ�����һ��ð��
	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
