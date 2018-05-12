package leetcodeContest82;
/**
* @author 作者 : coderlong
* @version 创建时间：2018年4月29日 上午9:39:57
* 类说明: 
*/
public class leetcode824_Goat_Latin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(toGoatLatin("I speak Goat Latin"));
	}
	public static String toGoatLatin(String S) {
		String res = "";
		if (S == null || S.length() == 0) {
			return res;
		}
		String[] strArray = S.split(" ");
		StringBuilder builder = new StringBuilder();
		for (int i = 1; i <= strArray.length; i++) {
			StringBuilder temp = new StringBuilder(strArray[i - 1]);
			if (temp.charAt(0) == 'a' ||
				temp.charAt(0) == 'e' ||
				temp.charAt(0) == 'i' ||
				temp.charAt(0) == 'o' ||
				temp.charAt(0) == 'u' ||
				temp.charAt(0) == 'A' ||
				temp.charAt(0) == 'E' ||
				temp.charAt(0) == 'I' ||
				temp.charAt(0) == 'O' ||
				temp.charAt(0) == 'U') {
				temp.append("ma");
			}
			else {
				char head = temp.charAt(0);
				temp.deleteCharAt(0);
				temp.append(head + "ma");
			}
			for (int j = 0; j < i; j++) {
				temp.append("a");
			}
			res += temp.toString() + " ";
		}
		res = res.trim();
		return res;
    }
}
