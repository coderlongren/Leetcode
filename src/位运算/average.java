package λ����;
/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��1��27�� ����12:08:35
* ��˵��:  ����������˰������ԭ��
*/
public class average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(average(6, 4));
	}
	public static int average(int a, int b) {
		return (a&b) + ((a^b)>>1);
	}

}
