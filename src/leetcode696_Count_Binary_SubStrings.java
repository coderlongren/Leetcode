
public class leetcode696_Count_Binary_SubStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public  static int countBinarySubstrings(String s) {
	  
		 if (s.length() == 0 || s == null){
			 return 0;
		 }
		 int pre = 0;
		 int cur = 1;
		 int count = 0;
		 for (int i = 1; i < s.length(); i++){
			 if (s.charAt(i) == s.charAt(i - 1)){
				 cur++;
			 }
			 else{
				 pre = cur;
				 cur = 1;
			 }
			 
			 if (pre >= cur){
				 count++;
			 }
			 
		 }
		 return count;
	  }
}
