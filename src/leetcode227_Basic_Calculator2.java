import java.util.Stack;

/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��5��17�� ����10:18:36
* ��˵��: 
*/
public class leetcode227_Basic_Calculator2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "3/1";
		System.out.println(calculate(s));
	}
	
	public static int calculate(String s) {
        char[] chars = s.toCharArray();
        int res = 0;
        Stack<Integer> stack = new Stack<>();
        char sign = '+';
        int temp = 0;
        for (int i = 0; i < chars.length; i++) {
        	if (Character.isDigit(chars[i])) { // ������ջ
        		temp = 10*temp + (chars[i] - '0');
        	}
        	if (!Character.isDigit(chars[i]) && chars[i] != ' ' || i == chars.length - 1) {
        		boolean flag = false;
        		if (sign == '+') {
        			stack.push(temp);
        		}
        		if (sign == '-') {
        			stack.push(-temp);
        		}
        		if (sign == '*') {
        			int num = stack.pop();
        			num = num * temp;
        			stack.push(num);
        		}
        		if (sign == '/') {
        			int num = stack.pop();
        			num = num/temp;
        			stack.push(num);
        		}

        		sign = chars[i]; // sign ʼ�ռ�¼��һ������λ
        		temp = 0; // temp ��λ0
        	}
        }
        
        for (int i : stack) {
        	res += i;
        }
        return res;
    }

}
