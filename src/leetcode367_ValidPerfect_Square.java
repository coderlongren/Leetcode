/**
* @author ���� : coderlong
* @version ����ʱ�䣺2017��12��22�� ����10:10:58
* ��˵��: 
*/
public class leetcode367_ValidPerfect_Square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(Integer.bitCount((int) Math.sqrt(5)));
//		System.out.println((int)Math.sqrt(5));
		System.out.println(isPerfectSquare(111151122));
	}
	public static boolean isPerfectSquare(int num) {
		
		if (Math.sqrt(num) - (int)Math.sqrt(num) != 0){
			return false;
		}
		else {
			return true;
		}
		
	 }
	public static boolean isPerfectSquare1(int num) {
		return false;
		
	}

}
