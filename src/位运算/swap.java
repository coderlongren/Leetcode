package λ����;
/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��1��27�� ����12:12:12
* ��˵��: 
*/
public class swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer a = 1;
		Integer b = 2;
		swap(a, b);
		System.out.println(a);
		System.out.println(b);
	}
	public static void swap(Integer a, Integer b) {
		a = a^b;
		b = a^b;
		a = a^b;
		System.out.println(a);
		System.out.println(b);
	}

}
