package һ����У����Ŀ;

import java.util.Random;

/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��6��26�� ����9:57:12
* ��˵��: 
*/
public class Constructor_Random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		int[] arr = new int[8];
		while (i < 1000000) {
			arr[random_7()]++;
			i++;
		}
		for (int x: arr) {
			System.out.print(x + ",");
		}
	}
	public static int random_7() {
		// �Ȱ� 1-3 --> 1-9
		int ran = 8;
		while (ran >= 8) {
			ran = (random_3() - 1)*3 + random_3();
		}
		return ran;
		
	}
	public static int random_3() {
		Random random = new Random();
		return random.nextInt(3) + 1;
	}

}
