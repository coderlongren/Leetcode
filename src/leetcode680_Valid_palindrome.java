/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��1��17�� ����8:51:04
* ��˵��: 
*/
public class leetcode680_Valid_palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public boolean validPalindrome(String s) {
		int i = 0;
		int j = s.length() - 1;
		while (i < j && s.charAt(i) == s.charAt(j)){
			i++;
			j--;
		}
		// �õ���һ�� ����ͬ�� i j
		if (validPalin(s, i + 1, j) || validPalin(s, i, j - 1)){
			return true;
		}
		else {
			return false;
		}
	}
	public boolean validPalin(String string,int i,int j){
		while (i < j){
			if (string.charAt(i) != string.charAt(j)){
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

}
