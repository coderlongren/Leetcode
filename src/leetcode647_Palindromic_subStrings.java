import test.person;

/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��5��12�� ����4:21:18
* ��˵��: 
*/
public class leetcode647_Palindromic_subStrings {
	int count = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(countSubstrings2("aba"));
	}
	public static int countSubstrings(String s) {
        int count = 0;
        if (s == null || s.length() == 0) {
        	return count;
        }
        for (int i = 0; i < s.length(); i++) {
        	count += checkString(s, i, i);
        	count += checkString(s, i, i + 1);
        }
        return count;
    }
	public static int checkString(String string , int i, int j) {
		int count = 0;
		while ((i >= 0 && j < string.length()) && string.charAt(i) == string.charAt(j)) {
			i--;
			j++;
			count++;
		}
		return count;
	}
	public static int longestPalindromicString(String s) {
		int len = s.length();
		int max = Integer.MIN_VALUE;
		boolean[][] dp = new boolean[len][len];
		for (int i = 0; i < s.length(); i++) {
			for (int j = 0; j <= i; j++) {
				if (i - j < 2) {
					dp[j][i] = (s.charAt(i) == s.charAt(j));
				}
				else {
					dp[j][i] = (s.charAt(i) == s.charAt(j) && dp[j + 1][i - 1]);
				}
				if (dp[j][i]) {
					// ����һ�������Ӵ�
					max = Math.max(max, i - j + 1);
				}
			}
		}
		return max;
	}
	// ʹ��DP ���� �����Ӵ���Ŀ, ������� Dp��������ͬ��
	public static int countSubstrings2(String s) {
		int len = s.length();
		int count = 0;
		boolean[][] dp = new boolean[len][len];
		for (int i = 0; i < s.length(); i++) {
			for (int j = 0; j <= i; j++) {
				if (i - j < 2) {
					dp[j][i] = (s.charAt(i) == s.charAt(j));
				}
				else {
					dp[j][i] = (s.charAt(i) == s.charAt(j) && dp[j + 1][i - 1]);
				}
				if (dp[j][i]) {
					// ����һ�������Ӵ�
					count++;
				}
			}
		}
		return count;
	}

}
