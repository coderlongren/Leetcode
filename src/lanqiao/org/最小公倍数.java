package lanqiao.org;

import java.util.Scanner;

public class ��С������ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int a1 = a;
		int b = scanner.nextInt();
		int b1 = b;
		if(a < 65536 && b < 65536){
			// ���� ���Լ�� ����� a*b/���Լ�� �� ��С������
			int temp = 0;
			if (a < b){
				temp = a;
				a = b;
				b = temp;
			}
			temp = a%b;
			while (temp != 0){
				a = b;
				b = temp;
				temp = a%b;
			}
			System.out.println(a1*b1/b);
			
		}
		else{
			
		}
	}

}
