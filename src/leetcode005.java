
public class leetcode005 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = "bb";//Expect result is aba
		System.out.println(LongestPalindromicSubString(string));
	}
	//求解
	public static String LongestPalindromicSubString(String string ){
		
		if (string == null || string == ""){
			return "";
		}
		int start = 0;
		int end = 0;
		//回文子串 符合两种情况  "aba" "aabbaa" 
		for (int i = 0; i < string.length() - 1; i++){
			int len1 = longest(string, i, i);
			int len2 = longest(string, i, i + 1);
			int len = Math.max(len1, len2);
			if (end - start +1  < len){
				if (len%2 == 1){
					start = i - (len - 1)/2;
					end = i + (len - 1)/2;
				}
				else {
					start = i - len/2 + 1;
					end = i + len/2;
				}	
				}
			}
		return string.substring(start,end +1);
	}
	public static int longest(String string ,int left,int right) {
		while (left >= 0 && right < string.length() && string.charAt(left) == string.charAt(right) ) {
			left--;
			right++;
			
		}
		return right - left - 1;
	}

}
