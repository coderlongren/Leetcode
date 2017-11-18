import javax.naming.spi.DirStateFactory.Result;


public class leetcode066_Plus_one {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public static int[] plusOne(int[] digits) {
	     if (digits.length == 0){
	    	 int[] a = {1};
	    	 return a;
	     }
		 
		 int len = digits.length;
		 int carry = 1;
		 for (int i = len - 1; i >= 0; i--){
			 int temp = digits[i];
			 digits[i] = (digits[i] + carry)%10;
			 carry = (carry + temp)/10;
		 }
		 if (carry == 1){
			 int[] result = new int[len + 1];
			 result[0] = 1;
			 for (int i = 1; i < result.length;i++){
				 result[i] = digits[i - 1];
			 }
			 return result;
		 }
		 
		 
		 return digits;
	 }

}
