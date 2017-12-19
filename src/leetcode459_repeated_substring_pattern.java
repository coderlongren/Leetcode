/**
* @author 作者 : coderlong
* @version 创建时间：2017年12月18日 下午10:40:52
* 类说明: 分割字符串 为
*/
public class leetcode459_repeated_substring_pattern {

	public static void main(String[] args) {
		String str = "abcab";
		System.out.println(str.substring(0, 2));
		System.out.println(repeatedSubstringPattern(str));
	}	
	// 
	public static boolean repeatedSubstringPattern(String s) {
		int len = s.length();
		
		for (int i = len/2; i >= 1; i--){
			// 如果是一个满足条件的子串的话，倍数一定等于 S的长度
			if (len%i == 0){
				int tem = len/i;
				StringBuilder stringBuilder = new StringBuilder();
				for (int j = 0; j < tem; j++){
					stringBuilder.append(s.substring(0, i));
				}
				if (stringBuilder.toString().equals(s)){
					return true;
				}
			}
		}
		
		
		return false;
		
    }
	
}
