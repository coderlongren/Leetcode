import java.util.Scanner;

/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��8��28�� ����7:05:55
* ��˵��: 
*/
public class hao1 {
	public static void main(String[] args) {
		
	}
	public static int kth(long x, long k) {
		int y = 1;
		while (k > 0) {
			long temp = x | y;
			if (temp == (x + y)) {
				k--;
			}
			y++;
		}
		return y - 1;
	}
}
