
public class leetcode171_excel_sheet_column {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(titleToNumber("Z"));
	}
	public static int titleToNumber(String s) {
//		 if (n < 1){
//			 return "";
//		 }
//		 StringBuilder stringBuilder = new StringBuilder();
//	     while (n > 0){
//	    	 n--;
//	    	 stringBuilder.append((char)('A' + n%26));
//	    	 n /= 26;
//	     }
//	     stringBuilder.reverse();
//	     return stringBuilder.toString();
		int result = 0;
		 for (int i = 0; i < s.length(); i++){
			 result *= 26;
			 result += (Integer)(s.charAt(i) - 'A') + 1;
		 }
		
		return result;
		
	 }


}
