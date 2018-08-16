package ���������㷨;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��1��3�� ����10:41:58
* ��˵��: ������� �鲢����һ������ʱ�临�Ӷ�Ϊ nlog(n)��ͬ���ֺͲ�������һ������ �͵�����
*  ����Ҫ����Ŀռ�
*/
public class ������ {
	public static void main(String[] args) {
//		// TODO Auto-generated method stub
		int[] arr = {20,50,10,40,70,10,80,30,60};
		System.out.println("������֮ǰ");
		for (int i : arr) {
			System.out.print(i + " ");
		}
		heapSort2(arr);
		System.out.println("\n ������֮��");
		for (int i : arr) {
			System.out.print(i + " ");
		}
//		testPriority();
	}
	// ����һ�� ����Ķ�����
	public static void heapSort2(int[] arr) {
		int len = arr.length - 1;
		// ������С��
		for (int i = len/2 - 1; i >= 0; i--) {
			heapAdjust2(arr, i, len);
		}
		while (len >= 0) {
			swap(arr, 0, len);
			len--;
			heapAdjust2(arr, 0, len);
		}
		
	}
	// ��С�ѵ� �����㷨
	public static void heapAdjust2(int[] arr, int i, int len) {
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
			i = j;
		}
		
	}
	// �������㷨�� ��������������ѹ���
	public static void heapSort(int[] arr) {
		int len = arr.length - 1;
		// ģ��ѵĹ���
		// i = len/2 - 1 i�ڵ�����к��ӽڵ㣬���ܵ���
		for (int i = len/2 - 1; i >= 0; i--) {
			heapAdjust(arr, i, len);
		}
		
		while (len >= 0) {
			swap(arr, 0, len); // �Ѷ�Ԫ�أ���β�ڵ㽻��֮�󣬳��ȼ�һ�����Ԫ���Ѿ����˶ѵ����
			len--; // �ѳ��ȼ�һ
			heapAdjust(arr, 0, len); // �ٴζԶѽ��е��� 
		}
	}
	// �ѵĵ����㷨�� ������Ĺؼ�֮��
	public static void heapAdjust(int[] arr, int i, int len) {
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
	
	public static void testPriority() {
		// ����ν�� o1 - o2 ��ʵ����Ĭ�ϵ���С��  �Ѷ�����Сֵ��
		PriorityQueue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o2 - o1;
			}
			
		});
		queue.offer(2);
		queue.offer(1);
		queue.offer(5);
		queue.offer(4);
		queue.offer(3);
		while (!queue.isEmpty()) {
			System.out.println(queue.poll());
		}
	}

}
