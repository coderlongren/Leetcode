package ��ָoffer;
/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��8��8�� ����11:09:40
* ��˵��: 
*/
public class ѭ������ {
	public static void main(String[] args) {
		String string = "XYZdefabc";
		System.out.println(LeftRotateString(string, 3));
	}
	 public static String LeftRotateString(String str,int n) {
		if (str == null || str.length() == 0) {
			return str;
		} 
		n = n % str.length();
		StringBuilder builder = new StringBuilder(str);
		for (int i = 0; i < n; i++) {
			char c = builder.charAt(0);
			builder.deleteCharAt(0);
			builder.append(c);
		}
		return builder.toString();
	 }
}
