/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��1��20�� ����2:17:13
* ��˵��:  û��AC ��Ϊû�п���Integer�����������������߼�����д��Ҳ�Ǻܻ��ң�
*/
public class leetcode029_Divide_two_integer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(divide(29, -1));
		System.out.println(Math.abs(-2147483648));
	}
	//  3*8=24  28/3 ---> 24 ,4/3 --->1  ---> 1����   
	public static int divide(int dividend, int divisor) {
		// ��¼������ķ���
		int sign = 1;
		if ((dividend > 0 && divisor < 0) || (dividend < 0 && divisor > 0)) {
			sign = -1;
		}
		
		// ����������� ת��Ϊ long��ֹ���
		long dividend2 = Math.abs(dividend);
		long divisor2 = Math.abs(divisor);
		
		// С�ı߽�ֵ
		if (dividend2 == 0 || (dividend2 < divisor2)) {
			return 0;
		}
		if (divisor2 == 0) {
			return Integer.MAX_VALUE;
		}
		
        long  result = 0;
        while (dividend2 >= divisor2){
        	long d = divisor2;
        	long temp = 1; // �������� ��ʱ�ı���
        	// 
        	while (dividend > d << 1){
        		d = d << 1; // d ÿ�����������
        		if (d > Integer.MAX_VALUE || d < Integer.MIN_VALUE){
        			return Integer.MAX_VALUE;
        		}
        		temp = temp << 1; //
        	}
        	result += temp;
        	dividend2 -= d;
        }
        return (int) result*sign;
    }
	

}
