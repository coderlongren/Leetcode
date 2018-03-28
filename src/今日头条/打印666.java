package 今日头条;

import java.util.Scanner;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年3月25日 上午10:24:51
* 类说明: 
*/
public class 打印666 {

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
	// 一个简单的 表达式求值，没有使用后缀表达式+栈
	// 因为本题目条件是， 只包含有，6 + - * 四种符号，特定条件 特定求解
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
