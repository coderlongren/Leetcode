package leetcodeContest75;
/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��3��11�� ����10:30:39
* ��˵��: 
*/
public class leetcpde796_Rotate_String {
	public static boolean rotateString(String A, String B) {
        StringBuilder  stringBuilder = new StringBuilder(A);
        int count = 0;
        while (count < A.length()) {
        	char temp = stringBuilder.charAt(0);
        	stringBuilder.deleteCharAt(0);
        	stringBuilder.append(temp);
        	if (stringBuilder.toString().equals(B)) {
        		return true;
        	}
        	count++;
        }
        return false;
    }
//	public static String rotate(String string,int n) {
//		StringBuilder stringBuilder = new StringBuilder(string);
//		for (int i = 0; i < n; i++) {
//			
//		}
//	}
	public static void main(String[] args) {
		System.out.println(rotateString("abcde", "abced"));
	}
}
