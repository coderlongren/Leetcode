/**
* @author ���� : coderlong
* @version ����ʱ�䣺2017��12��28�� ����10:55:08
* ��˵��: so easy test  Integer class
*/
public class leetcode405_convert_a_number_to_hexadecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Integer.toHexString(Integer.valueOf("26",10)));
	}
	 public static String toHex(int num) {
	        
		 
		 return Integer.toHexString(Integer.valueOf(num+"",10));
	 }

}
