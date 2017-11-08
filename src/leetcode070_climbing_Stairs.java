
public class leetcode070_climbing_Stairs {

	/** 使用斐波那契数列 解决 会超时 Complexity Analysis = O(2^n) 原因在于 重复计算 
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(climbingStairs(6));
	}
	public static int climbingStairs(int n){
//		
//		if (n <= 0){
//			return -1;
//		}
//		else if (n <= 2){
//			return n;
//		}
		return fib(n);
	}
	public static int fib(int n){
		if (n == 1 || n == 2){
			return n;
		}
		else {
			return fib(n - 1) + fib(n - 2);
		}
	}

}