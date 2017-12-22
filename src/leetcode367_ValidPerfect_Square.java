/**
* @author 作者 : coderlong
* @version 创建时间：2017年12月22日 下午10:10:58
* 类说明: 
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
