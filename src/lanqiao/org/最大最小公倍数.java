package lanqiao.org;

import java.util.Scanner;
/**
* @author ���� : coderlong
* @version ����ʱ�䣺2017��12��15�� ����12:27:57
* ��˵��: 
*/
public class �����С������ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int n = 12;// 11 10 9 8 7 6 5 4 3 2 1
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		if (n <= 2){
			System.out.println(n);
		}
		else {
			// ��ż��
			if (n%2 == 1){
				System.out.println(n*(n - 1)*(n - 2));
			}
			// ż��ż
			else {
				if (n%3 == 0){
					System.out.println((n - 1)*(n - 2)*(n - 3));
				}
				else {
					System.out.println(n*(n - 1*(n - 3)));
				}
			}
		}
	}

}
