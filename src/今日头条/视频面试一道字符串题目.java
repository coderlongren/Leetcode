package ����ͷ��;
/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��4��19�� ����8:44:20
* ��˵��: 
*/
public class ��Ƶ����һ���ַ�����Ŀ {
	public static void main(String[] args) {
		// ���Ե�ʱ�����ı��༭��д����bug, �����±������
		// �������һ��ص�������д��һ�£����������� �������Թ�û����
		String string = "10101101011101";
		int[] dp = new int[string.length()];
		int res = Integer.MIN_VALUE;
		int k = 4;
		for (int i = 0; i < k; i++) {
			if (string.charAt(i) == '1') {
				dp[k - 1]++;
			}
		}
		for (int i = k; i < string.length(); i++) {
			if (string.charAt(i) == '1') {
				if (string.charAt(i - k) == '1') {
					dp[i] = dp[i - 1];
					res = Math.max(res, dp[i]);
				}
				else {
					dp[i] = dp[i - 1] + 1;
					res = Math.max(res, dp[i]);
				}
			}
			else {
				if (string.charAt(i - k) == '1') {
					dp[i] = dp[i - 1] - 1;
					res = Math.max(res, dp[i]);
				}
				else {
					dp[i] = dp[i - 1];
					res = Math.max(res, dp[i]);
				}
			}
		}
		System.out.println(res);
		
	}
}
