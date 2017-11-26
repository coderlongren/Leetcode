
public class leetcode541_reverseString2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	// Java concise solution
	 public static String reverseStr(String s, int k) {
		 // get the length of s
		int len = s.length();
		char[] ca = s.toCharArray();
		for (int left = 0;left < len; left += 2*k){
			
			for (int i = left,j = Math.min(left + k - 1, len - 1);i < j ; i++,j-- ){
				char tmp = ca[i];
                ca[i] = ca[j];
                ca[j] = tmp;
			}
		} 		 
			
		return new String(ca);
	 }

}
