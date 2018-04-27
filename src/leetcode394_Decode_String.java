import java.util.Stack;

/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��4��25�� ����7:36:07
* ��˵��: 
*/
public class leetcode394_Decode_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "3[a]2[bc]";
		System.out.println(decodeString2(s));
 	}
	// 
	public String decodeString(String s) {
        StringBuilder res = new StringBuilder();
        int i = 0;
        while (i < s.length()) {
        	if (!Character.isDigit(s.charAt(i))) {
        		res.append(s.charAt(i++));
        	}
        	else {
        		if (s.charAt(i + 1) == '[') {
        			
        		}
        	}
        }
		return s;
    }
	// ������ջ�����Ļ��� Ӧ��˼·�Ƚ�����
	public static String decodeString2(String s) {
		int index = 0;
		Stack<Integer> countStack = new Stack<>();
		Stack<String> resStack = new Stack<>();
		StringBuilder res = new StringBuilder("");
		StringBuilder temp = new StringBuilder(); // ��ʱ���� []֮����ַ���
		while (index < s.length()) {
			if (Character.isDigit(s.charAt(index))) {
				// ��� [ ǰ��� ʮ��������
				int sum = 0;
				while (Character.isDigit(s.charAt(index))) {
					sum = sum*10 + (s.charAt(index) - '0');
					index++;
				}
				countStack.push(sum); // [ ֮ǰ�����ֽ�ջ
			}
			
			else if (s.charAt(index) == '[') {
				resStack.push(res.toString());
				res.delete(0, res.length()); // res���
				index++;
			}
			else if (s.charAt(index) == ']') {
				StringBuilder head = new StringBuilder(resStack.pop());// res�� �ʼһ����
				int count = countStack.pop();
				for (int i = 0; i < count; i++) {
					head.append(res.toString());
				}
				res = new StringBuilder(head.toString());
				index++;
			}
			else {
				res.append(s.charAt(index));
				index++;
			}
		}
		return res.toString();
	}

}
