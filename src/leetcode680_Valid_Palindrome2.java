/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��1��17�� ����4:51:46
* ��˵��:  ��Ȼ����ж� �����ַ��� ��ôɾ��һ���ַ�����ж���
*  ����ǳ�ʱ�� 
*/
public class leetcode680_Valid_Palindrome2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		StringBuilder stringBuilder = new StringBuilder("abcbas");
//		System.out.println(stringBuilder.reverse().toString().equals(stringBuilder.toString()));
		
//		stringBuilder.deleteCharAt(2);
//		System.out.println(stringBuilder.toString());
//		stringBuilder.insert(0, '0');
//		System.out.println(stringBuilder.toString());
		
		String string = "abgcba";
		System.out.println(validPalindrome(string));
		
	}
	public static boolean validPalindrome(String s) {
        StringBuilder stringBuilder = new StringBuilder(s);
        if (stringBuilder.reverse().toString().equals(s)){
        	return true;
        }
        for (int i = 0; i <stringBuilder.length(); i++){
        	char c = stringBuilder.charAt(i);
        	String temp = stringBuilder.deleteCharAt(i).toString();
        	if (temp.equals(new StringBuilder(temp).reverse().toString())){
        		return true;
        	}
        	stringBuilder.insert(i, c);
        }
		return false;
        
        
        
    }

}
