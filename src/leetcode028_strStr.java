
public class leetcode028_strStr {

	public static void main(String[] args) {
		String haystack = "";
		String needle = "";
		System.out.println(strStr(haystack, needle));
	}
	//look my elegant solution
	public  static int strStr(String haystack, String needle) {
		// 最后AC的代码  下一行中的 needle == ""  一直没通过  换成 needle.length() == 0 才AC
		if (haystack == null || needle == null || needle == ""){
			return 0;
		}
		if (needle.length() > haystack.length()){
			return -1;
		}
		
		
		int length = needle.length();
		for (int i = 0; i < haystack.length(); i++){
			if (i + length <= haystack.length()){
				String newString = haystack.substring(i, i + length);
				if (newString.equals(needle)){
					return i;
				}
			}
		}
        return -1;
    }

}
