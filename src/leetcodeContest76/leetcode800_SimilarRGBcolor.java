package leetcodeContest76;
/**
* @author 作者 : coderlong
* @version 创建时间：2018年3月18日 上午9:50:17
* 类说明: 
*/
public class leetcode800_SimilarRGBcolor {
	 public static String similarRGB(String color) {
		String s1 = color.substring(1,3);
		String s2 = color.substring(3,5);
		String s3 = color.substring(5,7);
		
		return "#" + max(s1) + max(s2) + max(s3);
	        
	 }
	 public static String max(String string) {
		 int min = Integer.MAX_VALUE;
		 String minstring = "";
		 for (char c = '0'; c <= '9'; c++) {
			 if (Math.abs(Integer.parseInt(string, 16) - Integer.parseInt(c +""+ c, 16)) <= min) {
				 minstring = c +""+ c;
				 min = Math.abs(Integer.parseInt(string, 16) - Integer.parseInt(c +""+ c, 16));
			 }
		 }
		 for (char c = 'a'; c <= 'f'; c++) {
			 if (Math.abs(Integer.parseInt(string, 16) - Integer.parseInt(c +""+ c, 16)) <= min) {
				 min = Math.abs(Integer.parseInt(string, 16) - Integer.parseInt(c +""+ c, 16));
				 minstring = c +""+ c;
				 
			 }
		 }
		 
		 return minstring;
		 
	 }
	 public static void main(String[] args) {
//		System.out.println(Integer.parseInt("09", 16));
//		System.out.println(Integer.parseInt("11", 16));
		 System.out.println(similarRGB("#09f166"));
	}
}
