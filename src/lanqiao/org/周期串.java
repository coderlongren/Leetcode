package lanqiao.org;

import java.util.Scanner;

public class ���ڴ� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String string = scanner.next();
		char[] ch = string.toCharArray();
		int i,j;
		int len = string.length();
		boolean flag = true;
		for (i = 1;i <= len ;i++) {
			// �ַ����ĳ���һ���ǿ��Ա�������
			if (len%i == 0){
				flag = true;
				// ��� �ַ����Ƿ����������
				for (j = i; j < len; j++){
					if (ch[j] != ch[j%i]){
						flag = false;
						break;
					}
				}
				// �ҵ����ھ�����ѭ�� ��Ȼ��һ�ξ����� ��ô�ҵ��ľ�����С������
				if (flag){
					break;
				}
			}
		}
		System.out.println(i);

	}
	
	
}
