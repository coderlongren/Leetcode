package λ����;
/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��1��27�� ����12:18:39
* ��˵��: 
*/
public class max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(max(11, 3));
	}
	public static int max(int a, int b) {
		return a ^ (( a ^ b) & (a - b)>>31);
	}

}
