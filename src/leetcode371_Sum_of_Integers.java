/**
* @author ���� : coderlong
* @version ����ʱ�䣺2017��12��22�� ����10:24:27
* ��˵��: 
*/
public class leetcode371_Sum_of_Integers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(~2);
		System.out.println(1<<1);
		System.out.println(1>>1);
		System.out.println(getSum(1, 3));
	}
	  public static int getSum(int a, int b) {
		  if (b == 0){
			  return a;
		  }
		  else {
			  System.out.println("a = " + a + "  b = " + b + "");
			  return getSum(a ^ b, (a & b) << 1);
		  }
	        
	    }

}
