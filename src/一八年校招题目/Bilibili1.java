package һ����У����Ŀ;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��9��7�� ����2:57:53
* ��˵��: 
*/
public class Bilibili1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		String[] arr = input.split(" ");
		String source = arr[0];
		String target = arr[1];
		int res = -1;
		if (source.length() >= target.length()) {
			for (int i = 0; i < source.length() - target.length() + 1; i++) {
				String temp = source.substring(i, i + target.length());
				if (temp.equals(target)) {
					res = i;
					break;
				}
			}
		}
		System.out.println(res);
		
	}

}
