package ��ָoffer;
/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��8��10�� ����12:50:08
* ��˵��: 
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
			fuhao = 1; // ��һλ�Ǹ��ţ����ƶ�һλ����
		}
		for (int i = fuhao; i < str.length(); i++) {
			if (a[i] == '+') {
				continue;
			}
			if (a[i] > '9' || a[i] < 0) {
				return 0; // �����˲��Ϸ����ַ�
			}
			res = res*10 + (a[i] - '0');
		}
		return fuhao == 0 ? res : res * -1;
	}
}
