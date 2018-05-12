package ����ͷ��;
/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��3��28�� ����10:30:35
* ��˵��: 
*/
public class �ַ����任 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(editDistance("113", "222"));
	}
	public static int editDistance (String s1, String s2) {
		int len1 = s1.length();
		int len2 = s2.length();
		int[][] dp = new int[len1 + 1][len2 + 1];
		for (int i = 1; i <= len1; i++) {
			dp[i][0] = i; // �ѳ���Ϊi���ַ�����Ϊ�մ�
		}
		for (int j = 1; j <= len2; j++) {
			dp[0][j] = j; // �ѿմ� ��Ϊ����Ϊj���ַ���
		}
		
		for (int i = 1; i <= len1; i++) {
			for (int j = 1; j <= len2; j++) {
				// �߽�����, s1[i] == s2[j],
				if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
					dp[i][j] = dp[i - 1][j - 1];
				}
				else {
					dp[i][j] = Math.min(dp[i - 1][j - 1] + 1, Math.min(dp[i - 1][j] + 1, dp[i][j - 1] + 1));
				}
			}
		}
		return dp[len1][len2];
		
	}

}
