/**
* @author 作者 : coderlong
* @version 创建时间：2018年1月17日 下午8:51:04
* 类说明: 
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
		// 拿到第一次 不相同的 i j
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
