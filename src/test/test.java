package test;
/**
* @author ���� : coderlong
* @version ����ʱ�䣺2017��12��23�� ����12:12:00
* ��˵��: 
*/
public class test {
	public static void main(String[] arg) {
		System.out.println(arg);
		Short s1 = 1;
		// ���� s1 �ǲ���ֱ�Ӽ�1�� 1 ��int����Ҫǿת
		s1 = (short) (s1 + 1);
		// 3.5 ��double  ����ֱ�Ӹ�ֵ ��f1
		float f1 = 3.5F;
		double d1 = 3.2;
		String string = "l love you";
		string = string.replace(" ", "");
		System.out.println(string);
	}
	
	
}
