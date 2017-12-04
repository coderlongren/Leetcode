
public class leetcode231_Power_of_two2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	// the problem is fine by bit operation
	 public boolean isPowerOfTwo(int n) {
		 if (n > 0){
			 if ((n & n-1) == 0){
				 return true;
			 }
			 else {
				 return false;
			 }
		 }
		 else {
			 return false;
		 }
		 
	 }

}
