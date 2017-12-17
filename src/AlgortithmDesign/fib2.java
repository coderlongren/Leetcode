package AlgortithmDesign;
/**
* @author 作者 : coderlong
* @version 创建时间：2017年12月17日 上午11:15:25
* 类说明:  记忆数组形式 时间复杂度为 O（N）
*/
public class fib2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fib(5));
	}
	public static int fib(int n){
		int[] memeber = new int[n + 1];
		return remember(n, memeber);
	}
	public static int remember(int n,int[] memeber){
		if (memeber[n] > 0){
			return memeber[n];
		}
		if (n == 0){
			return 0;
		}
		if (n == 1){
			return 1;
		}
		memeber[n] = remember(n - 1, memeber) + remember(n - 2, memeber);
		return memeber[n];
	}

}
