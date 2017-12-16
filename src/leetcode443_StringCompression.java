/**
* @author 作者 : coderlong
* @version 创建时间：2017年12月16日 上午11:33:47
* 类说明: 
*/
public class leetcode443_StringCompression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] chars = {'a','a','b','b','c'};
		System.out.println(compress(chars));
		for (char c : chars) {
			System.out.print(c + " ");
		}
	}
	// 思路问题，这道题目是有bug的 
	 public static int compress(char[] chars) {
	      int index = 0;
	      int trueIndex = 0;
		 while (index < chars.length){
			 int count = 0;
			 Character currChar = chars[index];
			 while (index < chars.length && chars[index] == currChar){
				 index++;
				 count++;
			 }
			 chars[trueIndex++] = currChar;
			 if (count > 1){
				 for (char c : Integer.toString(count).toCharArray()) {
					chars[trueIndex++] = c;
				}
			 }
			 
		 }
		 return trueIndex;
	 }

}
