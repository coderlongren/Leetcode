/**
* @author ���� : coderlong
* @version ����ʱ�䣺2017��12��12�� ����8:47:21
* ��˵��: 
*/
public class leetcode342_Power_of_four {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(Integer.toBinaryString(16));
		System.out.println(Integer.valueOf("10000",2));
		System.out.println(4 & 0x55555555);
	}
	public static boolean isPowerOfFour(int num) {
		// ����ж�һ���� ��4���������� ������2�����������أ�
		// ˼��һ�°� ��ͬѧ
        return num > 0 && (num&(num-1)) == 0 && (num & 0x55555555) != 0;
    }

}
