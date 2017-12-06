
public class leetcode263_ugly_number {

	public static void main(String[] args) {
		
	}
	
	 public static boolean isUgly(int num) {
	        boolean flag = false;
			 if (num <= 0){
				 return false;
			 }
			 if (num == 1 || num == 2 || num == 3 || num == 5){
				 return true;
			 }
			 for (int i = 2; i <= num - 1; i++){
				 if (num % i == 0){
					 if (i == 2 || i == 3 || i == 5){
						 flag = true;
					 }
					 else {
						 return false;
					 }
				 }
			 }
			 return flag;
	    }

}
