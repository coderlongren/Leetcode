/**
* @author ���� : coderlong
* @version ����ʱ�䣺2017��12��12�� ����8:27:42
* ��˵��: 
*/
public class leetcode326_Power_of_three {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Math.pow(3, 6));
	}	
	// �Ȼ�� С��integer.MAX_VALUE ��3���������� ���ֵ 
	public static boolean isPowerOfThree(int n) {
		// 1162261467 is 3^19,  3^20 is bigger than int  
	    return ( n>0 &&  1162261467%n==0);
		
    }
}
