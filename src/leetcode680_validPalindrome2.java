/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��1��17�� ����8:31:11
* ��˵��: 
*/
public class leetcode680_validPalindrome2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abc";
		System.out.println(validPalindrome(s));
	}
	// ����ͨ���������� �м���бȽϣ� ��������˲��ȵ������ �ͼ�¼�µ�ǰ�� i,j �ֱ��Թ� i,j���бȽϣ������������ȣ��ͷ���false
	 public static boolean validPalindrome(String s) {
		 int i;
		 int j;
		 int tempI = 0;
		 int tempJ = 0;
		 int count = 0;
		 for (i = 0,j = s.length() - 1; i < j; i++,j--){
			 if (s.charAt(i) == s.charAt(j)){
				 ;
			 }
			 
			 // ��һ�������˲�ͬ
			 else if (count == 0){
				 count++;
				 tempI = i;
				 tempJ = j;
				 i--; // ������൱�ڣ� i ���䣬��jʡ���ˣ����бȽ� 
			 }
			 // count== 1 ˵�� �����ǵڶ���������ͬ
			 else if (count == 1){
				 count++;
				 i = tempI;
				 j = tempJ;
				 j++;
			 }
			 else {
				 return false;
			 }
		 }
		 return true;
	 }

}
