/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��1��22�� ����11:47:36
* ��˵��: 
*/
public class leetcode029_Divide_two_integer2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int divide(int dividend, int divisor) {
		
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
			
		}
		return sign;
		
	}

}
