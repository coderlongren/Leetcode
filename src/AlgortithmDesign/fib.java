package AlgortithmDesign;
/**
* @author ���� : coderlong
* @version ����ʱ�䣺2017��12��17�� ����11:05:27
* ��˵��: 
*/
public class fib {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fib1(4));
	}
	public static int fib1(int n){
		
		if (n == 0){
			return 0;
		}
		if (n == 1){
			return 1;
		}
		int one = 1;
		int two = 0;
		int fibNum = 0;
		for (int i = 2; i <= n; i++){
			fibNum = one + two;
			two = one;
			one = fibNum;
		}
		return fibNum;
	}
		

}
