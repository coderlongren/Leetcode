package leetcodeContest77;
/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��4��7�� ����12:09:04
* ��˵��: 
*/
public class leetcode806_Number_of_lines_to_Write_String {
	public static void main(String[] args) {
		int[] widths = {10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10};
		String S = "abcdefghijklmnopqrstuvwxyz";
		System.out.println(numberOfLines(widths, S)[0]);
	}
	 public static int[] numberOfLines(int[] widths, String S) {
		if (S == null || S.length() == 0) {
			return new int[]{0,0};
		}
		int pos = 0; // ����
		int line = 1;
		
		for (int i = 0; i <S.length(); i++) {
			pos += widths[S.charAt(i) - 'a'];
			if (pos > 100) {
				line++;
				pos = 0;
				i--;
			}
		}
		return new int[]{line, pos};
		
	 }
}
