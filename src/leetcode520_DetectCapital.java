import java.time.format.FormatStyle;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年1月4日 下午10:26:49
* 类说明: 
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
