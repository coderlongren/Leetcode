package ����ͷ��;

import java.util.Scanner;

/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��3��25�� ����10:24:51
* ��˵��: 
*/
public class ��ӡ666 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String[][] G = {{"66666", "....6", "66666", "66666", "6...6", "66666", "66666", "66666", "66666", "66666"},
			    {"6...6", "....6", "....6", "....6", "6...6", "6....", "6....", "....6", "6...6", "6...6"},
			    {"6...6", "....6", "66666", "66666", "66666", "66666", "66666", "....6", "66666", "66666"},
			    {"6...6", "....6", "6....", "....6", "....6", "....6", "6...6", "....6", "6...6", "....6"},
			    {"66666", "....6", "66666", "66666", "....6", "66666", "66666", "....6", "66666", "66666"}
			};
		Scanner scanner = new Scanner(System.in);
		String string = scanner.nextLine();
		int ans =cal(string);
		System.out.println(ans);

	}
	// һ���򵥵� ���ʽ��ֵ��û��ʹ�ú�׺���ʽ+ջ
	// ��Ϊ����Ŀ�����ǣ� ֻ�����У�6 + - * ���ַ��ţ��ض����� �ض����
	public static int cal(String string) {
		char[] s = string.toCharArray();
		int n = s.length;
		int sum = 0;
		int cur = 0; 
		int prd = 1;
		for (int i = 0; i < n; i++) {
	        if(Character.isDigit(s[i]))  {
	        	cur = cur*10 + s[i] - '0';
	        }
	        else if(s[i] == '-') { 
	            sum+=prd*cur; 
	            cur = 0;
	            prd = -1;
	        }
	        else if(s[i] == '+') {
	        	
	            sum += prd*cur;
	            cur = 0;
	            prd = 1;
	        }
	        else {
	            prd *= cur;
	            cur = 0;
	        }
	    }
	    return sum + prd * cur;
	}

}
