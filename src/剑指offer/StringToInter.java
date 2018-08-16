package 剑指offer;
/**
* @author 作者 : coderlong
* @version 创建时间：2018年8月10日 下午12:50:08
* 类说明: 
*/
public class StringToInter {
	public static void main(String[] args) {
		
	}
	public static int StrToInt(String str) {
		if (str == null || str.length() == 0) {
			return 0;
		}
		int res = 0;
		char[] a = str.toCharArray();
		int fuhao = 0;
		if (a[0] == '-') {
			fuhao = 1; // 第一位是负号，就移动一位算了
		}
		for (int i = fuhao; i < str.length(); i++) {
			if (a[i] == '+') {
				continue;
			}
			if (a[i] > '9' || a[i] < 0) {
				return 0; // 遇到了不合法的字符
			}
			res = res*10 + (a[i] - '0');
		}
		return fuhao == 0 ? res : res * -1;
	}
}
