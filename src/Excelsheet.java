
public class Excelsheet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(convertToTitle(28));
	}
	 public static String convertToTitle(int n) {
		 if (n < 1){
			 return "";
		 }
		 StringBuilder stringBuilder = new StringBuilder();
	     while (n > 0){
	    	 n--;
	    	 stringBuilder.append((char)('A' + n%26));
	    	 n /= 26;
	     }
	     stringBuilder.reverse();
	     return stringBuilder.toString();
		 
	 }

}
