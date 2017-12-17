package AlgortithmDesign;
/**
* @author 作者 : coderlong
* @version 创建时间：2017年12月17日 上午11:05:27
* 类说明: 
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
