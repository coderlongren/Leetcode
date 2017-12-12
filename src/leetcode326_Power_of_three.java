/**
* @author 作者 : coderlong
* @version 创建时间：2017年12月12日 下午8:27:42
* 类说明: 
*/
public class leetcode326_Power_of_three {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Math.pow(3, 6));
	}	
	// 先获得 小于integer.MAX_VALUE 的3的整数次幂 最大值 
	public static boolean isPowerOfThree(int n) {
		// 1162261467 is 3^19,  3^20 is bigger than int  
	    return ( n>0 &&  1162261467%n==0);
		
    }
}
