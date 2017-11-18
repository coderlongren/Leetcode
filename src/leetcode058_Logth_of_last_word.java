
public class leetcode058_Logth_of_last_word {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(lengthOfLastWord(" hello word "));
	}
	 public static  int lengthOfLastWord(String s) {
		 if (s == null || s.length() == 0){
			 return 0;
		 }
//		 System.out.println(s.length());
		 s = s.trim();
//		 System.out.println(s.length());
//		 System.out.println(s.lastIndexOf(" "));
//		 System.out.println(s.length() - s.lastIndexOf(" "));
		 return s.length() - s.lastIndexOf(" ") - 1;
	  }

}
