
public class leetcode172_Factorial_trailing_zeroes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(factorial(11));
		System.out.println(trailingZeroes(11));
	}
	// 计算 0的个数 其实就是 2*5，很明显2的数目 远远多于5的个数， 
	// 得到的 注意 25 有两个5 ，125有三个5.。。。。。。。。。。
	 public static int trailingZeroes(int n) {
		 if (n == 0){
			 return 0;
		 }
		 return n/5 + trailingZeroes(n/5);
	 }
	 public static int factorial(int n){
		 if (n == 1){
			 return 1;
		 }
		 return n*factorial(n - 1);
	 }
}
