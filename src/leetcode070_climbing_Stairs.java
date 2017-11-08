
public class leetcode070_climbing_Stairs {

	/** ʹ��쳲��������� ��� �ᳬʱ Complexity Analysis = O(2^n) ԭ������ �ظ����� 
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