public class leetcode521_Longest_Uncommon_Subsequence2 {

	
	// silly problem who is the contributor fack
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public int findLUSlength(String a, String b) {
	     if (a.equals(b)){
	    	 return -1;
	     }
	     else{
	    	 return Math.max(a.length(), b.length());
	     }
	}

}
