package ��ָoffer;

import java.math.BigInteger;

/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��8��10�� ����12:00:57
* ��˵��: 
*/
public class �޼Ӻżӷ� {
	public static void main(String[] args) {
		System.out.println(add2(1, 2));
		System.out.println(10^2);
		System.out.println(10&2);
	}
	// ��������Ͷ��ȡ���� ����
	public static int add(int num1, int num2) {
		BigInteger integer1 = new BigInteger(String.valueOf(num1));
		BigInteger integer2 = new BigInteger(String.valueOf(num2));
		return integer1.add(integer2).intValue();
	}
	// ��������ʵʵ��λ�����
	public static int add2(int num1, int num2) {
		while (num2 != 0) {
			int temp = num1^num2;
			num2 = (num1&num2)<<1;
			num1 = temp;
		}
		return num1;
	}
}
