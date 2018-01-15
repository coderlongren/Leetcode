/**
* @author 作者 : coderlong
* @version 创建时间：2018年1月15日 下午8:56:47
* 类说明: 
*/
public class leetcode633_Sum_of_square_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Math.sqrt(5));
		System.out.println((int)Math.floor(2.5));
		System.out.println(judgeSquareSum(2));
	}
   public static boolean judgeSquareSum(int c) {
	   int left = 0;
	   int right = (int) Math.floor(Math.sqrt(c));
	   
	   while (left <= right){
		   if (left*left + right*right < c){
			   left++;
		   }
		   else if (left*left + right*right > c){
			   right--;
		   }
		   else {
			   return true;
		   }
	   }
	   
	   return false;
        
    }

}
