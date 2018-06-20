package leetcodeContest88;
/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��6��10�� ����9:33:58
* ��˵��: 
*/
public class leetcode848_Shifting_Letters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String S = "mk";
		int[] shifts = {505870226,437526072};
		System.out.println((505870226 + 437526072)%26);
		System.out.println(shiftingLetters(S, shifts));
		System.out.println('z' - 'u');
		System.out.println((char)('a' + 12 - 1));
		System.out.println(Integer.MAX_VALUE > Math.pow(10, 9));
		System.out.println(Math.pow(10, 9));
	}
	 public static String shiftingLetters(String S, int[] shifts) {
	      long[] shift = new long[S.length()];
	      for (int i = 1; i <= S.length(); i++) {
	    	  for (int j = 0; j < i; j++) {
	    		  shift[j] += shifts[i - 1];
	    	  }
	      }
	      for (int i = 0; i < S.length(); i++) {
	    	  shift[i] %= 26;
	      }
	      StringBuilder stringBuilder = new StringBuilder();
	      for (int i = 0; i < S.length(); i++) {
	    	  char temp = S.charAt(i);
	    	  if ('z' - temp < shift[i]) {
	    		  shift[i] = shift[i] - ('z' - temp) - 1;
	    		  temp = 'a';
	    	  }
	    	  stringBuilder.append((char)(temp + shift[i]));
	      }
		return stringBuilder.toString();
	      
	      
	 }
}
