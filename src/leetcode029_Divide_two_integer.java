/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��1��20�� ����2:17:13
* ��˵��: 
*/
public class leetcode029_Divide_two_integer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(divide(-26, -3));
		System.out.println(Math.abs(-2147483648));
	}
	//  3*8=24  28/3 ---> 24 ,4/3 --->1  ---> 1����   
	public static int divide(int dividend, int divisor) {
        if (dividend == 0){
        	return 0;
        }
        if(divisor == 1){
        	return dividend;
        }
        if (divisor == -1){
        	return -dividend;
        }
        int sign = -1;
        if ((dividend > 0 && divisor > 0) || (dividend < 0 && divisor < 0)){
        	sign = 1;
        }
        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);
        long v1 = dividend;
        long v2 = divisor;
        
        long  result = 0;
        while (dividend >= divisor){
        	long d = divisor;
        	long temp = 1; // �������� ��ʱ�ı���
        	// 
        	while (dividend > d << 1){
        		d = d << 1; // d ÿ�����������
        		temp = temp << 1; //
        	}
        	result += temp;
        	dividend -= d;
        }
        return (int) result*sign;
    }
	

}
