import com.coderlong.calculate.���ʽ��ֵ.op;

/**
* @author ���� : coderlong
* @version ����ʱ�䣺2017��12��28�� ����12:26:35
* ��˵��:   ��ʱ�Ľⷨ  �������
*/
public class leetcode387_find_unique_character_of_stirng {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = "loveleetcode";
		System.out.println(firstUniqChar(string));
	}
	public static int firstUniqChar(String s) {
	     if (s == null || s.length() == 0){
	    	 return -1;
	     }
	     for (int i = 0; i < s.length(); i++){
	    	 int count = 0;
	    	 for (int j = 0; j < s.length(); j++){
	    		 if (s.charAt(i) == s.charAt(j)){
	    			 count++;
	    		 }
//	    		 if (count == 1){
//	    			 return i;
//	    		 }
	    	 }
	    	 if (count == 1){
    			 return i;
    		 }
	     }
	     return -1;
	 }

}
