package λ����;

import java.lang.annotation.Retention;

/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��1��27�� ����12:16:07
* ��˵��: 
*/
public class abs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(abs(5));
	}
	public static int abs(int a){
		int b = a>>31; //��ȡ����λ
		return (a + b)^b; // ���� b = 0; ���� b = -1 
		
	}

}
