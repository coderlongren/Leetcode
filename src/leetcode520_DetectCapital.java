import java.time.format.FormatStyle;

/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��1��4�� ����10:26:49
* ��˵��: 
*/
public class leetcode520_DetectCapital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String string = "USAasasa";
//		??System.out.println(string.substring(1));
		System.out.println(detectCapitalUse("ssdfsSdfsd"));
	}
	 public static boolean detectCapitalUse(String word) {
		 if (word.equals(word.toUpperCase())){
			 return true;
		 }
		 if (word.equals(word.toLowerCase())){
			 return true;
		 }
		 if (Character.isUpperCase(word.charAt(0)) && word.substring(1).equals(word.substring(1).toLowerCase())){
			 return true;
		 }
		 return false;
	 }
}
