/**
* @author ���� : coderlong
* @version ����ʱ�䣺2017��12��16�� ����11:33:47
* ��˵��: 
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
	// ˼·���⣬�����Ŀ����bug�� 
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
