package 剑指offer;
/**
* @author 作者 : coderlong
* @version 创建时间：2018年8月8日 下午11:09:40
* 类说明: 
*/
public class 循环左移 {
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
