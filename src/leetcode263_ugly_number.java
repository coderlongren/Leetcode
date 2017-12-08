
public class leetcode263_ugly_number {

	public static void main(String[] args) {
		System.out.println(isUgly(7));
		System.out.println(4>>1);
	}
	
	 public static boolean isUgly(int num) {
	        boolean flag = true;
			 if (num <= 0){
				 return false;
			 }
			 if (num == 1 || num == 2 || num == 3){
				 return true;
			 }
			 for (int i = 2; i <= num; i++){
				 if (num % i == 0 && primeFactor(i)){
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
	 public static boolean primeFactor(int n){
		 for (int i = 2; i <= n - 1; i++){
			 if (n%i == 0){
				 return false;
			 }
		 }
		 return true;
		 
	 }

}
