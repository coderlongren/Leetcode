package ����;

import java.util.Scanner;

/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��3��26�� ����11:02:56
* ��˵��:  ����һ�� ��������У�б����⣬ ��ʱ�Լ���ΪҪ���㷨������������ķ��η������� 
*  ����֮�󣬲��뵽�� �������ַ����Ϳ���ʵ���ˡ���ǰ������һ�Σ���ϧ������
*   û�б�Ҫ���ǣ�ʱ�临�Ӷȣ�����㲻���ڴ˰�������
*/
public class ������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String s1 = scanner.nextLine();
		String s2 = scanner.nextLine();
		int[] res = new int[s1.length() + s2.length()]; // ���ǳ���֮�����㹻�����
		for (int i = 0; i < s1.length(); i++) {
			int n1 = s1.charAt(s1.length() - 1 - i) - '0'; // s1���λ�� ����
			int arr = 0;
			for (int j = 0; j < s2.length(); j++) {
				int n2 = s2.charAt(s2.length() - 1 - j) - '0'; // s2�����λ������
				arr = arr + res[i + j] + n1*n2;
				res[i + j] = arr%10;// ��������
				arr /= 10; // �����λ
			}
			// ��� ���н�λ
			if (arr != 0) {
				res[s2.length() + i] = arr;
			}
		}
		StringBuilder stringBuilder = new StringBuilder();
		boolean flag = true;
		for (int i = res.length - 1; i >= 0; i--) {
			if (res[i] == 0 && flag) {
				continue;
			}
			flag = false;
			stringBuilder.append(res[i]);
			
		}
		System.out.println(stringBuilder.toString());
	}

}
