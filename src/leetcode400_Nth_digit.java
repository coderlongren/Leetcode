/**
* @author ���� : coderlong
* @version ����ʱ�䣺2017��12��28�� ����1:18:40
* ��˵��:  ע���� ��1 ��ʼ��n�����֣�������������С�ľͻῴ��������
*/
public class leetcode400_Nth_digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(Math.ceil(3.2));
//		System.out.println(Math.floor(3.2));
//		System.out.println(Math.round(3.2));
		int n = 10;
		System.out.println(findNthDigit(n));
		
		
	}
	public static int findNthDigit(int n) {
		
		//  �ȶ�λ��ʱ ��λ����
		int digitType = 1;
		long digitNum = 9;
		while (n > digitNum*digitType){
			n -= digitNum*digitType;
			digitType += 1;
			digitNum *= 10;
		}
		
		int i = (int) ((n - 1)/digitType);
		int j = (int)((n - 1)%digitType);
		// �ڼ�λ�� ��һ����
		int start = (int) (1*Math.pow(10, digitType - 1)) + i;
//		for ()
		String result = start + "";
		char c = result.charAt(j);
		return c - '0';
        
    }
}
